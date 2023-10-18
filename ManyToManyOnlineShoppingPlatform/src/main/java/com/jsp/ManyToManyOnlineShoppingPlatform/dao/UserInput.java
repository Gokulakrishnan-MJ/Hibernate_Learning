package com.jsp.ManyToManyOnlineShoppingPlatform.dao;

import java.util.Scanner;

import com.jsp.ManyToManyOnlineShoppingPlatform.dto.EcommerceDto;
import com.jsp.ManyToManyOnlineShoppingPlatform.dto.ProductDto;

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
		return ecommerce;
	}
	public static ProductDto addProduct(ProductDto product)
	{
		System.out.println("Enter the ProductName :");
		product.setProductName(sc.next());
		System.out.println("Enter the BrandName :");
		product.setBrand(sc.next());
		System.out.println("Enter the Price :");
		product.setPrice(sc.nextInt());
		System.out.println("Enter the SellerName");
		product.setSeller(sc.next());
		
		return product;
	}

}
