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
	
	
	public int getEmployeeID() {
		return EmployeeID;
	}
	public void setEmployeeID(int employeeID) {
		EmployeeID = employeeID;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public String getEmployeeWorkDept() {
		return EmployeeWorkDept;
	}
	public void setEmployeeWorkDept(String employeeWorkDept) {
		EmployeeWorkDept = employeeWorkDept;
	}
	public long getEmployeePhone() {
		return EmployeePhone;
	}
	public void setEmployeePhone(long employeePhone) {
		EmployeePhone = employeePhone;
	}
	public String getEmployeeHireDate() {
		return EmployeeHireDate;
	}
	public void setEmployeeHireDate(String employeeHireDate) {
		EmployeeHireDate = employeeHireDate;
	}
	public String getEmployeeDesignation() {
		return EmployeeDesignation;
	}
	public void setEmployeeDesignation(String employeeDesignation) {
		EmployeeDesignation = employeeDesignation;
	}
	public String getEmployeeSex() {
		return EmployeeSex;
	}
	public void setEmployeeSex(String employeeSex) {
		EmployeeSex = employeeSex;
	}
	public int getEmployeeSalary() {
		return EmployeeSalary;
	}
	public void setEmployeeSalary(int employeeSalary) {
		EmployeeSalary = employeeSalary;
	}
	
	
}