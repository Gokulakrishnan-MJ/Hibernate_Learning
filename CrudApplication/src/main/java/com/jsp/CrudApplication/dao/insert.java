package com.jsp.CrudApplication.dao;

import java.util.Scanner;

import com.jsp.CrudApplication.dto.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class insert {

	public static void insertData() {
		// Scanner instance
		Scanner sc = new Scanner(System.in);

		// Employee instance
		Employee emp = new Employee();

		// user inputs
		System.out.println("Enter the data to insert");
		System.out.print("Enter Name : ");
		emp.setName(sc.next());
		System.out.print("Enter Dept : ");
		emp.setDept(sc.next());
		System.out.println("Enter Address : ");
		emp.setAddress(sc.next());
		System.out.println("Enter Phone No : ");
		emp.setPhno(sc.nextLong());

		// JPA Steps
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		transaction.begin();
		manager.persist(emp);
		transaction.commit();

	}

}
