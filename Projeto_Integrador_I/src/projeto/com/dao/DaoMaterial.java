package projeto.com.dao;
import com.sun.jndi.ldap.Connection;
import java.sql.SQLException;
import java.util.HashMap;
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
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JRViewer;
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

            org.hibernate.Query q = sessao.createQuery("from Material order by id");
            resultado = q.list();

            for (Object o : resultado) {
                Material mat1 = (Material) o;
                modelo.addRow(new Object[]{
                    mat1.getId(), mat1.getDescricao(), mat1.getCor(), mat1.getCondutividade(), mat1.getEspessura(), mat1.getDencidade(), mat1.getCalor(), mat1.getResistencia()
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

    public static List pesquisaMaterial(String material) {
        List resultado = null;
        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();

            org.hibernate.Query q = sessao.createQuery("from Material where upper(descricao) LIKE upper('%" + material + "%') Order by id");
            resultado = q.list();

        } catch (HibernateException he) {
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro :" + he), 0);
        }
        return resultado;
    }

    public static List pesquisaRelatorioMaterial(String material, String cor) {
        List resultado = null;
        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();

            org.hibernate.Query q = sessao.createQuery("from Material ");//where upper(descricao) LIKE upper('%" + material + "%') AND upper (cor) LIKE upper('" + cor + "') Order by descricao");
            resultado = q.list();

            System.out.println("RETORNO " + resultado.toString());

        } catch (HibernateException he) {
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro :" + he), 0);
        }
        return resultado;
    }

    public static Material buscarIdMaterial(int id) {
        Material material = null;
        List resultado = null;
        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();

            org.hibernate.Query q = sessao.createQuery("from Material where id = " + id);
            resultado = q.list();

        } catch (Exception ex) {
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro :" + ex), 0);
        }
        return material;
    }

    

    public void geraRelatorio(String material, String cor) throws JRException, SQLException {

        try {
            // Compila o relatorio
            System.out.println("ENTRO AQUI");
            List materialLista = pesquisaRelatorioMaterial(material, cor);
            System.out.println();
            JRBeanCollectionDataSource bc = new JRBeanCollectionDataSource(materialLista);
            //JasperReport relatorio = (JasperReport) JRLoader.loadObject(getClass().getClassLoader().getResource("/projeto/com/relatorio/RMateriais.jasper"));
            JasperReport relatorio = JasperCompileManager.compileReport(getClass().getResourceAsStream("/projeto/com/relatorio/rel_audit_geral.jrxml"));
            // Mapeia campos de parametros para o relatorio, mesmo que nao existam
            
            java.util.Map parametros = new HashMap();

            // Executa relatoio
            JasperPrint impressao = JasperFillManager.fillReport(relatorio, parametros, bc);

            // Exibe resultado em video
            JasperViewer.viewReport(impressao, false);
            //JRViewer viewer = new JRViewer(impressao);
            //JasperExportManager.exportReportToPdfFile(impressao,"projeto/com/relatorio/RelatorioUser.pdf");
        } catch (Exception e) {
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro :" + e), 0);
        }
    }

}
