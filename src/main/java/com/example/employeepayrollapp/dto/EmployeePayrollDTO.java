package com.example.employeepayrollapp.dto;

public class EmployeePayrollDTO {
public String  name;
public Long Salary;

    public EmployeePayrollDTO(String name, Long salary) {
        this.name = name;
        this.Salary = salary;
    }
    @Override
    public String toString() {
        return "name="+name+":salary="+Salary;

    }
}
