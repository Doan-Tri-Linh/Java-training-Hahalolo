package abc.service.IplmService;


import abc.service.EmployeeService;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeInter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImplService implements EmployeeService {
    private static Logger logger =LogManager.getLogger(ImplService.class);

    @Autowired
    EmployeeInter EmployeeRepository ;

    @Override
    public List<Employee> getEmployees() {
        logger.info("getEmployees");
        return EmployeeRepository.getALL();
    }
    @Override
    public Employee addEmployees(Employee employee) {
        EmployeeRepository.save(employee);
        return employee;
    }

    @Override
    public Employee getByIndex(int index) {
        return EmployeeRepository.findByindex(index);
    }
}
