package com.jsp.hibernatedemo;

import com.jsp.hibernatedemo.dto.Student;

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
        //EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("development");
        saveStudentData();
    }
    public static void saveStudentData() {
        
        Student student1 =new Student();
        student1.setStudentID(001);
        student1.setStudentName("Gokul");
        student1.setStudentEmail("suren7219@gmail.com");
        student1.setAddress("chennai");
        
        // jpa code here
        
        EntityManagerFactory EntityManagerFactory = Persistence.createEntityManagerFactory("development");
        EntityManager manager = EntityManagerFactory.createEntityManager();
        EntityTransaction entitytTransaction = manager.getTransaction();
        
        entitytTransaction.begin();
        manager.persist(student1);
        entitytTransaction.commit();
        
    }
}
 