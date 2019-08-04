package projeto.com.apoio;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Douglas
 */
public class ConnectionFactory {

    private static final EntityManagerFactory factory = Persistence.createEntityManagerFactory("dao-generico");

    public static EntityManager getEntityManager() {
        return factory.createEntityManager();
    }
}
