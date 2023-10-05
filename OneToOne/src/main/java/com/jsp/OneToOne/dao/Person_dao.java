package com.jsp.OneToOne.dao;

import com.jsp.OneToOne.dto.Aadhar;

import com.jsp.OneToOne.dto.Person;

public class Person_dao implements DaoInterface{

	public static void insertPersonData()
	{
		Aadhar aadhar=new Aadhar();
		aadhar=Aadhar_dao.insertAadhar(aadhar);
		Person person=new Person();
	    person=UserInput.PersonInput(person);
		person.setAadhar(aadhar);
		transaction.begin();
		manager.persist(person);
		transaction.commit();
		System.out.println("Insertion Successful");
	}
	public static void UpdatePersonData()
	{
		int id = UserInput.PersonId();
		Person person=manager.find(Person.class,id);
		person =UserInput.PersonInput(person);
		
		transaction.begin();
		manager.persist(person);
		transaction.commit();	
	}
	

	

}
