package com.jsp.OneToOne_UserBirthCertificate.dao;

import com.jsp.OneToOne_UserBirthCertificate.dto.BirthCertificateDTO;
import com.jsp.OneToOne_UserBirthCertificate.dto.Person;

public class User implements  DaoInterface{
	
	public static void AddUser()
	{
		BirthCertificateDTO birthCertificate =new BirthCertificateDTO();
		birthCertificate=UserInput.addBirthcertificate(birthCertificate);
		Person person=new Person();
		person=UserInput.addUser(person);
		person.setBirthCertificate(birthCertificate);
		
		transaction.begin();
		manager.persist(person);
		transaction.commit();
		System.out.println("User Added Successfully");
		
	}
	
	public static void display() {
		int id=UserInput.getId();
		Person person=manager.find(Person.class,id);
		System.out.println("Name    :"+person.getUserName());
		System.out.println("Id      :"+person.getUserId());
		System.out.println("Ph      :"+person.getPhno());
		System.out.println("Address :"+person.getAddress());
		BirthCeritificate.display(person.getBirthCertificate());
		
		
	}
	public static void removeUser()
	{
		int id=UserInput.getId();
		Person person=manager.find(Person.class,id);
		transaction.begin();
		manager.remove(person);
		manager.remove(person.getBirthCertificate());
		transaction.commit();
		System.out.println("Data Successfully removed");
	}
	public static void UpdateUser()
	{
		int id=UserInput.getId();
		Person person=manager.find(Person.class,id);
		person=UserInput.addUser(person);
		person.setBirthCertificate(UserInput.addBirthcertificate(person.getBirthCertificate()));
		
		
		transaction.begin();
		manager.persist(person);
		transaction.commit();
		System.out.println("User updated Successfully");
		
		
	}


}
