package projeto.com.dao;

import java.util.Date;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Session;
import org.hibernate.Transaction;
import projeto.com.apresentacao.NewLogin;
import projeto.com.config.HibernateUtil;
import projeto.com.negocio.Auditoria;
import projeto.com.negocio.Log;

/**
 *
 * @author Douglas
 */
public class DaoAuditoria {
    
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
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro :" + ex), 0);
        }
    }
    
    public static void buscarAuditoria(JTable jTabela, String usuario, String classe, String idDado){//, String dataIni, String dataFim) {
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
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro :" + ex), 0);
        }
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
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro :" + ex), 0);
            retorno = false;
        } finally {
            sessao.close();
        }
        return retorno;
    }
}
