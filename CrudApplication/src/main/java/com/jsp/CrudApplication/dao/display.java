package com.jsp.CrudApplication.dao;

import java.util.Scanner;

import com.jsp.CrudApplication.dto.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class display {

	public static void displayRecord() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter EmployeeId : ");
		int empid = sc.nextInt();

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");
		EntityManager manager = factory.createEntityManager();

		Employee emp = manager.find(Employee.class, empid);

		System.out.println("Employee ID      : " + emp.getEmployeeId());
		System.out.println("Employee Name    : " + emp.getName());
		System.out.println("Employee Dept    : " + emp.getDept());
		System.out.println("Employee Address : " + emp.getAddress());
		System.out.println("Employee phno    : " + emp.getPhno());

	}

}
