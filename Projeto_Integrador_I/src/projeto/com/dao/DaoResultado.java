package projeto.com.dao;

import java.util.List;
import org.hibernate.Session;
import projeto.com.apresentacao.NewLogin;
import projeto.com.config.HibernateUtil;
import projeto.com.negocio.Log;
import projeto.com.negocio.Resultado;

/**
 *
 * @author Douglas
 */
public class DaoResultado {
    
    public static boolean buscarIdAmbiente(String idAmbiente) {
        List resultado = null;
        boolean ok = false;
        
        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();

            org.hibernate.Query q = sessao.createQuery("from Resultado where id_ambiente = "+idAmbiente+"");
            resultado = q.list();
            
            if(resultado != null){
                ok = true;
            }

        } catch (Exception ex) {
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro :" + ex), 0);
        }
        return ok ;
    }
    
    public static Resultado buscarResultado(String idAmbiente) {
        List resultado = null;
        Resultado r = new Resultado();
        
        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();

            org.hibernate.Query q = sessao.createQuery("from Resultado where id_ambiente = "+idAmbiente+"");
            resultado = q.list();
            
            for (Object o : resultado) {
                r = (Resultado) o;
                r.getId();
                r.getBtu();
                r.getCarga();
                r.getIdAmbiente();
            }
            sessao.close();

        } catch (Exception ex) {
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro :" + ex), 0);
        }
        return r ;
    }

}