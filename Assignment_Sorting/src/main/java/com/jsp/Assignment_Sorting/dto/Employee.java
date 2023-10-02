package com.jsp.Assignment_Sorting.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
class Employee
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int EmployeeID;
	private String EmployeeName;
	private String EmployeeWorkDept;
	private long EmployeePhone;
	private String EmployeeHireDate;
	private String EmployeeDesignation;
	private String EmployeeSex;
	private int EmployeeSalary;
	
	
}