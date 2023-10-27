package com.jsp.OneToOneFingerPrint;

import com.jsp.OneToOneFingerPrint.dto.FingerPrintDto;
import com.jsp.OneToOneFingerPrint.dto.UserDto;

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
       //addUser();
       fetchUser();
    }
    public static void addUser()
    {
    	FingerPrintDto finger=new FingerPrintDto();
    	finger.setFingerPrint("Gokul");
    	
    	
    	UserDto user =new UserDto();
    	user.setUserName("Suren");
    	user.setPhNo(8072769573L);
    	user.setAddress("Chennai");
    	user.setFingerprint(finger);
    	finger.setUser(user);
        //JPA steps
    	EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");
    	EntityManager manager = factory.createEntityManager();
    	EntityTransaction transaction = manager.getTransaction();
    	transaction.begin();
    	manager.persist(user);
    	transaction.commit();
    }
    public static void fetchUser()
    {
    	 //JPA steps
    	EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");
    	EntityManager manager = factory.createEntityManager();
    	
    	UserDto user=manager.find(UserDto.class,1);
    	System.out.println();
    	
    	
    }
}
