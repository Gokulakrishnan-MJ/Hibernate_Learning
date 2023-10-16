package com.jsp.ManyToOneCollegeStudent.dao;

import com.jsp.ManyToOneCollegeStudent.dto.CollegeDto;

import jakarta.transaction.Transaction;

public class CollegeDao implements DaoInterface{
	
	public static void addCollege()
	{
		CollegeDto college=new CollegeDto();
		college=college=UserInput.addCollege(college);
		transaction.begin();
		manager.persist(college);
		transaction.commit();
		System.out.println("College Added Successfully");
		
	}
	public static void updateCollege()
	{
		int id=UserInput.getId();
		CollegeDto college=manager.find(CollegeDto.class,id);
		college=college=UserInput.addCollege(college);
		transaction.begin();
		manager.persist(college);
		transaction.commit();
		System.out.println("College Updated Successfully");
	}
	
	
}
