package com.jsp.OneToOne.dao;

import com.jsp.OneToOne.dto.Aadhar;

import com.jsp.OneToOne.dto.Person;

public class Person_dao implements DaoInterface{

	public static void insertPersonData()
	{
		Aadhar aadhar=Aadhar_dao.insertAadhar();
		Person person=UserInput.PersonInput(aadhar);
		transaction.begin();
		manager.persist(person);
		transaction.commit();
		System.out.println("Insertion Successful");
	}

	

	

}
