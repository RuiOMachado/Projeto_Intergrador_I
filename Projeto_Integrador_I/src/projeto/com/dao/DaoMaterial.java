package projeto.com.dao;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import projeto.com.apresentacao.NewLogin;
import projeto.com.config.HibernateUtil;
import projeto.com.negocio.Log;
import projeto.com.negocio.Material;

/**
 *
 * @author Douglas
 */
public class DaoMaterial {

    public static void listarMaterial(JTable jTabela) {
        List resultado = null;

        DefaultTableModel modelo = (DefaultTableModel) jTabela.getModel();
        modelo.setNumRows(0);

        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();

            org.hibernate.Query q = sessao.createQuery("from Material order by id");
            resultado = q.list();

            for (Object o : resultado) {
                Material mat1 = (Material) o;
                modelo.addRow(new Object[]{
                    mat1.getId(), mat1.getDescricao(), mat1.getQuantidade(), mat1.getLargura(), mat1.getComprimento(), mat1.getAltura()
                });
            }

        } catch (HibernateException he) {
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro :" + he), 0);
        }
    }

    public static List buscaIdMaterial(int id) {
        List resultado = null;
        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();

            org.hibernate.Query q = sessao.createQuery("from Material where id = " + id);
            resultado = q.list();

        } catch (Exception e) {
        }
        return resultado;
    }

    public static List pesquisaMaterial(String material) {
        List resultado = null;
        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();

            org.hibernate.Query q = sessao.createQuery("from Material where upper(descricao) LIKE upper('%" + material + "%') Order by id");
            resultado = q.list();
            
        } catch (HibernateException he) {
            he.printStackTrace();
        }
        return resultado;
    }
}
