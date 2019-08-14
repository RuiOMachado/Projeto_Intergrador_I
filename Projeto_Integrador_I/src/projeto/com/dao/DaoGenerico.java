package projeto.com.dao;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import projeto.com.config.HibernateUtil;
import projeto.com.negocio.Login;

/**
 *
 * @author Douglas
 */
public class DaoGenerico {

    public static boolean saveOrUpdate(Object obj, int id) {
        boolean retorno = true;
        Session sessao = null;

        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            Transaction t = sessao.beginTransaction();

            if (id == 0) {
                sessao.save(obj);
            } else {
                sessao.update(obj);
            }
            t.commit();

        } catch (Exception ex) {
            sessao.getTransaction().rollback();
            System.out.println("erro" + ex);
            retorno = false;
        } finally {
            sessao.close();
        }
        return retorno;
    }

    public static void listarLogin(JTable jTabela) {
       List resultado = null;

        DefaultTableModel modelo = (DefaultTableModel) jTabela.getModel();
        modelo.setNumRows(0);

        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();

            org.hibernate.Query q = sessao.createQuery("from Login");
            resultado = q.list();
                modelo.setNumRows(0);
                for (Object o : resultado) {
                    Login log = (Login) o;
                    modelo.addRow(new Object[]{
                        log.getId(), log.getNome(), log.getEstado()
                    });
                }
            

        } catch (HibernateException he) {
            he.printStackTrace();
        }
    }
}
