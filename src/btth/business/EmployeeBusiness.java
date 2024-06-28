package btth.business;

import btth.entity.Department;
import btth.entity.Employee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeBusiness implements IEmployeeDesign {
    public static List<Employee> employees ;
    static {
        employees = new ArrayList<>();
        employees.add(new Employee("E001","Nguyễn Văn A", LocalDate.of(1990,10,10),1000,true,null,DepartmentBusiness.departments.get(0)));
        employees.add(new Employee("E002","Nguyễn Văn B", LocalDate.of(1992,10,10),1400,true,employees.get(0),DepartmentBusiness.departments.get(0)));
        employees.add(new Employee("E003","Nguyễn Văn C", LocalDate.of(1991,10,10),1100,true,employees.get(0),DepartmentBusiness.departments.get(0)));
        employees.add(new Employee("E004","Nguyễn Văn D", LocalDate.of(1989,10,10),1200,true,null,DepartmentBusiness.departments.get(1)));
        employees.add(new Employee("E005","Nguyễn Văn E", LocalDate.of(1996,10,10),900,true,employees.get(3),DepartmentBusiness.departments.get(1)));
        employees.add(new Employee("E006","Nguyễn Văn F", LocalDate.of(2000,10,10),800,true,employees.get(4),DepartmentBusiness.departments.get(1)));
    }
    @Override
    public List<Employee> findAll() {
        return List.of();
    }

    @Override
    public Optional<Employee> findById(int id) {
        return Optional.empty();
    }

    @Override
    public void save(Employee employee) {

    }

    @Override
    public void deleteById(String id) {

    }

    @Override
    public int getAvgEmployeesPerDepartment() {
        return EmployeeBusiness.employees.size()/DepartmentBusiness.departments.size();
    }

    @Override
    public List<Department> findTop5DepartmentsMostCrowded() {
        return DepartmentBusiness.departments.stream()
                .sorted((o1, o2) -> o2.getTotalMembers()-o1.getTotalMembers())
                .limit(5)
                .toList();
    }

    @Override
    public Optional<Employee> findManagerMostEmployees() {
        return employees.stream().min((o1, o2) -> calTotalEmployeeByManager(o2) - calTotalEmployeeByManager(o1));
    }
    private int calTotalEmployeeByManager(Employee manager){
        return employees.stream().mapToInt(em-> ( em.getManager()!=null && em.getManager().equals(manager))?1:0).sum();
    }

    @Override
    public List<Employee> findTop5OldestEmployees() {
        return employees.stream().sorted(Comparator.comparing(Employee::getBirthday)).limit(5).toList();
    }

    @Override
    public List<Employee> findTop5HighestSalary() {
        return employees.stream().sorted((o1, o2) -> Double.compare(o2.getSalary(),o1.getSalary())).limit(5).toList();
    }
}
