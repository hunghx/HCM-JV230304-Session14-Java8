package btth.run;

import btth.business.DepartmentBusiness;
import btth.business.EmployeeBusiness;
import btth.business.IDepartmentDesign;
import btth.business.IEmployeeDesign;

public class Main {
    public static void main(String[] args) {
        IDepartmentDesign departmentDesign = new DepartmentBusiness();
        IEmployeeDesign employeeDesign = new EmployeeBusiness();
//
//        System.out.println(employeeDesign.findManagerMostEmployees().orElseThrow());
//
//        employeeDesign.findTop5OldestEmployees().forEach(System.out::println);

        employeeDesign.findTop5DepartmentsMostCrowded().forEach(System.out::println);
        employeeDesign.findTop5HighestSalary().forEach(System.out::println);
        System.out.println(employeeDesign.getAvgEmployeesPerDepartment());
    }
}
