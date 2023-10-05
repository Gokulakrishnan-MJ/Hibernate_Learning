package com.jsp.OneToOne.dao;

import com.jsp.OneToOne.dto.Aadhar;
import com.jsp.OneToOne.dto.Person;

public class Person_dao implements DaoInterface{

	public void savePerson(String name,long phno,String email,Aadhar aadhar)
	{
		Person p1 = new Person();
		p1.setPersonName(name);
		p1.setPersonPhoneNo(phno);
		p1.setPersonEmail(email);
		p1.setAadhar(aadhar);
		
		transaction.begin();
		manager.persist(p1);
		transaction.commit();
	}

	

	

}
