/**
 * @autor:Cynthia Janeth Granados Estrada 
 * @category:GDS0624
 */

package mx.utng.sesion26.model.service;

import mx.utng.sesion26.model.entity.Subject;
import java.util.List;

public interface ISubjectService {
    List<Subject> list();
    void save (Subject subject); 
    Subject getById(Long id); 
    void delete (Long id);
}
