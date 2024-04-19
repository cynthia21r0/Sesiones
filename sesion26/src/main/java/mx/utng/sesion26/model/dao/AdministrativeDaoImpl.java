/**
 * @autor:Cynthia Janeth Granados Estrada 
 * @category:GDS0624
 */
package mx.utng.sesion26.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import mx.utng.sesion26.model.entity.Administrative;


 @Repository
public class AdministrativeDaoImpl implements IAdministrativeDao {

     @Autowired
    private EntityManager em;

    @SuppressWarnings("unchecked")
    @Override
    public List<Administrative> list() {
        return em.createQuery("from Administrative").getResultList();
    }

    @Override
    public void save(Administrative administrative) {
        if(administrative.getId()!=null && administrative.getId()>0){
            //Actualizar si Student no es null 
            em.merge(administrative);
        }else{
            //Crear un nuevo Student
            em.persist(administrative);
        }
        
    }

    @Override
    public Administrative getById(Long id) {

        return em.find(Administrative.class, id);        
    }

    @Override
    public void delete(Long id) {
    Administrative administrative = getById(id); 
    em.remove(administrative);
    }
    
 
}
