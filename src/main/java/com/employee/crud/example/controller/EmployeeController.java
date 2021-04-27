package com.employee.crud.example.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.employeeEntity.EmployeeEntity;
import com.example.demo.employeeService.EmployeeService;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService service;

    @GetMapping("/getEmployee")
    private List<EmployeeEntity> getAllEmployee()
    {
        return service.getAllEmployee();
    }

    @GetMapping("/getEmployee/{id}")
    private EmployeeEntity getEmployeeById(@PathVariable(name = "id") int empId)
    {
        return service.getEmployeeById(empId);
    }

    @DeleteMapping("/deleteEmployee/{id}")
    private void delete(@PathVariable(name = "id") int empId)
    {
        service.delete(empId);
    }

    @PutMapping("/updateEmployee")
    private void update(@RequestBody EmployeeEntity employeeEntity)
    {
        service.update(employeeEntity);
    }

    @PostMapping("/insertEmployee")
    private void insert(@RequestBody EmployeeEntity employeeEntity)
    {
        service.insert(employeeEntity);
    }
}
