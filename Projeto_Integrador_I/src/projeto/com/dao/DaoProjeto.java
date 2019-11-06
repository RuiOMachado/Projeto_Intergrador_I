package projeto.com.dao;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import projeto.com.apresentacao.NewLogin;
import projeto.com.config.HibernateUtil;
import projeto.com.negocio.Ambiente;
import projeto.com.negocio.Calculo;
import projeto.com.negocio.Face;
import projeto.com.negocio.Log;
import projeto.com.negocio.Projeto;

/**
 *
 * @author Douglas
 */
public class DaoProjeto {

    public static void listarProjeto(JTable jTabela) {
        List resultado = null;

        DefaultTableModel modelo = (DefaultTableModel) jTabela.getModel();
        modelo.setNumRows(0);

        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();

            org.hibernate.Query q = sessao.createQuery("from Projeto where estado = 'Andamento' order by id");
            resultado = q.list();

            for (Object o : resultado) {
                Projeto pro = (Projeto) o;
                modelo.addRow(new Object[]{
                    pro.getId(), pro.getDescricao(), pro.getNomecliente(), pro.getEstado()
                });
            }

        } catch (HibernateException he) {
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro :" + he), 0);
        }
    }

    public static List buscaIdProjeto(int id) {
        List resultado = null;
        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();

            org.hibernate.Query q = sessao.createQuery("from Projeto where id = " + id);
            resultado = q.list();

        } catch (Exception ex) {
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro :" + ex), 0);
        }
        
        return resultado;
    }

    public static void criarAmbiente(String descricaoProjeto, int qnt, int idProjeto, int id, int qntAnterior) {

        Ambiente ambiente = new Ambiente();
        //qnt = qntAnterior - qnt;
        System.out.println("qtd "+qnt);
        System.out.println("anterior "+qntAnterior);
        for (int i = 0; i < qnt; i++) {
            ambiente.setDescricao(descricaoProjeto + " - Comodo - " + i);
            ambiente.setId_projeto(idProjeto);
            DaoGenerico.saveOrUpdate(ambiente, id);
            System.out.println("criou comodo " + i);
        }
    }

    public static void listarAmbiente(JTable jTabela, int idProjeto) {
        List resultado = null;

        DefaultTableModel modelo = (DefaultTableModel) jTabela.getModel();
        modelo.setNumRows(0);

        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();

            org.hibernate.Query q = sessao.createQuery("from Ambiente where id_projeto = " + idProjeto + " order by id");
            resultado = q.list();

            for (Object o : resultado) {
                Ambiente pro = (Ambiente) o;
                modelo.addRow(new Object[]{
                    pro.getId(), pro.getDescricao(), pro.getId_projeto()
                });
            }

        } catch (HibernateException he) {
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro :" + he), 0);
        }
    }

    public static void listarFace(JTable jTabela, int idAmbiente) {
        List resultado = null;

        DefaultTableModel modelo = (DefaultTableModel) jTabela.getModel();
        modelo.setNumRows(0);

        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();

            org.hibernate.Query q = sessao.createQuery("from Face where id_ambiente = " + idAmbiente + " order by id");
            resultado = q.list();

            for (Object o : resultado) {
                Face pro = (Face) o;
                modelo.addRow(new Object[]{
                    pro.getId(), pro.getNome(), pro.getTipo(), pro.getId_ambiente()
                });
            }

        } catch (HibernateException he) {
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro :" + he), 0);
        }
    }
    
    public static void listarCalculo(JTable jTabela, int idProjeto, int idAmbiente, int idFace) {
        List resultado = null;

        DefaultTableModel modelo = (DefaultTableModel) jTabela.getModel();
        modelo.setNumRows(0);

        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();

            org.hibernate.Query q = sessao.createQuery("from Calculo where idProjeto = " + idProjeto + " AND idAmbiente = " + idAmbiente + "AND idFace = " + idFace + "   order by id");
            resultado = q.list();

            for (Object o : resultado) {
                Calculo pro = (Calculo) o;
                modelo.addRow(new Object[]{
                    pro.getId(), pro.getIdProjeto().getDescricao(), pro.getTipo(), pro.getIdAmbiente().getId(), pro.getQfo(), pro.getQft()
                });
            }

        } catch (HibernateException he) {
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro :" + he), 0);
        }
    }

}
