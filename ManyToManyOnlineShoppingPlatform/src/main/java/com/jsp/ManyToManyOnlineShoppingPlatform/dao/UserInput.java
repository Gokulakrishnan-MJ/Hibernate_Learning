package com.jsp.ManyToManyOnlineShoppingPlatform.dao;

import java.util.Scanner;

import com.jsp.ManyToManyOnlineShoppingPlatform.dto.EcommerceDto;

public class UserInput {
	static Scanner sc=new Scanner(System.in);
	public static int getID()
	{
		System.out.println("Enter the ID :");
		int id=sc.nextInt();
		return id;
	}
	public static EcommerceDto addEcommerce(EcommerceDto ecommerce) {
		System.out.println("Enter the Ecommers Name :");
		ecommerce.setName(sc.next());
		System.out.println("Enter the Ecommerce HeadQuarters :");
		ecommerce.setHeadquarters(sc.next());
		System.out.println("Enter the Payment Partner :");
		ecommerce.setPaymentPartner(sc.next());
		return null;
	}

}
