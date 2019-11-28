package com.company;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String dept;
    private int salary;
    private List<Employee> subOrdinates;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        subOrdinates = new ArrayList<Employee>();
    }

    public void add(Employee e){
        subOrdinates.add(e);
    }

    public void remove(Employee e){
        subOrdinates.remove(e);
    }

    public List<Employee> getSubOrdinates() {
        return subOrdinates;
    }

    public String toString(){
        return ("Employee :[ Name : " + name + ", dept : " + dept + ", salary :" + salary+" ]");
    }
}
