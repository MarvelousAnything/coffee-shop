package com.marvelousanything.employeeservice.service;

import com.marvelousanything.employeeservice.model.Employee;
import com.marvelousanything.employeeservice.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;

    public Employee create(Employee employee) {
        return repository.save(employee);
    }

    public Optional<Employee> get(Long id) {
        return repository.findById(id);
    }

    public Iterable<Employee> getAll() {
        return repository.findAll();
    }

    public Iterable<Employee> getAllById(Iterable<Long> idList) {
        return repository.findAllById(idList);
    }

    public void remove(Employee employee) {
        repository.delete(employee);
    }

    public void removeById(Long id) {
        repository.deleteById(id);
    }
}
