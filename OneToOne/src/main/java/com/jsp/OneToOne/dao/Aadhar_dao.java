package com.jsp.OneToOne.dao;
import com.jsp.OneToOne.dto.Aadhar;
import com.jsp.OneToOne.dto.Person;

public class Aadhar_dao implements DaoInterface{
	
	
	public static Aadhar insertAadhar(Aadhar aadhar) {
		aadhar = UserInput.AadharInput(aadhar);
		transaction.begin();
		manager.persist(aadhar);
		transaction.commit();
		System.out.println("------------------------------Aadhar insertion successful---------------------------------------");
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
		System.out.println("------------------------------Aadhar updated Successfully----------------------------------------");
	}
	public static void deleteAadhar(Aadhar aadhar) {
		transaction.begin();
		manager.remove(aadhar);
		transaction.commit();
		System.out.println("------------------------------Aadhar deleted Successfully-----------------------------------------");
		
	}
	public static void displayAadhar(Aadhar aadhar)
	{
		System.out.println("Aadhar Number : "+aadhar.getAadharNumber());
		System.out.println("Aadhar Issued Date :"+aadhar.getIssueDate());
		System.out.println("Aadhar issueing Authority :"+aadhar.getIssuningAuthority());
	}
	
}
