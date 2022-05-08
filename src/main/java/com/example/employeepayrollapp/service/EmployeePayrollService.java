package com.example.employeepayrollapp.service;

import com.example.employeepayrollapp.dto.EmployeePayrollDTO;
import com.example.employeepayrollapp.model.EmployeePayrollData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeePayrollService implements IEmployeePayrollService {
    public List<EmployeePayrollData> getEmployeePayrollData() {
        List<EmployeePayrollData> empDatalist = new ArrayList<>();
        empDatalist.add(new EmployeePayrollData(1, new EmployeePayrollDTO("Rani", 30000L)));
        return empDatalist;

    }

    public EmployeePayrollData getEmployeePayrollDataById(int empId) {
        EmployeePayrollData empData = null;
        empData = new EmployeePayrollData(1, new EmployeePayrollDTO("Raj", 30000L));
        return empData;

    }

    public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO) {
        EmployeePayrollData empData = null;
        empData = new EmployeePayrollData(1, empPayrollDTO);
        return empData;

    }

    public EmployeePayrollData updateEmployeePayrollData(EmployeePayrollDTO empPayrollDTO) {
        EmployeePayrollData empData = null;
        empData = new EmployeePayrollData(1, empPayrollDTO);
        return empData;
    }

    public void deleteEmployeePayrollData(int empId) {

    }
}