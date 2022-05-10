package com.example.employeepayrollapp.model;
import com.example.employeepayrollapp.dto.EmployeePayrollDTO;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "employee_payroll")
public @Data class EmployeePayrollData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "employee_id")
    private int employeeID;
    @Column(name = "name")
    private String name;
    private Long salary;
    public String gender;
    public LocalDate startDate;
    public String note;
    public String profilePic;
    @ElementCollection
    @CollectionTable(name = "employee_department",
            joinColumns = @JoinColumn(name = "id"))
    @Column(name = "department")
    private  List<String> department;

    public EmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
        this.updateEmployeePayrollData(employeePayrollDTO);
    }

    public EmployeePayrollData() {

    }
    public void updateEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
        this.name = employeePayrollDTO.name;
        this.salary = employeePayrollDTO.salary;
        this.gender = employeePayrollDTO.gender;
        this.startDate = employeePayrollDTO.startDate;
        this.note=employeePayrollDTO.note;
        this.profilePic=employeePayrollDTO.profilePic;
        this.department=employeePayrollDTO.department;

    }
}






