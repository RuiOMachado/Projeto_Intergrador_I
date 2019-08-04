package projeto.com.dao;

import javax.persistence.EntityManager;
import projeto.com.apoio.ConnectionFactory;
import projeto.com.negocio.EntidadeBase;

/**
 *
 * @author Douglas
 * @param <T>
 */
public class DaoGeneric<T extends EntidadeBase> {

    //Exemplo de chamada, entregar objeto carregado
    ///DaoGenerico<Carro> daoCarro = new DaoGenerico<Carro>();
    //carro.setModelo("Mustang");
    //carro.setAnoFabricacao(1989);
    public static final EntityManager manager = ConnectionFactory.getEntityManager();

    public T findById(Class<T> clazz, Long id) {
        return manager.find(clazz, id);
    }

    public void saveOrUpdate(T obj) {
        try {
            manager.getTransaction().begin();
            if (obj.getId() == null) {
                manager.persist(obj);
            } else {
                manager.merge(obj);
            }
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.getTransaction().rollback();
        }
    }

    public void remove(Class<T> clazz, Long id) {
        T t = findById(clazz, id);
        try {
            manager.getTransaction().begin();
            manager.remove(t);
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.getTransaction().rollback();
        }
    }

  
}
