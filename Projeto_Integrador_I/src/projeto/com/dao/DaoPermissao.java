package projeto.com.dao;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import projeto.com.apresentacao.NewLogin;
import projeto.com.config.HibernateUtil;
import projeto.com.negocio.Componente;
import projeto.com.negocio.Log;
import projeto.com.negocio.Login;
import projeto.com.negocio.Permissao;

/**
 *
 * @author Douglas
 */
public class DaoPermissao {

    ///metodo para verificar ativar e desativar botao
    ///metodo escanear menu
    public static List buscaIdPermissao(int id) {
        List resultado = null;
        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();

            org.hibernate.Query q = sessao.createQuery("from Permissao where id = " + id);
            resultado = q.list();

        } catch (Exception ex) {
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro :" + ex), 0);
        }
        return resultado;
    }

    public static void listarPermissao(JTable jTabela) {
        List resultado = null;

        DefaultTableModel modelo = (DefaultTableModel) jTabela.getModel();
        modelo.setNumRows(0);

        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();

            org.hibernate.Query q = sessao.createQuery("from Permissao order by id");
            resultado = q.list();

            for (Object o : resultado) {
                Permissao per = (Permissao) o;
                modelo.addRow(new Object[]{
                    per.getId(), per.getIdComponente().getDescricao(), per.getEstado()
                });
            }

        } catch (HibernateException he) {
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro :" + he), 0);
        }
    }

    public static void inserirPermissao(Login login) {
        List resultado = null;
        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();

            org.hibernate.Query q = sessao.createQuery("from Componente");
            resultado = q.list();
            
            Permissao per = new Permissao();
            
            for (Object o : resultado) {
                Componente com = (Componente) o;
                com.setId(com.getId());
                System.out.println(com.getCategoria());
                per.setIdLogin(login);
                per.setIdComponente(com);
                per.setEstado(true);
                
                DaoGenerico.saveOrUpdate(per, 0);
            }
            
            

        } catch (HibernateException he) {
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro inserir permissao :" + he), 0);
        }
    }

}
