package mx.utng.cjge.model.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import mx.utng.cjge.model.entity.Proveedor;
import mx.utng.cjge.model.dao.ProveedorDaoImpl;

@Repository
public class ProveedorDaoImpl implements IProveedorDao{

    //Coloco un atributo que me permitira gestionar la entidad
    @PersistenceContext
    private EntityManager em;

    @SuppressWarnings("unchecked")
    @Override
    public List<Proveedor> list() {
        return em.createQuery("from Proveedor").getResultList();
    }

    @Override
    public void save(Proveedor proveedor) {
        //Si el id es distinto a nulo o mayor que cero, quiere decir que el registro ya existe lo va a modificar
        if(proveedor.getId() != null && proveedor.getId()>0){
            em.merge(proveedor);
        }else{
            //Registro nuevo al usar persist
            em.persist(proveedor);
        }
    }

    @Override
    public Proveedor getById(Long id) {
        return em.find(Proveedor.class, id);
    }

    @Override
    public void delete(Long id) {
      Proveedor proveedor = getById(id);
      em.remove(proveedor);
    }


}