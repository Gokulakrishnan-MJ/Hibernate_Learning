package com.jsp.JPQL_Example.dto;

import org.hibernate.annotations.GeneratorType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int departmentId;
	
	private String deptHOD;
	private String deptCo_Ordinator;
	private String deptIncharge;
	private int numberOfFaculty;
	
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDeptHOD() {
		return deptHOD;
	}
	public void setDeptHOD(String deptHOD) {
		this.deptHOD = deptHOD;
	}
	public String getDeptCo_Ordinator() {
		return deptCo_Ordinator;
	}
	public void setDeptCo_Ordinator(String deptCo_Ordinator) {
		this.deptCo_Ordinator = deptCo_Ordinator;
	}
	public String getDeptIncharge() {
		return deptIncharge;
	}
	public void setDeptIncharge(String deptIncharge) {
		this.deptIncharge = deptIncharge;
	}
	public int getNumberOfFaculty() {
		return numberOfFaculty;
	}
	public void setNumberOfFaculty(int numberOfFaculty) {
		this.numberOfFaculty = numberOfFaculty;
	}
	
	
	
	

}
