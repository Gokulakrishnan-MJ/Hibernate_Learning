package com.jsp.ManyToManyStudentCourse.dto;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Coursesdto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int courseId;
	private String courseName;
	private String courseTrainerName;
	private int coursePrice;
	@Cascade(CascadeType.ALL)
	private Studentdto student;
	public Studentdto getStudent() {
		return student;
	}
	public void setStudent(Studentdto student) {
		this.student = student;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseTrainerName() {
		return courseTrainerName;
	}
	public void setCourseTrainerName(String courseTrainerName) {
		this.courseTrainerName = courseTrainerName;
	}
	public int getCoursePrice() {
		return coursePrice;
	}
	public void setCoursePrice(int coursePrice) {
		this.coursePrice = coursePrice;
	}
	
	
	

}
