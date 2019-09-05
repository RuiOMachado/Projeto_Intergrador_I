package projeto.com.dao;

import java.util.List;
import org.hibernate.Session;
import projeto.com.apresentacao.NewLogin;
import projeto.com.config.HibernateUtil;
import projeto.com.negocio.Log;


/**
 *
 * @author Douglas
 */
public class DaoPermissao{

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
    
    ///id user, 
    
    
}
