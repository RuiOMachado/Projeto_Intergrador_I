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
                saveLog(new Log(NewLogin.usuarioLogado.getNome(),"Registro "+obj.getClass()+" salvo com sucesso!"),0);
            } else {
                sessao.update(obj);
                saveLog(new Log(NewLogin.usuarioLogado.getNome(),"Registro "+obj.getClass()+" editado com sucesso!"),0);
            }
            t.commit();

        } catch (Exception ex) {
            sessao.getTransaction().rollback();
            System.out.println("erro" + ex);
            saveLog(new Log(NewLogin.usuarioLogado.getNome(),"Erro "+ex+" no objeto "+obj.getClass()+"!"),0);
            retorno = false;
        } finally {
            sessao.close();
        }
        return retorno;
    }
    
    public static boolean saveAuditoria(String dadoNovo, int id) {
        boolean retorno = true;
        Session sessao = null;
        Auditoria aud = new Auditoria(NewLogin.usuarioLogado.getNome(),"INCLUIR",dadoNovo);  
        //Rui
        //if(Fazer aqui um metodo para verificar se o ultimo registro (estado) da tabela (auditoria) é "I")
        //se caso consulta for I = inativo, não entra no try catch
        ///se o ultimo registro for A = ativo, deixar entrar no try catch, continuando assim gravando as informações na table auditoria
        ///essa seria a mudança de estado. AUDITORIA ON OU OFF
        //a auditoria já está sendo ativada e desativado na tela da auditoria - está ok, funcionando
        try {
            
            sessao = HibernateUtil.getSessionFactory().openSession();
            Transaction t = sessao.beginTransaction();

            if (id == 0) {
                sessao.save(aud); //ok
            } else {
                aud.setId(id);
                aud.setTipo("EDITAR");
                aud.setContent(dadoNovo);
                sessao.merge(aud);
                System.out.println("editou");
                System.out.println("id up"+aud.getId());
            }
            t.commit();

        } catch (Exception ex) {
            System.out.println("Erro "+ex);
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
                    aud.getId(), aud.getUsuario(), aud.getDataEntrada(), aud.getTipo(), aud.getContentOld(), aud.getContent()
                });
            }

        } catch (Exception ex) {
            System.out.println("" + ex);
        }
    }
}
