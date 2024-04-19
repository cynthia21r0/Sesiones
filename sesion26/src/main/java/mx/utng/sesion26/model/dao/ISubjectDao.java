/**
 * @autor:Cynthia Janeth Granados Estrada 
 * @category:GDS0624
 */

package mx.utng.sesion26.model.dao;
import java.util.List;
import mx.utng.sesion26.model.entity.Subject;


public interface ISubjectDao {
    List<Subject>list(); 
    void save(Subject subject);
    Subject getById(Long id);
    void delete (Long id);

}
