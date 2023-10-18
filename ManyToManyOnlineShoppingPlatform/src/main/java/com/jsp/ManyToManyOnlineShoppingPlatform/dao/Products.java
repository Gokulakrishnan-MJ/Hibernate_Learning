package com.jsp.ManyToManyOnlineShoppingPlatform.dao;

import java.util.ArrayList;
import java.util.List;

import com.jsp.ManyToManyOnlineShoppingPlatform.dto.EcommerceDto;
import com.jsp.ManyToManyOnlineShoppingPlatform.dto.ProductDto;

public class Products implements DaoInterface{
	public static void addProduct()
	{
		ProductDto product =new ProductDto();
		product=UserInput.addProduct(product);
		Display.displayEcommerce();
		int id=UserInput.getID();
		EcommerceDto ecommerce=manager.find(EcommerceDto.class,id);
		List<ProductDto> list=new ArrayList();
		list.add(product);
		ecommerce.setProduct(list);
		transaction.begin();
		manager.persist(product);
		manager.persist(ecommerce);
		transaction.commit();
		System.out.println("Product Added Successfully");
	}
	public static void updateProduct()
	{
		int id=UserInput.getID();
		ProductDto product=manager.find(ProductDto.class, id);
		product=UserInput.addProduct(product);
		transaction.begin();
		manager.persist(product);
		transaction.commit();
		System.out.println("User updated Successfully");
	}
	public static void deleteProduct()
	{
		int id=UserInput.getID();
	}

}
