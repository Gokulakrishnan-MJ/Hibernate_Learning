package com.jsp.OneToOne.dao;
import com.jsp.OneToOne.dto.Aadhar;

public class Aadhar_dao implements DaoInterface{
	
	
	public Aadhar saveAadhar(long number,String issueDate,String issuedAuthority) {
		Aadhar aadhar=new Aadhar();
		aadhar.setAadharNumber(number);
		aadhar.setIssueDate(issueDate);
		aadhar.setIssuningAuthority(issuedAuthority);
		transaction.begin();
		manager.persist(aadhar);
		transaction.commit();
		return aadhar;
	}

	
}
