package com.jsp.project2Employee;

import com.jsp.project2Employee.dto.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        employeeData();
    }
    public static void employeeData()
    {
    	Employee emp1=new Employee();
    	emp1.setEmpid(001);
    	emp1.setEmpName("Mani");
    	emp1.setEmpphone(807276957);
    	emp1.setEmpAddress("velachery");
    	
    	
    	EntityManagerFactory EntityManagerFactory = Persistence.createEntityManagerFactory("development");
        EntityManager manager = EntityManagerFactory.createEntityManager();
        EntityTransaction entitytTransaction = manager.getTransaction();
        
        entitytTransaction.begin();
        manager.persist(emp1);
        entitytTransaction.commit();
    }
}

