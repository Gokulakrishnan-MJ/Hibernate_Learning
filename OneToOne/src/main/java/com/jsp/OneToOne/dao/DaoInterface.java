package com.jsp.OneToOne.dao;

import com.jsp.OneToOne.dto.Aadhar;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public interface DaoInterface {

	//JPA steps
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("development");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();
	
	
	
	
}
