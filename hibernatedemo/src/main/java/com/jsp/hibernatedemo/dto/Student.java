package com.jsp.hibernatedemo.dto;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Student implements Serializable{
	@Id
	private int studentID;
	private String studentName;
	private String studentEmail;
	private String address;
	
	public Student() {
		super();
	}
	
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	
	
}
