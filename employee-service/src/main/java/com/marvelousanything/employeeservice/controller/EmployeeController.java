package com.marvelousanything.employeeservice.controller;

import com.marvelousanything.employeeservice.model.Employee;
import com.marvelousanything.employeeservice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @ResponseBody
    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
        return ResponseEntity.of(service.get(id));
    }

    @ResponseBody
    @GetMapping("/employee")
    public Iterable<Employee> getAllEmployees() {
        return service.getAll();
    }

    @ResponseBody
    @PostMapping("/employee")
    public Employee createEmployee(@RequestBody Employee employee) {
        service.create(employee);
        return employee;
    }
}
