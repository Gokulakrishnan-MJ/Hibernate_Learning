package com.jsp.update.hibernate.dao;

import com.jsp.update.hibernate.dto.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class deleteRecord {
	
	public static void delete(int id)
	{
		EntityManagerFactory EntityManagerFactory = Persistence.createEntityManagerFactory("development");
        EntityManager manager = EntityManagerFactory.createEntityManager();
        EntityTransaction entitytTransaction = manager.getTransaction();
        
        Employee emp =manager.find(Employee.class,id); 
        
        entitytTransaction.begin();
        manager.remove(emp);
        entitytTransaction.commit();
        
        System.out.println("Record Deleted Successfully");
	}
}
