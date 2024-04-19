package mx.utng.cjge.model.service;

import java.util.List;

import mx.utng.cjge.model.entity.Proveedor;


public interface IProveedorService {
    List<Proveedor> list();
    void save(Proveedor proveedor);
    Proveedor getById(Long id);
    void delete(Long id);
}
