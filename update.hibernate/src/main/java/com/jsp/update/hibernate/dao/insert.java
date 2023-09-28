package com.jsp.update.hibernate.dao;

import com.jsp.update.hibernate.dto.*;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class insert {
	public static void inserdata() {
		
		for(int i=1;i<6;i++)
		{
			Employee emp1=new Employee();
	    	emp1.setEmpid(i);
	    	emp1.setEmpName("emp"+i);
	    	emp1.setEmpphone(80727695+i);
	    	emp1.setEmpAddress("60320"+i);
		
    	
    	
    	EntityManagerFactory EntityManagerFactory = Persistence.createEntityManagerFactory("development");
        EntityManager manager = EntityManagerFactory.createEntityManager();
        EntityTransaction entitytTransaction = manager.getTransaction();
        
        entitytTransaction.begin();
        manager.persist(emp1);
        entitytTransaction.commit();
		}
	}

}
