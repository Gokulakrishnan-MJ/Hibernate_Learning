package com.jsp.CrudApplication.dao;

import java.util.Scanner;

import com.jsp.CrudApplication.dto.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class delete {
	public static void deleteRecord() {
		int choice=0;
		Scanner sc=new Scanner(System.in);
		do
		{
			int empid;
			
			System.out.print("Enter EmployeeID : ");
			empid=sc.nextInt();
			
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			
			Employee emp =manager.find(Employee.class,empid); 
	        
	        transaction.begin();
	        manager.remove(emp);
	        transaction.commit();
	        
	        System.out.println("To Delete Another Record enter 1 else Enter 0 :");
			choice= sc.nextInt();
			
			
		}while(choice==1);
		
		sc.close();
	}

}
