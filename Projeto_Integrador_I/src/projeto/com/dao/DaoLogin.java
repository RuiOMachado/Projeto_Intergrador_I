package projeto.com.dao;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import projeto.com.apresentacao.NewLogin;
import projeto.com.config.HibernateUtil;
import projeto.com.negocio.Log;
import projeto.com.negocio.Login;

/**
 *
 * @author Douglas
 */
public class DaoLogin {

    public static void listarLogin(JTable jTabela) {
        List resultado = null;

        DefaultTableModel modelo = (DefaultTableModel) jTabela.getModel();
        modelo.setNumRows(0);

        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();

            org.hibernate.Query q = sessao.createQuery("from Login order by id");
            resultado = q.list();
            modelo.setNumRows(0);
            for (Object o : resultado) {
                Login log = (Login) o;
                modelo.addRow(new Object[]{
                    log.getId(), log.getNome(), log.getEstado()
                });
            }

        } catch (HibernateException he) {
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro :" + he), 0);
        }
    }

    public static List buscaIdLogin(int id) {
        List resultado = null;
        
        try {

            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();

            org.hibernate.Query q = sessao.createQuery("from Login where id = " + id);
            resultado = q.list();
        } catch (HibernateException he) {
            he.printStackTrace();
        }
        return resultado;
    }
    
    public static List pesquisaLogin(String login){
        List resultado = null;
         try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();

            org.hibernate.Query q = sessao.createQuery("from Login where upper(nome) LIKE upper('%" + login + "%') Order by id");
            resultado = q.list();
            
            
        } catch (HibernateException he) {
            he.printStackTrace();
        }
         return resultado;
    }
}
