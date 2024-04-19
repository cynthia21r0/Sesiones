/**
 * @autor:Cynthia Janeth Granados Estrada 
 * @category:GDS0624
 */

package mx.utng.sesion26.model.dao;
import java.util.List;
import mx.utng.sesion26.model.entity.Student;


public interface IStudentDao {
    List<Student>list(); 
    void save(Student student);
    Student getById(Long id);
    void delete (Long id);

}
