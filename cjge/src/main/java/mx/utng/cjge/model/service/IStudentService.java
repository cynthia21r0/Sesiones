package mx.utng.cjge.model.service;

import java.util.List;

import mx.utng.cjge.model.entity.Student;


public interface IStudentService {
    List<Student> list();
    void save(Student student);
    Student getById(Long id);
    void delete(Long id);
}
