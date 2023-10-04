package com.jsp.one_to_one.dao;

import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public interface DaoInterface  {
	
	//Scanner
	Scanner sc=new Scanner(System.in);
	
	
	//JPA Steps
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("development");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();
	
	
	public void insert();
	public void update();
	public void delete();
	public void display();
	

}
