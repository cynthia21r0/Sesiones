/**
 * @autor:Cynthia Janeth Granados Estrada 
 * @category:GDS0624
 */
package mx.utng.sesion26.model.service;

import mx.utng.sesion26.model.entity.Teacher;
import java.util.List;

public interface ITeacherService  {
    List<Teacher> list();
    void save (Teacher student); 
    Teacher getById(Long id); 
    void delete (Long id);
}
