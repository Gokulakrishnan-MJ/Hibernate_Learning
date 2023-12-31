package com.jsp.JPQL_Example.dao;

import java.util.List;

import jakarta.persistence.Query;

import com.jsp.JPQL_Example.dto.Student;

public class Student_dao implements DaoInterface{
	
	public static void insert() {
		
		
		
		
	}
	public static void displayStudents()
	{
		Query query = manager.createQuery("select s.studentName from Student s");
		List<String> list=query.getResultList();
		
		System.out.print("Name");
		System.out.println();
		for(String s:list)
		{
			System.out.println(s);
		}
		
		
		
	}
	public static void displayTable()
	{
		Query query = manager.createQuery("select c from Student c ");
		List<Student> list=query.getResultList();
		
		for(Student s:list)
		{
			System.out.println(s.getStudentID()+"\t"+s.getStudentName()+"\t"+s.getStudentDept()+"\t"+s.getStudentBatch()+"\t"+s.getStudentPhNo()+"\t"+s.getTotalMarks());
		}
		
		
	}
	
	public static void Sorting()
	{
		Query query = manager.createQuery("select c from Student c ORDER BY totalMarks ");
		List<Student> list=query.getResultList();
		
		for(Student s:list)
		{
			System.out.println(s.getStudentID()+"\t"+s.getStudentName()+"\t"+s.getStudentDept()+"\t"+s.getStudentBatch()+"\t"+s.getStudentPhNo()+"\t"+s.getTotalMarks());
		}
		
	}

}
