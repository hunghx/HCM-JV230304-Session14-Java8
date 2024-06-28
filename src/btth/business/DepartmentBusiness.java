package btth.business;

import btth.entity.Department;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DepartmentBusiness implements IDepartmentDesign{
    public static List<Department> departments;
    static {
          // khơi tạo giá trị cho các thành phần tĩnh
        departments = new ArrayList<>();
        departments.add(new Department("D001","Marketing",3));
        departments.add(new Department("D002","Sales",3));
    }
    @Override
    public List<Department> findAll() {
        return List.of();
    }

    @Override
    public Optional<Department> findById(int id) {
        return Optional.empty();
    }

    @Override
    public void save(Department department) {

    }

    @Override
    public void deleteById(String id) {

    }
}
