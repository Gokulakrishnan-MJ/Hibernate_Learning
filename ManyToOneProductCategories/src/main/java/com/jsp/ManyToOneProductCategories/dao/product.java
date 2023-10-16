package com.jsp.ManyToOneProductCategories.dao;

import com.jsp.ManyToOneProductCategories.dto.Categoriesdto;
import com.jsp.ManyToOneProductCategories.dto.Productsdto;

public class product implements DaoInterface{
	public static void addProduct()
	{
		Productsdto product=new Productsdto();
		product=UserInput.addproduct(product);
		Display.displayCategories();
		int id=UserInput.getId();
		Categoriesdto category = manager.find(Categoriesdto.class, id);
		product.setCategory(category);
		transaction.begin();
		manager.persist(product);
		transaction.commit();
		System.out.println("Proct inserted completd");
	}
	public static void updateProduct()
	{
		int id=UserInput.getId();
		Productsdto product=manager.find(Productsdto.class, id);
		product=UserInput.addproduct(product);
		transaction.begin();
		manager.persist(product);
		transaction.commit();
		System.out.println("Product Updateion completed");
	}
	public static void deleteProduct()
	{
		int id=UserInput.getId();
		Productsdto product=manager.find(Productsdto.class, id);
		transaction.begin();
		manager.remove(product);
		transaction.commit();
		System.out.println("Product removed Successfully");
	}
	

}
