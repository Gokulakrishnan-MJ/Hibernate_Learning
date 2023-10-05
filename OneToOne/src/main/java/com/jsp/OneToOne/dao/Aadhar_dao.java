package com.jsp.OneToOne.dao;
import com.jsp.OneToOne.dto.Aadhar;
import com.jsp.OneToOne.dto.Person;

public class Aadhar_dao implements DaoInterface{
	
	
	public static Aadhar insertAadhar(Aadhar aadhar) {
		aadhar = UserInput.AadharInput(aadhar);
		transaction.begin();
		manager.persist(aadhar);
		transaction.commit();
		return aadhar;
	}
	public static void UpdateAadhar() {
		int id=UserInput.PersonId();
		Person person=manager.find(Person.class,id);
		Aadhar aadhar=person.getAadhar();
		aadhar=UserInput.AadharInput(aadhar);
		transaction.begin();
		manager.persist(aadhar);
		transaction.commit();
	}
	

	
}
