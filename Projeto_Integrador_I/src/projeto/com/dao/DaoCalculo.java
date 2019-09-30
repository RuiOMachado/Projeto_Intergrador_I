package projeto.com.dao;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import projeto.com.apresentacao.NewLogin;
import projeto.com.config.HibernateUtil;
import projeto.com.negocio.ItemMaterial;
import projeto.com.negocio.Log;

/**
 *
 * @author Douglas
 */
public class DaoCalculo {

    public static void listarItemMaterial(JTable jTabela, int idFace) {
        List resultado = null;

        DefaultTableModel modelo = (DefaultTableModel) jTabela.getModel();
        modelo.setNumRows(0);

        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            org.hibernate.Query q = sessao.createQuery("from ItemMaterial where idFace = " + idFace + "order by id");
            resultado = q.list();

            for (Object o : resultado) {
                ItemMaterial item = (ItemMaterial) o;
                modelo.addRow(new Object[]{
                    item.getId(), item.getIdMaterial().getId(), item.getIdMaterial().getDescricao(), item.getResistencia()
                });
            }

        } catch (HibernateException he) {
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro :" + he), 0);
        }
    }

    public static void calcularRt(int idFace, int idProjeto) {

    }
}
