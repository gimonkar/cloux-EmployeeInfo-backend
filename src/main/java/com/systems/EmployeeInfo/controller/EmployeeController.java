package com.systems.EmployeeInfo.controller;

import com.systems.EmployeeInfo.entity.Employee;
import com.systems.EmployeeInfo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@CrossOrigin
@RequestMapping("api")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("new-emp")
    public void createNewEmployee(@RequestBody Employee employee){
        employeeService.saveNewEmployee(employee);
    }

    @GetMapping("show-all-emp")
    public List<Employee> showAllEmployee(){
        return employeeService.getAllEmployee();
    }
}
