package com.example.crud.operation.repository;

import com.example.crud.operation.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    Employee findByName(String name);

    //Employee update(Employee employee);
}
