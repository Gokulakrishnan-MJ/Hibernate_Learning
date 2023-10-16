package com.jsp.ManyToOneCollegeStudent.dao;

import java.util.List;

import com.jsp.ManyToOneCollegeStudent.dto.CollegeDto;
import com.jsp.ManyToOneCollegeStudent.dto.Studentdto;

import jakarta.persistence.Query;

public class Display implements DaoInterface{
	public static void displayCollege()
	{
		Query query = manager.createQuery("select c from CollegeDto c ");
		List<CollegeDto> list=query.getResultList();
		System.out.println("========================================================================");
		System.out.println("CollegeID\tCollegeName");
		for(CollegeDto college:list)
		{
			System.out.println(college.getCollegeId()+"\t\t"+college.getCollegeName());
		}
		System.out.println("========================================================================");
	}
	public static void displayStudents()
	{
		Query query = manager.createQuery("select c from Studentdto c ");
		List<Studentdto> list=query.getResultList();
		System.out.println("========================================================================");
		System.out.println("StudentName\tFatherName\tDOB\t\tAddress\t\tPH NO");
		for(Studentdto student:list)
		{
			System.out.println(student.getStudentName()+"\t\t"+student.getFatherName()+"\t\t"+student.getDOB()+"\t"+student.getStudentAddress()+"\t\t"+student.getStudentPhNo());
		}
		System.out.println("========================================================================");
	}
}
