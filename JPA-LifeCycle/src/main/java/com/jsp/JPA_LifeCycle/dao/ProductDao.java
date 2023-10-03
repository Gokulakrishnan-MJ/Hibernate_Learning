package com.jsp.JPA_LifeCycle.dao;

import org.hibernate.loader.entity.CacheEntityLoaderHelper.PersistenceContextEntry;

import com.jsp.JPA_LifeCycle.dto.product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class ProductDao {

	public static void saveProduct()
	{
		
		
		// JPA Steps Starts Here
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		//JPA Steps Ends Here
		
		//JPA is in new/Transient State whenever the instance of the Product.class
		product p=new product();
		
		 
	}
	
	
}
