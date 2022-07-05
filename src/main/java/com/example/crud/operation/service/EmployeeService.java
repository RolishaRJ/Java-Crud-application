package com.example.crud.operation.service;

import com.example.crud.operation.model.Employee;
import com.example.crud.operation.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository  employeeRepository;
    public Employee adduser(Employee employee) {
        return employeeRepository.save(employee);

    }

    public List<Employee> showUser() {
        return employeeRepository.findAll();
    }

    public Employee getName(String name) {
        return employeeRepository.findByName(name);
    }

    public Employee getUpdate(Employee employee ) {
        Employee em=employeeRepository.findById(employee.getId()).orElse(null);
        em.setName(employee.getName());
        em.setAge(employee.getAge());
        em.setEmpNo(employee.getEmpNo());
        em.setAddress(employee.getAddress());
        return employeeRepository.save(em);
    }

    public void delete(Integer id) {
        employeeRepository.deleteById(id);
    }
}
