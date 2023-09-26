package com.jsp.hibernatedemo;


import com.jsp.hibernatedemo.dto.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Main Starts");
       
        saveStudentData();
        System.out.println("Main Ends");
    }
    public static void saveStudentData() {
        
        Student student1 =new Student();
        student1.setStudentID(006);
        student1.setStudentName("Mani");
        student1.setStudentEmail("mani@gmail.com");
        student1.setAddress("Banglore");
        
        // jpa code here
        
        EntityManagerFactory EntityManagerFactory = Persistence.createEntityManagerFactory("development");
        EntityManager manager = EntityManagerFactory.createEntityManager();
        EntityTransaction entitytTransaction = manager.getTransaction();
        
        entitytTransaction.begin();
        manager.persist(student1);
        entitytTransaction.commit();
        
    }
   
}
 