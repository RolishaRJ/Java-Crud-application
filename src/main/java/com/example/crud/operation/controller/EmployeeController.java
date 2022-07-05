package com.example.crud.operation.controller;

import com.example.crud.operation.model.Employee;
import com.example.crud.operation.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("roli/pronotate/")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("adduser")
    private Employee addUser(@RequestBody Employee employee){
        return employeeService.adduser(employee);
    }
    @GetMapping("showuser")
    private List<Employee> showUser(){
        return employeeService.showUser();
    }
    @GetMapping("getname")
    private Employee getName(@RequestParam String name){
        return employeeService.getName(name);
    }
    @PutMapping("update")
    private Employee getUpdate(@RequestBody Employee employee){
        return employeeService.getUpdate(employee);
    }
    @DeleteMapping("delete/{id}")
    private ResponseEntity<String> delete(@PathVariable Integer id){
        employeeService.delete(id);
        return ResponseEntity.ok("Deleted sucessfully");
    }


}
