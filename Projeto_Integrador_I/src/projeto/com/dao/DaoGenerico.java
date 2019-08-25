package projeto.com.dao;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import projeto.com.apresentacao.NewLogin;
import projeto.com.config.HibernateUtil;
import projeto.com.negocio.Auditoria;
import projeto.com.negocio.Log;
import projeto.com.negocio.Login;
import projeto.com.negocio.Material;

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

    public static void listarAuditoria(JTable jTabela) {
        List resultado = null;

        DefaultTableModel modelo = (DefaultTableModel) jTabela.getModel();
        modelo.setNumRows(0);

        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();

            org.hibernate.Query q = sessao.createQuery("from Auditoria");
            resultado = q.list();
            modelo.setNumRows(0);
            for (Object o : resultado) {
                Auditoria aud = (Auditoria) o;
                modelo.addRow(new Object[]{
                    aud.getId(), aud.getUsuario(), aud.getClasse(), aud.getidDado(), aud.getDataEntrada(), aud.getTipo(), aud.getContentOld(), aud.getContent()
                });
            }

        } catch (Exception ex) {
            System.out.println("" + ex);
        }
    }

    public static void listarAuditoria(JTable jTabela, String usuario, String classe, String idDado){//, String dataIni, String dataFim) {
        List resultado = null;
        System.out.println("ENTROUU AQUI");
        DefaultTableModel modelo = (DefaultTableModel) jTabela.getModel();
        modelo.setNumRows(0);

        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();

            org.hibernate.Query q = sessao.createQuery("from Auditoria where upper(usuario) LIKE upper('%" +usuario+ "%') AND upper(classe) LIKE upper('%" +classe+"%') AND upper(iddado) = upper('" +idDado+ "')");
                   // + "AND data_entrada >= timestamp '"+dataIni+" 00:00:00'"
                    //+ "  and data_entrada < timestamp '"+dataFim+" 00:00:00'");
            resultado = q.list();
            modelo.setNumRows(0);
            for (Object o : resultado) {
                Auditoria aud = (Auditoria) o;
                modelo.addRow(new Object[]{
                    aud.getId(), aud.getUsuario(), aud.getClasse(), aud.getidDado(), aud.getDataEntrada(), aud.getTipo(), aud.getContentOld(), aud.getContent()
                });
            }

        } catch (Exception ex) {
            System.out.println("" + ex);
        }
    }

    public static String idDados(String classe) {
        Session sessao = null;
        List resultado = null;
        String retorno = "";
        sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction t1 = sessao.beginTransaction();

        if (classe.equals("Usuario")) {
            org.hibernate.Query q1 = sessao.createQuery("from Login");
            resultado = q1.list();

            for (Object o : resultado) {
                Login log = (Login) o;
                retorno = String.valueOf(log.getId());
            }
        } else if (classe.equals("Material")) {
            org.hibernate.Query q1 = sessao.createQuery("from Material");
            resultado = q1.list();

            for (Object o : resultado) {
                Material mat = (Material) o;
                retorno = String.valueOf(mat.getId());
            }
        }
        return retorno;
    }

}
