package projeto.com.dao;
import org.hibernate.Query;
import org.hibernate.Session;
import projeto.com.config.HibernateUtil;
import projeto.com.negocio.Login;

/**
 *
 * @author Douglas
 */
public class DaoLogin {

    public static boolean findUser(String nome, String senha) {

        HibernateUtil hibernateUtil = new HibernateUtil();
        Session sessao = hibernateUtil.getSession();

        Login login = new Login();
        Query query = sessao.createQuery("from Login where nome ='" +nome+ "' and senha ='" +senha+ "' and estado =A");
        System.out.println("sql" + query);
        if (query == null) {
            return false;
        } else {
            return true;
        }
    }
    
}
