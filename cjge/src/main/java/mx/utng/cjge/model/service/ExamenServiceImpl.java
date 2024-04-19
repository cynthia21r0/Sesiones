package mx.utng.cjge.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.utng.cjge.model.dao.IExamenDao;
import mx.utng.cjge.model.entity.Examen;

/*
 * Una clase service, esta basada en el patron de diseño facade.
 * Un unico punto de acceso hacia distintos DAOS (Datas and objects).
 * Dentro de la clase service podemos operar distintas clases DAO.
 */
@Service
public class ExamenServiceImpl implements IExamenService{

    //Inyecta una interfaz para utilizar sus metodos
    @Autowired
    private IExamenDao examenDao;

    @Transactional(readOnly = true)
    @Override
    public List<Examen> list() {
        return examenDao.list();
    }

    @Transactional
    @Override
    public void save(Examen examen) {
        examenDao.save(examen);
    }

    @Transactional(readOnly = true)
    @Override
    public Examen getById(Long id) {
        return examenDao.getById(id);
    }

    @Transactional
    @Override
    public void delete(Long id) {
        examenDao.delete(id);
    }
    
}
