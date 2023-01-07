package rtr.packag.testing.service;

import org.springframework.beans.factory.annotation.Autowired;
import rtr.packag.testing.model.Employee;
import rtr.packag.testing.repository.EmployeeRepository;
import java.util.List;

public class EmployeeServiceImp implements EmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }
}
