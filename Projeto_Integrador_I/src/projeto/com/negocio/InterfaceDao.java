package projeto.com.negocio;

import java.util.List;

/**
 *
 * @author Douglas
 */
//interface generica DAO
public interface InterfaceDao {
    
    public boolean saveOrUpdate(Object obj);
    public boolean remove(Object obj);
    public Object findAll();
    public List findId(int id);
}
