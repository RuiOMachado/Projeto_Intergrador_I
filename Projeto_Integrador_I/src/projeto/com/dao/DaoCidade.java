package projeto.com.dao;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import projeto.com.apresentacao.NewLogin;
import projeto.com.config.HibernateUtil;
import projeto.com.negocio.Cidade;
import projeto.com.negocio.Log;

/**
 *
 * @author Douglas
 */
public class DaoCidade {
    
    public static List pesquisaCidade(String cidade) {
        List resultado = null;
        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();

            org.hibernate.Query q = sessao.createQuery("from Cidade where upper(descricao) LIKE upper('%" + cidade + "%') Order by id");
            resultado = q.list();

        } catch (HibernateException he) {
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro :" + he), 0);
        }
        return resultado;
    }
    
     public static List buscaIdCidade(int id) {
        List resultado = null;
        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();

            org.hibernate.Query q = sessao.createQuery("from Cidade where id = " + id);
            resultado = q.list();

        } catch (Exception ex) {
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro :" + ex), 0);
        }
        return resultado;
    }
     
     public static void listarCidade(JTable jTabela) {
        List resultado = null;

        DefaultTableModel modelo = (DefaultTableModel) jTabela.getModel();
        modelo.setNumRows(0);

        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();

            org.hibernate.Query q = sessao.createQuery("from Cidade order by id");
            resultado = q.list();

            for (Object o : resultado) {
                Cidade cid = (Cidade) o;
                modelo.addRow(new Object[]{
                    cid.getId(), cid.getDescricao(), cid.getRegiao(), cid.getSiglaRegiao(), cid.getPotencialsolar()
                });
            }

        } catch (HibernateException he) {
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro :" + he), 0);
        }
    }
}
