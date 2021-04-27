package com.employee.crud.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Department {





private Integer Id;
private String name;

@OneToMany(mappedBy = "department")
private List<Employee> employees;


    public Department(String name) {
        this.name = name;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
