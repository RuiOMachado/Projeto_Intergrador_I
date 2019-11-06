package projeto.com.dao;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import projeto.com.apresentacao.NewLogin;
import projeto.com.config.HibernateUtil;
import projeto.com.negocio.Log;
import projeto.com.negocio.Material;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;


/**
 *
 * @author Douglas
 */
public class DaoMaterial {

    public static void listarMaterial(JTable jTabela) {
        List resultado = null;

        DefaultTableModel modelo = (DefaultTableModel) jTabela.getModel();
        modelo.setNumRows(0);

        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();

            org.hibernate.Query q = sessao.createQuery("from Material order by descricao");
            resultado = q.list();

            for (Object o : resultado) {
                Material mat = (Material) o;
                modelo.addRow(new Object[]{
                    mat.getId(), mat.getDescricao(), mat.getClasse(), mat.getCondutividade(), mat.getCalor(), mat.getFatorsolar()
                });
            }

        } catch (HibernateException he) {
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro :" + he), 0);
        }
    }
    
    public static void listarMaterialDlg(JTable jTabela, String classe1, String classe2) {
        List resultado = null;

        DefaultTableModel modelo = (DefaultTableModel) jTabela.getModel();
        modelo.setNumRows(0);

        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();

            org.hibernate.Query q = sessao.createQuery("from Material where classe = '" + classe1 +"' or classe = '" + classe2 +"' order by descricao");
            resultado = q.list();

            for (Object o : resultado) {
                Material mat = (Material) o;
                modelo.addRow(new Object[]{
                    mat.getId(), mat.getDescricao(), mat.getClasse(), mat.getCondutividade(), mat.getCalor(), mat.getFatorsolar()
                });
            }

        } catch (HibernateException he) {
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro :" + he), 0);
        }
    }

    public static List buscaIdMaterial(int id) {
        List resultado = null;
        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();

            org.hibernate.Query q = sessao.createQuery("from Material where id = " + id);
            resultado = q.list();

        } catch (Exception ex) {
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro :" + ex), 0);
        }
        return resultado;
    }

    public static List pesquisaMaterial(String descricao) {
        List resultado = null;
        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();

            org.hibernate.Query q = sessao.createQuery("from Material where upper(descricao) LIKE upper('%" + descricao + "%') Order by descricao");
            resultado = q.list();

        } catch (HibernateException he) {
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro :" + he), 0);
        }
        return resultado;
    }
    
    public static void pesquisaMaterialDlg(JTable jTabela, String descricao, String classe1, String classe2) {
        List resultado = null;
        DefaultTableModel modelo = (DefaultTableModel) jTabela.getModel();
        modelo.setNumRows(0);
        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            org.hibernate.Query q = sessao.createQuery("from Material where upper(descricao) LIKE upper('%" + descricao + "%') order by descricao");
            //org.hibernate.Query q = sessao.createQuery("from Material where upper(descricao) LIKE upper('%" + descricao + "%') AND classe = '" + classe1 +"' or classe = '" + classe2 +"' order by descricao");
            resultado = q.list();

        for (Object o : resultado) {
                Material mat = (Material) o;
                modelo.addRow(new Object[]{
                    mat.getId(), mat.getDescricao(), mat.getClasse(), mat.getCondutividade(), mat.getCalor(), mat.getFatorsolar()
                });
            }

        } catch (HibernateException he) {
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro :" + he), 0);
        }
    }

    public static List pesquisaRelatorioMaterial(String material, String cor) {
        List resultado = null;
        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();

            org.hibernate.Query q = sessao.createQuery("from Material ");//where upper(descricao) LIKE upper('%" + material + "%') AND upper (cor) LIKE upper('" + cor + "') Order by descricao");
            resultado = q.list();

        } catch (HibernateException he) {
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro :" + he), 0);
        }
        return resultado;
    }

    public static Material buscarIdMaterial(String idMaterial) {
        List resultado = null;
        Material material = new Material();
        int id = Integer.parseInt(idMaterial);
        
        resultado = DaoGenerico.buscaId(id,"Material");

        for (Object o : resultado) {
            Material mat = (Material) o;
            material = mat;
        }
        return material;
    }

    

    public void geraRelatorio(String material, String cor) throws JRException, SQLException {

        try {
            // Compila o relatorio
            List materialLista = pesquisaRelatorioMaterial(material, cor);
            //JasperReport relatorio = (JasperReport) JRLoader.loadObject(getClass().getClassLoader().getResource("/projeto/com/relatorio/RMateriais.jasper"));
            JasperReport relatorio = JasperCompileManager.compileReport(getClass().getResourceAsStream("/projeto/com/relatorio/RelatorioDeMateriais.jrxml"));
            // Mapeia campos de parametros para o relatorio, mesmo que nao existam

            // Executa relatoio
            JasperPrint impressao = JasperFillManager.fillReport(relatorio, null, new JRBeanCollectionDataSource(materialLista));

            // Exibe resultado em video
            JasperViewer.viewReport(impressao, false);
            //JRViewer viewer = new JRViewer(impressao);
            //JasperExportManager.exportReportToPdfFile(impressao,"projeto/com/relatorio/RelatorioUser.pdf");
        } catch (Exception e) {
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro :" + e), 0);
        }
    }

}
