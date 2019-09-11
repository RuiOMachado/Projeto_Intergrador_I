package projeto.com.dao;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;
import org.hibernate.Session;
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
        String estado = "A";
        DefaultTableModel modelo = (DefaultTableModel) jTabela.getModel();
        modelo.setNumRows(0);

        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();

            org.hibernate.Query q = sessao.createQuery("from Login where estado = '" + estado + "' order by id");
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
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro :" + he), 0);
        }
        return resultado;
    }
       
    public static Login buscaLogin(String nome) {
        List resultado = null;
        Login log = new Login();
        try {

            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();

            org.hibernate.Query q = sessao.createQuery("from Login where nome = '" + nome + "'");
            resultado = q.list();
            
            for (Object o : resultado) {
                log = (Login) o;
                log.getId();
                log.getNome();
                log.getTipo();
                log.getSenha();
                log.getEstado();
            }
            sessao.close();
        } catch (HibernateException he) {
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro :" + he), 0);
        }
        return log;
    }
    
    public static List pesquisaLogin(String login, String estado){
        List resultado = null;
         try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();

            org.hibernate.Query q = sessao.createQuery("from Login where upper(nome) LIKE upper('%" + login + "%') AND estado ='" +estado+ "'  Order by id");
            resultado = q.list();
            
            
        } catch (HibernateException he) {
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro :" + he), 0);
        }
         return resultado;
    }
    
    public static Login ultimoLogin(){
        Login log = new Login();
        List resultado = null;
        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();

            org.hibernate.Query q = sessao.createQuery("from Login");
           
            resultado = q.list();
            for (Object o : resultado) {
                log = (Login) o;
                log.getId();
            }
        } catch (HibernateException he) {
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro ultimo login :" + he), 0);
        }
         return log;
    }
}
