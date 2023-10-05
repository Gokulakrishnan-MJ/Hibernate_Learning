package com.jsp.OneToOne.dao;
import com.jsp.OneToOne.dto.Aadhar;

public class Aadhar_dao implements DaoInterface{
	
	
	public static Aadhar insertAadhar() {
		Aadhar aadhar = UserInput.AadharInput();
		transaction.begin();
		manager.persist(aadhar);
		transaction.commit();
		return aadhar;
	}
	
	

	
}
