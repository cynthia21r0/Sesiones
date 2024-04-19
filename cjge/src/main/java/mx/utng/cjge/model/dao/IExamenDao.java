package mx.utng.cjge.model.dao;

import java.util.List;

import mx.utng.cjge.model.entity.Examen;

public interface IExamenDao {
    //Estos metodos son abstractos no tienen cuerpo
    
    //Listar estudiantes
    List<Examen> list();

    //Guardar un estudiante
    void save(Examen examen);

    //Obterner un estudiante en especifico a partir del id
    Examen getById(Long id);

    //Eliminar un estudiante por el id
    void delete(Long id);
}
