package com.jsp.ManyToOneCollegeStudent.dao;

import java.util.Scanner;

import com.jsp.ManyToOneCollegeStudent.dto.CollegeDto;
import com.jsp.ManyToOneCollegeStudent.dto.Studentdto;

public class UserInput {
	static Scanner sc=new Scanner(System.in);

	public static CollegeDto addCollege(CollegeDto college) {
		System.out.println("Enter the College Name :");
		college.setCollegeName(sc.next());
		System.out.println("Enter College Location :");
		college.setCollegeLocation(sc.next());
		return college;
	}

	public static int getId() {
		System.out.println("Enter ID :");
		int id=sc.nextInt();
		return id;
	}

	public static Studentdto addStudent(Studentdto student) {
		System.out.println("Enter Student Name :");
		student.setStudentName(sc.next());
		System.out.println("Enter Father Name :");
		student.setFatherName(sc.next());
		System.out.println("Enter DOB :");
		student.setDOB(sc.next());
		System.out.println("Enter Ph No :");
		student.setStudentPhNo(sc.next());
		System.out.println("Enter the Address :");
		student.setStudentAddress(sc.next());		
		return student;
	}

}
