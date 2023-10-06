package com.jsp.OneToOne.dao;
import java.util.Scanner;

import com.jsp.OneToOne.dto.Aadhar;
import com.jsp.OneToOne.dto.Person;

public class UserInput {
	
	public static Aadhar AadharInput(Aadhar aadhar)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("------------------------------------------------------------------------------------------------------");
		System.out.print("Enter Aadhar Number : ");
		aadhar.setAadharNumber(sc.nextLong());
		System.out.print("Enter Issue Date [FORMAT =  DD/MM/YYYY] : ");
		aadhar.setIssueDate(sc.next());
		System.out.print("Enter issuingAuthority : ");
		aadhar.setIssuningAuthority(sc.next());
		return aadhar;
	}
	public static Person PersonInput(Person person)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("------------------------------------------------------------------------------------------------------");
		System.out.print("Enter the Name :");
		person.setPersonName(sc.next());
		System.out.print("Enter the Email :");
		person.setPersonEmail(sc.next());
		System.out.print("Enter the Phone No :");
		person.setPersonPhoneNo(sc.nextLong());
		return person;
	}
	public static int  PersonId()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("------------------------------------------------------------------------------------------------------");
		System.out.print("Enter the person ID :");
		int id=sc.nextInt();
		return id;		
	}
	public static void update()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("------------------------------------------------------------------------------------------------------");
		System.out.println("1.Update Person Data");
		System.out.println("2.Update Aadhar Data");
		int choice=sc.nextInt();
		if(choice==1)
		{
			Person_dao.UpdatePerson();
		}
		else if(choice==2)
		{
			Aadhar_dao.UpdateAadhar();
		}
		else
		{
			System.out.println("Invalid Choice");
		}
	}

}
