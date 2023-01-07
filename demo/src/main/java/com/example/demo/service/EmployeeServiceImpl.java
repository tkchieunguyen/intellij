package com.example.demo.service;
import java.util.Optional;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
    @Override
    public void saveEmployee(Employee employee) {
        this.employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(long id) {
        Optional<Employee> optional= employeeRepository.findById(id);
        Employee employee =null;
        if (optional.isPresent()){
            employee=optional.get();
        } else {
            throw new RuntimeException("Employee is not found by id: "+id);
        }
        return employee;
    }
}
