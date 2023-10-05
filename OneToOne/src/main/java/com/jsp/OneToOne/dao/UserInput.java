package com.jsp.OneToOne.dao;
import java.util.Scanner;

import com.jsp.OneToOne.dto.Aadhar;
import com.jsp.OneToOne.dto.Person;

public class UserInput {
	
	public static Aadhar AadharInput()
	{
		Scanner sc=new Scanner(System.in);
		Aadhar aadhar = new Aadhar();
		System.out.print("Enter Aadhar Number : ");
		aadhar.setAadharNumber(sc.nextLong());
		System.out.print("Enter Issue Date [FORMAT =  DD/MM/YYYY] : ");
		aadhar.setIssueDate(sc.next());
		System.out.print("Enter issuingAuthority : ");
		aadhar.setIssuningAuthority(sc.next());
		return aadhar;
	}
	public static Person PersonInput(Aadhar aadhar)
	{
		Scanner sc=new Scanner(System.in);
		Person person=new Person();
		System.out.print("Enter the Name :");
		person.setPersonName(sc.next());
		System.out.print("Enter the Email :");
		person.setPersonEmail(sc.next());
		System.out.print("Enter the Phone No :");
		person.setPersonPhoneNo(sc.nextLong());
		person.setAadhar(aadhar);
		return person;
	}
}
