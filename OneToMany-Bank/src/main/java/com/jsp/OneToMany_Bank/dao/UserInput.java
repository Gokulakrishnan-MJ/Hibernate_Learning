package com.jsp.OneToMany_Bank.dao;

import java.util.Scanner;

import com.jsp.OneToMany_Bank.dto.BankDto;
import com.jsp.OneToMany_Bank.dto.UsersDto;

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

	public static UsersDto addUser(UsersDto users) {
		 System.out.println("Enter User Name :");
		 users.setUserName(sc.next());
		 System.out.println("Enter User Acc No :");
		 users.setUserAccNo(sc.next());
		 System.out.println("Enter Ph NO :");
		 users.setUserPhno(sc.next());
		 System.out.println("Enter Address :");
		 users.setUserAddress(sc.next());
		return users;
		 
		
	}

}
