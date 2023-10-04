package com.jsp.JPA_LifeCycle.dao;

import org.hibernate.loader.entity.CacheEntityLoaderHelper.PersistenceContextEntry;

import com.jsp.JPA_LifeCycle.dto.product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class ProductDao {

	public static void saveProduct() {

		// JPA Steps Starts Here
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		// JPA Steps Ends Here

		// JPA is in new/Transient State whenever the instance of the Product.class
		product p = new product();

		transaction.begin();
		// JPA is in Managed State
		manager.persist(p);
		transaction.commit();
 
	}

	public static void removeProduct() {

		// JPA Steps Starts Here
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		// JPA Steps Ends Here

		// JPA is in new/Transient State whenever the instance/object of the Product.class is created
		product p = new product();

		// JPA is in Removed State
		manager.remove(p);
		transaction.commit();

	}
	
	public static void clearManager() {
		
		
		
	}

}
