//Cynthia Janeth Granados Estrada
//GDS0624

package mx.utng.s25.model.dao;

import java.util.List;
import mx.utng.s25.model.entity.User;
import org.springframework.stereotype.Repository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class UserDaoImpl implements IUserDao{

    //Coloco un atributo que me permitira gestionar la entidad
    @PersistenceContext
    private EntityManager em;

    @SuppressWarnings("unchecked")
    @Override
    public List<User> list() {
        return em.createQuery("from User").getResultList();
    }

    @Override
    public void save(User user) {
        if(user.getId() != null && user.getId()>0){
            em.merge(user);
        }else{
            em.persist(user);
        }
    }

    @Override
    public User getById(Long id) {
        return em.find(User.class, id);
    }

    @Override
    public void delete(Long id) {
      User user = getById(id);
      em.remove(user);
    }
    
}
