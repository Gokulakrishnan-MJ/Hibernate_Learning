package com.jsp.update.hibernate.dao;

import com.jsp.update.hibernate.dto.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class update {
	
	public static void updatedata(int id , String newName) {
		
		EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("development");
		EntityManager createEntityManager = createEntityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = createEntityManager.getTransaction();
		
		
		Employee emp =createEntityManager.find(Employee.class,id);
		
		entityTransaction.begin();
		emp.setEmpName(newName);
		entityTransaction.commit();
		
		System.out.println("Updated Successfully");
		
		
	}
}
