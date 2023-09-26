package com.jsp.project2Employee.dto;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee implements Serializable{
	
	@Id 
	private int empid;
	private String empName;
	private String empAddress;
	private long empphone;
	private int salary;
	
	public Employee()
	{
		super();
	}
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public long getEmpphone() {
		return empphone;
	}
	public void setEmpphone(long empphone) {
		this.empphone = empphone;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	
	
	
	

}
