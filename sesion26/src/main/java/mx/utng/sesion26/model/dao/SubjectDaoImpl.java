/**
 * @autor:Cynthia Janeth Granados Estrada 
 * @category:GDS0624
 */
package mx.utng.sesion26.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import mx.utng.sesion26.model.entity.Subject;


 @Repository
public class SubjectDaoImpl implements ISubjectDao {

     @Autowired
    private EntityManager em;

    @SuppressWarnings("unchecked")
    @Override
    public List<Subject> list() {
        return em.createQuery("from Subject").getResultList();
    }

    @Override
    public void save(Subject subject) {
        if(subject.getId()!=null && subject.getId()>0){
            //Actualizar si Student no es null 
            em.merge(subject);
        }else{
            //Crear un nuevo Student
            em.persist(subject);
        }
        
    }

    @Override
    public Subject getById(Long id) {
        //PARA ENCONTRAR A UN ESTUDIANTE CON EL id que esta en los PARAMETROS

        return em.find(Subject.class, id);        
    }

    @Override
    public void delete(Long id) {
   Subject subject = getById(id); 
    em.remove(subject);
    }
    


    //FALTAN 5 ARCHIVOS QUE MODIFICAR 
}
