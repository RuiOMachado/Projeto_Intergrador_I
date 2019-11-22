package projeto.com.dao;

import java.util.Date;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Session;
import org.hibernate.Transaction;
import projeto.com.apoio.Data;
import projeto.com.apresentacao.NewLogin;
import projeto.com.config.HibernateUtil;
import projeto.com.negocio.Auditoria;
import projeto.com.negocio.Log;
import projeto.com.negocio.Login;
import projeto.com.negocio.Material;
import projeto.com.negocio.Parametro;

/**
 *
 * @author Douglas
 */
public class DaoAuditoria {

    public static boolean saveAuditoria(String classe, String dadoNovo, String dadoOld, int id, String tipo) {
        boolean retorno = true;
        Session sessao = null;

        Auditoria aud = new Auditoria(classe, String.valueOf(id), NewLogin.usuarioLogado.getNome(), "INCLUIR", dadoNovo);
        try {

            sessao = HibernateUtil.getSessionFactory().openSession();
            Transaction t = sessao.beginTransaction();

            if (DaoAuditoria.buscaStatus() == true) {
                if (id == 0) {
                    sessao.save(aud);
                } else {
                    if (tipo.equals("EDITAR")) {
                        aud.setClasse(classe);
                        aud.setidDado(String.valueOf(id));
                        aud.setTipo("EDITAR");
                        aud.setContent(dadoOld);
                        aud.setContentOld(dadoNovo);
                    } else if (tipo.equals("DELETAR")) {
                        aud.setUsuario(NewLogin.usuarioLogado.getNome());
                        aud.setClasse(classe);
                        aud.setidDado(String.valueOf(id));
                        aud.setDataEntrada(new Date());
                        aud.setTipo("DELETAR");
                        aud.setContent(dadoNovo);
                        aud.setContentOld("");
                    }
                    sessao.merge(aud);
                }
                t.commit();
            }
        } catch (Exception ex) {
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro :" + ex), 0);
            retorno = false;
        } finally {
            sessao.close();
        }
        return retorno;
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
                    aud.getId(), aud.getUsuario(), aud.getClasse(), aud.getidDado(), Data.formatarData(aud.getDataEntrada()), aud.getTipo(), aud.getContentOld(), aud.getContent()
                });
            }

        } catch (Exception ex) {
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro :" + ex), 0);
        }
    }

    public static void buscarAuditoria(JTable jTabela, String usuario, String classe, String idDado, String dataIni, String dataFim) {
        List resultado = null;
        System.out.println("ENTROUU AQUI");
        DefaultTableModel modelo = (DefaultTableModel) jTabela.getModel();
        modelo.setNumRows(0);

        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();

            org.hibernate.Query q = sessao.createQuery("from Auditoria where upper(usuario) LIKE upper('%" + usuario + "%') AND upper(classe) LIKE upper('%" + classe + "%') AND upper(iddado) = upper('" + idDado + "') AND dataentrada >=  '"+dataIni+"' AND dataentrada < '"+dataFim+"'");
            resultado = q.list();
            modelo.setNumRows(0);
            for (Object o : resultado) {
                Auditoria aud = (Auditoria) o;
                modelo.addRow(new Object[]{
                    aud.getId(), aud.getUsuario(), aud.getClasse(), aud.getidDado(), aud.getDataEntrada(), aud.getTipo(), aud.getContentOld(), aud.getContent()
                });
            }

        } catch (Exception ex) {
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro :" + ex), 0);
        }
    }
    
    public static void buscarAuditoriaData(JTable jTabela, String dataIni, String dataFim) {
        List resultado = null;
        DefaultTableModel modelo = (DefaultTableModel) jTabela.getModel();
        modelo.setNumRows(0);

        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();

            org.hibernate.Query q = sessao.createQuery("from Auditoria where dataentrada >=  '"+dataIni+"' AND dataentrada < '"+dataFim+"'");
            resultado = q.list();
            modelo.setNumRows(0);
            for (Object o : resultado) {
                Auditoria aud = (Auditoria) o;
                modelo.addRow(new Object[]{
                    aud.getId(), aud.getUsuario(), aud.getClasse(), aud.getidDado(), aud.getDataEntrada(), aud.getTipo(), aud.getContentOld(), aud.getContent()
                });
            }

        } catch (Exception ex) {
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro :" + ex), 0);
        }
    }

    public static boolean buscaStatus() {
        Session sessao = null;
        List resultado = null;
        boolean rest = false;

        sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction t = sessao.beginTransaction();

        org.hibernate.Query q = sessao.createQuery("from Parametro WHERE descricao = 'auditoria'");
        resultado = q.list();

        for (Object o : resultado) {
            Parametro par = (Parametro) o;
            rest = par.getEstado();
        }
        return rest;
    }

    public static void atualizaStatus(boolean status) {
        Session sessao = null;
        List resultado = null;
        Parametro par = null;
        sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction t = sessao.beginTransaction();

        org.hibernate.Query q = sessao.createQuery("from Parametro WHERE descricao = 'auditoria'");
        resultado = q.list();

        for (Object o : resultado) {
            par = (Parametro) o;
            par.setEstado(status);
        }
        sessao.merge(par);
        t.commit();
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
