package abc.service;


import com.example.demo.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getEmployees();
    Employee addEmployees(Employee employee);
    Employee getByIndex(int index);

}
