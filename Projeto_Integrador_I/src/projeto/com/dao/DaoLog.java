package projeto.com.dao;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Session;
import org.hibernate.Transaction;
import projeto.com.apresentacao.NewLogin;
import projeto.com.config.HibernateUtil;
import projeto.com.negocio.Log;

/**
 *
 * @author Douglas
 */
public class DaoLog {
    
    public static void saveLog(Object obj, int id) {
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
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro :" + ex), 0);
        } finally {
            sessao.close();
        }
    }
    
    public static void listarLogs(JTable jTabela) {
        List resultado = null;

        DefaultTableModel modelo = (DefaultTableModel) jTabela.getModel();
        modelo.setNumRows(0);

        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();

            org.hibernate.Query q = sessao.createQuery("from Log");
            resultado = q.list();
            modelo.setNumRows(0);
            for (Object o : resultado) {
                Log log = (Log) o;
                modelo.addRow(new Object[]{
                    log.getId(), log.getUsuario(), log.getDataEntrada(), log.getDescricao()
                });
            }

        } catch (Exception ex) {
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro :" + ex), 0);
        }
    }
}
