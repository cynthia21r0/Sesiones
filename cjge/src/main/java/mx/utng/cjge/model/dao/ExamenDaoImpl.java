package mx.utng.cjge.model.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import mx.utng.cjge.model.entity.Examen;

@Repository
public class ExamenDaoImpl implements IExamenDao{

    //Coloco un atributo que me permitira gestionar la entidad
    @PersistenceContext
    private EntityManager em;

    @SuppressWarnings("unchecked")
    @Override
    public List<Examen> list() {
        return em.createQuery("from Examen").getResultList();
    }

    @Override
    public void save(Examen examen) {
        //Si el id es distinto a nulo o mayor que cero, quiere decir que el registro ya existe lo va a modificar
        if(examen.getId() != null && examen.getId()>0){
            em.merge(examen);
        }else{
            //Registro nuevo al usar persist
            em.persist(examen);
        }
    }

    @Override
    public Examen getById(Long id) {
        return em.find(Examen.class, id);
    }

    @Override
    public void delete(Long id) {
      Examen examen = getById(id);
      em.remove(examen);
    }


}