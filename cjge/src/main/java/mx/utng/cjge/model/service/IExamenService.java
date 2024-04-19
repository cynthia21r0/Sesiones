package mx.utng.cjge.model.service;

import java.util.List;

import mx.utng.cjge.model.entity.Examen;

public interface IExamenService {
    List<Examen> list();
    void save(Examen examen);
    Examen getById(Long id);
    void delete(Long id);
}
