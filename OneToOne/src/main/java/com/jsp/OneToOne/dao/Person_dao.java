package com.jsp.OneToOne.dao;

import com.jsp.OneToOne.dto.Aadhar;

import com.jsp.OneToOne.dto.Person;
import com.jsp.OneToOne.dao.DaoInterface;

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
		System.out.println("----------------------------------Insertion Successful--------------------------------------------");
	}
	public static void UpdatePerson()
	{
		int id = UserInput.PersonId();
		Person person=manager.find(Person.class,id);
		person =UserInput.PersonInput(person);
		
		transaction.begin();
		manager.persist(person);
		transaction.commit();	
		System.out.println("----------------------------------Update Successfull-----------------------------------------------");
	}
	public static void deletePerson() {
		int id=UserInput.PersonId();
		Person person=manager.find(Person.class,id);
		Aadhar aadhar=person.getAadhar();
		Aadhar_dao.deleteAadhar(aadhar);
		transaction.begin();
		manager.remove(person);
		transaction.commit();
		System.out.println("------------------------------Person Deleted Successfully-------------------------------------------");
	}
	public static void displayPerson() {
		int id=UserInput.PersonId();
		Person person=manager.find(Person.class,id);
		System.out.println("-------------------------------------Person Details----------------------------------------------");
		System.out.println("Name    : "+person.getPersonName());
		System.out.println("Email   : "+person.getPersonEmail());
		System.out.println("Contact : "+person.getPersonPhoneNo());
		Aadhar aadhar=person.getAadhar();
		Aadhar_dao.displayAadhar(aadhar);
	}
	

	

}
