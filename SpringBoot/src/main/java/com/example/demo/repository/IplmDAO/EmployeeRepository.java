package com.example.demo.repository.IplmDAO;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeInter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository implements EmployeeInter {
    private static Logger logger = LogManager.getLogger(EmployeeRepository.class);
     static List<Employee> listEmployee = null;

    static {
        listEmployee = new ArrayList<>();
    }
    @Override
    public Employee save(Employee employee) {
        listEmployee.add(employee);
        return employee;
    }
    @Override
    public List<Employee> getALL() {
        return listEmployee;
    }

    @Override
    public Employee findByindex(int index) {
        try{
        if( index > listEmployee.size()){
            logger.error("nhap qua so luong phan tu ");
        }
        }catch (Exception e){
            System.out.println(" loi roi ");
        }
        return listEmployee.get(index);
    }
}
