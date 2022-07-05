package com.example.crud.operation.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue

    private int id;
    private String name;
    private int age;
    @Column(name = "emp_no")
    private int empNo;
    private String address;
}
