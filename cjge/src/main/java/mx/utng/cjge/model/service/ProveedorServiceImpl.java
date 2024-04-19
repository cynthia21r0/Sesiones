package mx.utng.cjge.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.utng.cjge.model.dao.IProveedorDao;
import mx.utng.cjge.model.entity.Proveedor;

/*
 * Una clase service, esta basada en el patron de diseño facade.
 * Un unico punto de acceso hacia distintos DAOS (Datas and objects).
 * Dentro de la clase service podemos operar distintas clases DAO.
 */
@Service
public class ProveedorServiceImpl implements IProveedorService{

    //Inyecta una interfaz para utilizar sus metodos
    @Autowired
    private IProveedorDao proveedorDao;

    @Transactional(readOnly = true)
    @Override
    public List<Proveedor> list() {
        return proveedorDao.list();
    }

    @Transactional
    @Override
    public void save(Proveedor proveedor) {
        proveedorDao.save(proveedor);
    }

    @Transactional(readOnly = true)
    @Override
    public Proveedor getById(Long id) {
        return proveedorDao.getById(id);
    }

    @Transactional
    @Override
    public void delete(Long id) {
        proveedorDao.delete(id);
    }
    
}
