package com.jsp.ManyToOneCollegeStudent.dao;

import com.jsp.ManyToOneCollegeStudent.dto.CollegeDto;
import com.jsp.ManyToOneCollegeStudent.dto.Studentdto;

public class StudentDao implements DaoInterface {
	public static void addStudent()
	{
		Studentdto student=new Studentdto();
		student=UserInput.addStudent(student);
		Display.displayCollege();
		System.out.println("Enter College ID :");
		int id=UserInput.getId();
		CollegeDto college=manager.find(CollegeDto.class,id);
		student.setCollege(college);
		transaction.begin();
		manager.persist(student);
		transaction.commit();
	}
	public static void updateStudent()
	{
		int id=UserInput.getId();
		Studentdto student=manager.find(Studentdto.class,id);
		student=UserInput.addStudent(student);
		transaction.begin();
		manager.persist(student);
		transaction.commit();
		
	}
	public static void delete()
	{
		int id=UserInput.getId();
		Studentdto student=manager.find(Studentdto.class, id);
		transaction.begin();
		manager.remove(student);
		transaction.commit();
		System.out.println("Student Deleted Successfully..");
		
	}

}
