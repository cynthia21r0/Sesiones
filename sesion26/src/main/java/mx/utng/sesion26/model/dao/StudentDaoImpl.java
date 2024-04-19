/**
 * @autor:Cynthia Janeth Granados Estrada 
 * @category:GDS0624
 */

package mx.utng.sesion26.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import mx.utng.sesion26.model.entity.Student;



 @Repository
public class StudentDaoImpl implements IStudentDao {

    
     @Autowired
    private EntityManager em;

    @SuppressWarnings("unchecked")
    @Override
    public List<Student> list() {
        return em.createQuery("from Student").getResultList();
    }

    @Override
    public void save(Student student) {
        if(student.getId()!=null && student.getId()>0){
            //Actualizar si Student no es null 
            em.merge(student);
        }else{
            //Crear un nuevo Student
            em.persist(student);
        }
        
    }

    @Override
    public Student getById(Long id) {
        
        return em.find(Student.class, id);        
    }

    @Override
    public void delete(Long id) {
    Student student = getById(id); 
    em.remove(student);
    }
    


    //FALTAN 5 ARCHIVOS QUE MODIFICAR 
}
