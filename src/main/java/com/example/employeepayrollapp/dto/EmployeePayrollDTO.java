package com.example.employeepayrollapp.dto;

import javax.validation.constraints.Pattern;

public class EmployeePayrollDTO {
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee name Invalid")
    public String name;
    public Long Salary;

    public EmployeePayrollDTO(String name, Long salary) {
        this.name = name;
        this.Salary = salary;
    }

    @Override
    public String toString() {
        return "name=" + name + ":salary=" + Salary;

    }
}
