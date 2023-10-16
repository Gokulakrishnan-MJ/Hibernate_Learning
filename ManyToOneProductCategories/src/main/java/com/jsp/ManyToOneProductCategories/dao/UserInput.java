package com.jsp.ManyToOneProductCategories.dao;

import java.util.Scanner;

import com.jsp.ManyToOneProductCategories.dto.Categoriesdto;
import com.jsp.ManyToOneProductCategories.dto.Productsdto;

public class UserInput {
	static Scanner sc=new Scanner(System.in);
	public static int  getId()
	{
		System.out.println("Enter the ID :");
		int id=sc.nextInt();
		return id;
	}
	public static Categoriesdto addCategory(Categoriesdto category)
	{
		System.out.println("Enter Category Name :");
		category.setCategoryName(sc.next());
		return category;
	}
	public static Productsdto addproduct(Productsdto product) {
		System.out.println("Enter product Name :");
		product.setProductName(sc.next());
		System.out.println("Enter Product Price :");
		product.setPrice(sc.nextInt());
		System.out.println("Enter the Product Rating :");
		product.setRating(sc.nextInt());
		return product;
	}

}
