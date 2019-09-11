package projeto.com.dao;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import projeto.com.apresentacao.NewLogin;
import projeto.com.config.HibernateUtil;
import projeto.com.negocio.Componente;
import projeto.com.negocio.Log;
import projeto.com.negocio.Login;
import projeto.com.negocio.Permissao;

/**
 *
 * @author Douglas
 */
public class DaoPermissao {

    ///metodo para verificar ativar e desativar botao
    ///metodo escanear menu
    public static List buscaIdPermissao(int id) {
        List resultado = null;
        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();

            org.hibernate.Query q = sessao.createQuery("from Permissao where id = " + id);
            resultado = q.list();

        } catch (Exception ex) {
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro :" + ex), 0);
        }
        return resultado;
    }

    public static void filtroPermissao(int usuario, int componente, JTable jTabela) {
        List resultado = null;
        DefaultTableModel modelo = (DefaultTableModel) jTabela.getModel();
        modelo.setNumRows(0);

        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            org.hibernate.Query q = sessao.createQuery("from Permissao where id_login = " + usuario + "AND id_componente = " + componente);
            resultado = q.list();

            for (Object o : resultado) {
                Permissao per = (Permissao) o;
                modelo.addRow(new Object[]{
                    per.getId(), per.getIdComponente().getId(), per.getIdLogin().getNome(), per.getIdComponente().getDescricao(), per.getEstado()
                });
            }

            sessao.close();

        } catch (Exception ex) {
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro :" + ex), 0);
        }
    }

    public static void listarPermissao(JTable jTabela) {
        List resultado = null;

        DefaultTableModel modelo = (DefaultTableModel) jTabela.getModel();
        modelo.setNumRows(0);

        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();

            org.hibernate.Query q = sessao.createQuery("from Permissao order by id");
            resultado = q.list();

            for (Object o : resultado) {
                Permissao per = (Permissao) o;
                modelo.addRow(new Object[]{
                    per.getId(), per.getIdComponente().getId(), per.getIdLogin().getNome(), per.getIdComponente().getDescricao(), per.getEstado()
                });
            }

        } catch (HibernateException he) {
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro :" + he), 0);
        }
    }

    public static void inserirPermissaoFull(Login login, String tipo) {
        //obs - pendente
        //metodo recebera o tipo como parametro
        //se for tipo = administrador insere full 
        //se for operador insere permissoes pre definidas
        List resultado = null;
        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();

            org.hibernate.Query q = sessao.createQuery("from Componente");
            resultado = q.list();
            if ("Administrador".equals(tipo)) {
                Permissao per = new Permissao();
                for (Object o : resultado) {
                    Componente com = (Componente) o;
                    com.setId(com.getId());
                    per.setIdLogin(login);
                    per.setIdComponente(com);
                    per.setEstado(true);
                    DaoGenerico.saveOrUpdate(per, 0);
                }

            } else if ("Operador".equals(tipo)) {

            }

        } catch (HibernateException he) {
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro inserir permissao :" + he), 0);
        }
    }

    public static void salvarPermissao(JTable tabela) {
        //recebe a tela como parametro (lá de salvar permissão)

    }

    //metodo insere a permisão de acordo com o usuario, em cada botao
    //metodo verifica a permissao do banco para o componente
    //basta na chamada do metodo colocar o id cadastrado no banco
    public static boolean inserirPermissaoComponente(Login login, int id_comp) {
        Login l = DaoLogin.buscaLogin(login.getNome());
        List resultado = null;
        boolean retorno = false;
        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            org.hibernate.Query q = sessao.createQuery("from Permissao where id_login = '" + l.getId() + "' AND id_componente = '" + id_comp + "'");
            resultado = q.list();

            for (Object o : resultado) {
                Permissao per = (Permissao) o;

                per.getId();
                per.getIdComponente();
                per.getIdLogin();
                per.getEstado();
                retorno = per.getEstado();
            }

        } catch (Exception ex) {
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro :" + ex), 0);
        }
        return retorno;

    }

    private static List buscaIdComponente(int id) {
        List resultado = null;
        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();

            org.hibernate.Query q = sessao.createQuery("from Componente where id = " + id);
            resultado = q.list();

        } catch (Exception ex) {
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro :" + ex), 0);
        }
        return resultado;
    }

}
