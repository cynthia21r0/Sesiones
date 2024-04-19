/**
 * @autor:Cynthia Janeth Granados Estrada 
 * @category:GDS0624
 */
package mx.utng.sesion26.model.dao;
import java.util.List;
import mx.utng.sesion26.model.entity.Installation;


public interface IInstallationDao {
    List<Installation>list(); 
    void save(Installation installation);
    Installation getById(Long id);
    void delete (Long id);

}
