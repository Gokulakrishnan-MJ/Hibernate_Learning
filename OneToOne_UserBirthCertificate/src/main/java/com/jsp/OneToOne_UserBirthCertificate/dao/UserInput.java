package com.jsp.OneToOne_UserBirthCertificate.dao;

import java.util.Scanner;

import com.jsp.OneToOne_UserBirthCertificate.dto.Person;
import com.jsp.OneToOne_UserBirthCertificate.dto.BirthCertificateDTO;

public class UserInput {
	public static Person addUser(Person person)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Name :");
		person.setUserName(sc.next());
		System.out.print("Enter the Phno :");
		person.setPhno(sc.nextLong());
		System.out.print("Enter AAddress :");
		person.setAddress(sc.next());		
		return person;
	}
	public static BirthCertificateDTO addBirthcertificate(BirthCertificateDTO birthCertificate)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter BirthDate :");
		birthCertificate.setBirthDate(sc.next());
		System.out.println("Enter Birth Location :");
		birthCertificate.setPlaceOfBirth(sc.next());
		
		return birthCertificate;
	}
	public static int getId()
	{
		int id;
		Scanner sc=new Scanner(System.in);
		id=sc.nextInt();
		return id;
	}
}
