package com.jsp.JPA_LifeCycle.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public interface ProductInterface {
	
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("development");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();
	
	void saveProduct();
	void removeProduct();

}
