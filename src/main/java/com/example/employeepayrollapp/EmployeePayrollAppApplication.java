package com.example.employeepayrollapp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeePayrollAppApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Payroll Application");
		SpringApplication.run(EmployeePayrollAppApplication.class, args);
	}

}