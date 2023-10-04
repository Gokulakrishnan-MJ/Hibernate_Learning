package com.jsp.JPA_LifeCycle.dao;

import org.hibernate.loader.entity.CacheEntityLoaderHelper.PersistenceContextEntry;

import com.jsp.JPA_LifeCycle.dto.product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class ProductDao implements ProductInterface {

	public void saveProduct() {

		product p = new product();

		transaction.begin();
		// JPA is in Managed State
		manager.persist(p);
		transaction.commit();

	}

	public void removeProduct() {

	
		product p = new product();

		// JPA is in Removed State
		manager.remove(p);
		transaction.commit();

	}

	public static void clearManager() {

		
	

		// JPA is in Detached State
		manager.clear();// it will clear all the object reference present in persistence context
		manager.close();// it will close the persistence context

		// JPA is in Detached State
		// factory.close(); //it will close the EntityManagerFactory
		// NOTE : EntityManagerFactory is responsible for the Connection of the Database
	}

}
