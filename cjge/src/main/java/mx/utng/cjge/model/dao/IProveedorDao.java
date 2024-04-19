package mx.utng.cjge.model.dao;

import java.util.List;

import mx.utng.cjge.model.entity.Proveedor;


public interface IProveedorDao {
    //Estos metodos son abstractos no tienen cuerpo
    
    //Listar estudiantes
    List<Proveedor> list();

    //Guardar un estudiante
    void save(Proveedor proveedor);

    //Obterner un estudiante en especifico a partir del id
    Proveedor getById(Long id);

    //Eliminar un estudiante por el id
    void delete(Long id);
}
