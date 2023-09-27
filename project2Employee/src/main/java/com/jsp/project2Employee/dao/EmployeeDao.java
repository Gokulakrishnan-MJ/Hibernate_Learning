package com.jsp.project2Employee.dao;

import com.jsp.project2Employee.dto.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class EmployeeDao {

	   public static void employeeData(int id,String name,String Addr, long ph)
	    {
	    	Employee emp1=new Employee();
	    	emp1.setEmpid(id);
	    	emp1.setEmpName(name);
	    	emp1.setEmpphone(ph);
	    	emp1.setEmpAddress(Addr);
	    	
	    	
	    	EntityManagerFactory EntityManagerFactory = Persistence.createEntityManagerFactory("development");
	        EntityManager manager = EntityManagerFactory.createEntityManager();
	        EntityTransaction entitytTransaction = manager.getTransaction();
	        
	        entitytTransaction.begin();
	        manager.persist(emp1);
	        entitytTransaction.commit();
	    }
	   
	   public static void findEmployee(int primarykey) {
		   
		   EntityManagerFactory EntityManagerFactory = Persistence.createEntityManagerFactory("development");
	        EntityManager manager = EntityManagerFactory.createEntityManager();
	        EntityTransaction entitytTransaction = manager.getTransaction();
	        
		   Employee emp = manager.find(Employee.class,primarykey);
		   System.out.println(emp.getEmpid()+" "+emp.getEmpName()+" "+emp.getEmpAddress());
	   }
}
