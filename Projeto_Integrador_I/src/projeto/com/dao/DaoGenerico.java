package projeto.com.dao;

import java.util.Date;
import java.util.List;
import javax.swing.JComboBox;
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
public class DaoGenerico {

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
                saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Registro " + obj.getClass() + " salvo com sucesso!"), 0);
            } else {
                sessao.update(obj);
                saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Registro " + obj.getClass() + " editado com sucesso!"), 0);
            }
            t.commit();

        } catch (Exception ex) {
            sessao.getTransaction().rollback();
            System.out.println("erro" + ex);
            saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro " + ex + " no objeto " + obj.getClass() + "!"), 0);
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

            deleteLog(new Log(NewLogin.usuarioLogado.getNome(), "Registro " + obj.getClass() + " excluído com sucesso!"));

            System.out.println(obj.getClass());
            ses.delete(obj);

            t.commit();

        } catch (Exception e) {
            ses.getTransaction().rollback();
            System.out.println("Erro " + e);
            deleteLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro " + e + " no objeto " + obj.getClass() + "!"));
            retorno = false;
        } finally {
            ses.close();
        }
        return retorno;
    }

    public static boolean saveAuditoria(String classe, String dadoNovo, String dadoOld, int id) {
        boolean retorno = true;
        Session sessao = null;
        List resultado = null;
        String rest = "";
        String idDado = idDados(classe);

        Auditoria aud = new Auditoria(classe, String.valueOf(idDado), NewLogin.usuarioLogado.getNome(), "INCLUIR", dadoNovo);
        try {

            sessao = HibernateUtil.getSessionFactory().openSession();
            Transaction t = sessao.beginTransaction();

            org.hibernate.Query q = sessao.createQuery("from Auditoria");
            resultado = q.list();

            for (Object o : resultado) {
                Auditoria aud2 = (Auditoria) o;
                rest = aud2.getEstado();
                idDado = String.valueOf(aud2.getId());
            }
            if (rest.equals("A")) {
                if (id == 0) {
                    sessao.save(aud); //ok
                } else {
                    aud.setClasse(classe);
                    aud.setidDado(String.valueOf(id));
                    aud.setTipo("EDITAR");
                    aud.setContent(dadoOld);
                    aud.setContentOld(dadoNovo);

                    sessao.merge(aud);
                }
                t.commit();
            }
        } catch (Exception ex) {
            System.out.println("Erro " + ex);
            retorno = false;
        } finally {
            sessao.close();
        }
        return retorno;
    }

    public static boolean deleteAuditoria(String classe, String dadoNovo, String dadoOld, int id) {
        boolean retorno = true;
        Session sessao = null;
        List resultado = null;
        String rest = "";
        String idDado = "";

        try {

            sessao = HibernateUtil.getSessionFactory().openSession();
            Transaction t = sessao.beginTransaction();

            org.hibernate.Query q = sessao.createQuery("from Auditoria");
            resultado = q.list();

            for (Object o : resultado) {
                Auditoria aud = (Auditoria) o;
                rest = aud.getEstado();
                idDado = String.valueOf(aud.getId());
            }

            Auditoria aud = new Auditoria();
            if (rest.equals("A")) {
                aud.setUsuario(NewLogin.usuarioLogado.getNome());
                aud.setClasse(classe);
                aud.setidDado(String.valueOf(id));
                aud.setDataEntrada(new Date());
                aud.setTipo("DELETAR");
                aud.setContent(dadoNovo);
                aud.setContentOld(dadoOld);
                aud.setEstado("A");

                sessao.merge(aud);
                t.commit();
            }
        } catch (Exception ex) {
            System.out.println("Erro " + ex);
            retorno = false;
        } finally {
            sessao.close();
        }
        return retorno;
    }

    private static void saveLog(Object obj, int id) {
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
        } finally {
            sessao.close();
        }
    }

    private static void deleteLog(Object obj) {
        Session sessao = null;

        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            Transaction t = sessao.beginTransaction();

            sessao.save(obj);
            t.commit();

        } catch (Exception ex) {
            sessao.getTransaction().rollback();
            System.out.println("erro" + ex);
        } finally {
            sessao.close();
        }
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
            he.printStackTrace();
        }
    }

    public static void listarMaterial(JTable jTabela) {
        List resultado = null;

        DefaultTableModel modelo = (DefaultTableModel) jTabela.getModel();
        modelo.setNumRows(0);

        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();

            org.hibernate.Query q = sessao.createQuery("from Material order by id");
            resultado = q.list();

            for (Object o : resultado) {
                Material mat1 = (Material) o;
                modelo.addRow(new Object[]{
                    mat1.getId(), mat1.getDescricao(), mat1.getQuantidade(), mat1.getLargura(), mat1.getComprimento(), mat1.getAltura()
                });
            }

        } catch (HibernateException he) {
            he.printStackTrace();
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

    public static String statusAuditoria() {
        Session sessao = null;
        List resultado = null;
        String rest = "";

        sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction t = sessao.beginTransaction();

        org.hibernate.Query q = sessao.createQuery("from Auditoria");
        resultado = q.list();

        for (Object o : resultado) {
            Auditoria aud2 = (Auditoria) o;
            rest = aud2.getEstado();
        }
        return rest;
    }

    public static void popularCombo(JComboBox combo) {

        combo.removeAllItems();
        combo.addItem("Usuario");
        combo.addItem("Material");
    }
}
