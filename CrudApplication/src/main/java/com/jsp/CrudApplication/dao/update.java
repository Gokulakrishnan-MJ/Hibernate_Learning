package com.jsp.CrudApplication.dao;

import java.math.BigInteger;
import java.util.Scanner;

import com.jsp.CrudApplication.dto.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class update {
	public static void updateData() {

		Scanner sc = new Scanner(System.in);
		int id;

		// JPA Steps

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		System.out.print("Enter Employee ID : ");
		id = sc.nextInt();

		Employee emp = manager.find(Employee.class, id);
		int Choice;
		System.out.println("1 : update Name");
		System.out.println("2 : update Dept");
		System.out.println("3 : update Address");
		System.out.println("4 : update Phone Numbwe");
		System.out.println("");
		System.out.print("Enter Your Choice : ");
		Choice = sc.nextInt();
		switch (Choice) {
		case 1: {
			System.out.println("Enter the NewName : ");
			String newName = sc.next();
			transaction.begin();
			emp.setName(newName);
			transaction.commit();
			System.out.println("Name Updated Successfully...");
			break;
		}
		case 2: {
			System.out.println("Enter the New DeptName : ");
			String newDept = sc.next();
			transaction.begin();
			emp.setDept(newDept);
			transaction.commit();
			System.out.println("DeptName Updated Successfully...");
			break;
		}
		case 3: {
			System.out.println("Enter the New Address : ");
			String newAddress = sc.next();
			transaction.begin();
			emp.setAddress(newAddress);
			transaction.commit();
			System.out.println("Address Updated Successfully...");
			break;
		}
		case 4: {
			System.out.println("Enter the New Phone Number : ");
			BigInteger newNo = sc.nextBigInteger();
			transaction.begin();
			emp.setPhno(newNo);
			transaction.commit();
			System.out.println("Name Updated Successfully...");
			break;
		}

		}

	}

}
