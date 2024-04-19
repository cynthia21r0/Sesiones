/**
 * @autor:Cynthia Janeth Granados Estrada 
 * @category:GDS0624
 */

package mx.utng.sesion26.model.dao;

import java.util.List;

import mx.utng.sesion26.model.entity.Teacher;

public interface ITeacherDao {
     List<Teacher>list(); 
    void save(Teacher teacher);
    Teacher getById(Long id);
    void delete (Long id);


}
