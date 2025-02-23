package jar.model;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeDAO employeeDAO = new EmployeeDAO();

        // Create Employee
        Employee emp1 = new Employee("Suresh", "Non IT", 11000.0);
        employeeDAO.saveEmployee(emp1);   
        System.out.println("Diplay done");
    
     // Read All Employees
        List<Employee> employees = employeeDAO.getAllEmployees();
        employees.forEach(System.out::println);

//        // Read Employee by ID
//        Employee emp = employeeDAO.getEmployeeById(emp1.getId());
//        System.out.println("Fetched Employee: " + emp);
//
//        // Update Employee
//        emp.setSalary(60000.0);
//        employeeDAO.updateEmployee(emp);
//        System.out.println("Updated Employee: " + employeeDAO.getEmployeeById(emp.getId()));
//
//        // Delete Employee
//        employeeDAO.deleteEmployee(emp.getId());
//        System.out.println("Remaining Employees: " + employeeDAO.getAllEmployees());
    }   		
}
