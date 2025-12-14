package com.systems.EmployeeInfo.service;

import com.systems.EmployeeInfo.entity.Employee;
import com.systems.EmployeeInfo.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo employeeRepo;
    public Employee saveNewEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    public List<Employee> getAllEmployee() {
        return employeeRepo.findAll();
    }
}
