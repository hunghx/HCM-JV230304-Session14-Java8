package btth.business;

import btth.entity.Department;

import java.util.List;
import java.util.Optional;

public interface IGenericDesign <T,E> {
    List<T> findAll();
    Optional<T> findById(int id);
    void save(T t);
    void deleteById(E id);
}
