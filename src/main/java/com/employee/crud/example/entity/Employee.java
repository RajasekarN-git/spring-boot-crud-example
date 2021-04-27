package com.employee.crud.example.entity;


import lombok.Data;


import javax.persistence.*;

@Data

@Entity
@Table(name = "EMPLOYEE_TABLE")

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="salary")
    private int salary;

    @Column(name="department_id")
    private String departmentid;

    @Column(name="manager_id")
    private String managerid;
  @ManyToOne
    private Department department;




    public Employee(String name, int salary, String departmentid, String managerid) {

        this.name = name;
        this.salary = salary;
        this.departmentid = departmentid;
        this.managerid = managerid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(String departmentid) {
        this.departmentid = departmentid;
    }

    public String getManagerid() {
        return managerid;
    }

    public void setManagerid(String managerid) {
        this.managerid = managerid;
    }


    @Override
    public String toString() {
        return "Employee [id=" + id + ", Name=" + name + ", salary=" + salary + ", departmentid=" + departmentid + ",managerid="+ managerid]";
    }
}

