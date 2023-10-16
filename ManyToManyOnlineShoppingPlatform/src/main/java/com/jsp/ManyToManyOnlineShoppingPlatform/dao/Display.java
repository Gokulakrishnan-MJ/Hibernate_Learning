package com.jsp.ManyToManyOnlineShoppingPlatform.dao;

import java.util.List;

import com.jsp.ManyToManyOnlineShoppingPlatform.dto.EcommerceDto;

import jakarta.persistence.Query;

public class Display implements DaoInterface{
	public static void displayEcommerce()
	{
		Query query = manager.createQuery("select c from CollegeDto c ");
		List<EcommerceDto> list=query.getResultList();
		System.out.println("========================================================================");
		System.out.println("Ecommerce ID\tEcommerce Name");
		for(EcommerceDto ecommerce:list)
		{
			System.out.println(ecommerce.getEcommerceId()+"\t\t"+ecommerce.getName());
		}
		System.out.println("========================================================================");
	}

}
