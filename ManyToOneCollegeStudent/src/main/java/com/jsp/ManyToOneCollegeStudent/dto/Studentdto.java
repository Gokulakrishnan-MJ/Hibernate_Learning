package com.jsp.ManyToOneCollegeStudent.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Studentdto {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentId;
	private String studentName;
	private String studentPhNo;
	private String studentAddress;
	private String fatherName;
	private String DOB;
	@ManyToOne
	private CollegeDto college;
	public CollegeDto getCollege() {
		return college;
	}
	public void setCollege(CollegeDto college) {
		this.college = college;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentPhNo() {
		return studentPhNo;
	}
	public void setStudentPhNo(String studentPhNo) {
		this.studentPhNo = studentPhNo;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	

}
