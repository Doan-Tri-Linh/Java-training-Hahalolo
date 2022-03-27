package com.example.demo.controller;

import abc.service.EmployeeService;
import com.example.demo.model.Employee;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;
    @ResponseBody
    @PostMapping("/add")
    public Employee add( @RequestBody Employee employee){
        return  employeeService.addEmployees(employee);
    }
    @ResponseBody
    @GetMapping("/get")
    public List<Employee> getEmployee(){
        return employeeService.getEmployees();
    }

    @ResponseBody
    @GetMapping("/get/{id}")
    public Employee getIndex(@PathVariable int id) {
       return employeeService.getByIndex(id);
    }

    }

