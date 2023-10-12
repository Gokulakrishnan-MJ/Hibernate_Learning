package com.jsp.OneToMany_Bank.dao;

import java.util.Scanner;

import com.jsp.OneToMany_Bank.dto.BankDto;

public class UserInput {
	static Scanner sc=new Scanner(System.in);

	public static BankDto addBank(BankDto bank) 
	{
	
		System.out.println("Enter the Manager Name :");
		bank.setManagerName(sc.next());
		System.out.println("Enter the IFSC code :");
		bank.setIfscCode(sc.next());
		System.out.println("Enter the Branch Location :");
		bank.setLocation(sc.next());
		return bank;		
	}

	public static int getId() {
		
		int id=sc.nextInt();
		return id;
	}

}
