package com.jsp.ManyToManyOnlineShoppingPlatform.dao;

import com.jsp.ManyToManyOnlineShoppingPlatform.dto.EcommerceDto;

public class Ecommerce implements DaoInterface {
	
	public static void addEcommerce()
	{
		EcommerceDto ecommerce=new EcommerceDto();
		ecommerce=UserInput.addEcommerce(ecommerce);
		
		transaction.begin();
		manager.persist(ecommerce);
		transaction.commit();
		System.out.println("Ecommerce Website Added Successfully");
		
	}
	public static void updateEcommerce()
	{
		int id=UserInput.getID();
		EcommerceDto ecommerce= manager.find(EcommerceDto.class, id);
		ecommerce=UserInput.addEcommerce(ecommerce);
		transaction.begin();
		manager.persist(ecommerce);
		transaction.commit();
		System.out.println("Ecommerce Website Updated Successfully");
		
	}
	public static void deleteEcommerce()
	{
		int id=UserInput.getID();
		
	}

}
