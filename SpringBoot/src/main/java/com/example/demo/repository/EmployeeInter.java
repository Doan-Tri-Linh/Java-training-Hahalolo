package com.example.demo.repository;

import com.example.demo.model.Employee;

import java.util.List;

public interface EmployeeInter {

    Employee save(Employee employee);
    List<Employee> getALL();
    Employee findByindex(int index );
}
