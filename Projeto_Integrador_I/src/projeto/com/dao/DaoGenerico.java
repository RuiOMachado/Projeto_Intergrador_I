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
public class DaoGenerico{

    //metodo salvar ou editar generico para tds as classe
    //Em toda chamada do metodo o log e gravado automaticamente no banco de dados
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
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro " + ex + " no objeto " + obj.getClass() + "!"), 0);
            retorno = false;
        } finally {
            sessao.close();
        }
        return retorno;
    }

    public static boolean delete(Object obj) {
        boolean retorno = true;
        Session ses = null;
        try {
            ses = HibernateUtil.getSessionFactory().openSession();
            Transaction t = ses.beginTransaction();
            ses.delete(obj);

            t.commit();

        } catch (Exception ex) {
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro :" + ex), 0);
            retorno = false;
        } finally {
            ses.close();
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
            System.out.println("" + ex);
        }
    }



}
