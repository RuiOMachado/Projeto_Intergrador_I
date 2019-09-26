package projeto.com.dao;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.JComboBox;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import projeto.com.apoio.ComboItem;
import projeto.com.apresentacao.NewLogin;
import projeto.com.config.HibernateUtil;
import projeto.com.negocio.Log;
/**
 *
 * @author pretto
 */
public class CombosDAO {

    ResultSet resultado = null;

    // construtor 1
    public void popularCombo(String tabela, JComboBox combo) {
        List resultado = null;
        combo.removeAllItems();

        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();

            org.hibernate.Query q = sessao.createQuery("from "+tabela+"");
            resultado = q.list();

            for (Object o : resultado) {
                ComboItem item = (ComboItem) o;
                combo.addItem(item);
            }

        } catch (HibernateException he) {
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro :" + he), 0);
        }
    }

}
