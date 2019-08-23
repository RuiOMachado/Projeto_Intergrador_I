package projeto.com.negocio;

/**
 *
 * @author Douglas
 */
//interface generica DAO
public interface InterfaceDao {
    
    public boolean saveOrUpdate(Object obj);
    public boolean remove(Object obj);
    public Object findAll();
}
