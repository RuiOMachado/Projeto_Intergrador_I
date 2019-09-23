package projeto.com.dao;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import projeto.com.apresentacao.NewLogin;
import projeto.com.config.HibernateUtil;
import projeto.com.negocio.Log;

/**
 *
 * @author Douglas
 */
public class DaoItemCalculo {
    
    public static void listarItemCalculo(JTable jTabela, int id) {
        List resultado = null;

        DefaultTableModel modelo = (DefaultTableModel) jTabela.getModel();
        modelo.setNumRows(0);

        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            org.hibernate.Query q = sessao.createQuery("from ItemCalculo where id_calculo = "+id+"order by id");
            resultado = q.list();

            for (Object o : resultado) {
               // ItemCalculo item = (ItemCalculo) o;
               // modelo.addRow(new Object[]{
                //    item.getId(), item.getIdMaterial().getId(), item.getIdMaterial().getDescricao(), item.getIdMaterial().getResistencia()
              //  });
            }

        } catch (HibernateException he) {
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro :" + he), 0);
        }
    }
}
