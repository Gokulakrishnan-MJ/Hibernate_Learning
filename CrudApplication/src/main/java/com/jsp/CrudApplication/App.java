package com.jsp.CrudApplication;

import java.util.Scanner;

import com.jsp.CrudApplication.dao.delete;
import com.jsp.CrudApplication.dao.insert;
import com.jsp.CrudApplication.dao.update;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
        System.out.println( "Welcome to Employee Management System" );
        System.out.println();  
        boolean loop=true;
        int Choice;
        while(loop)
        {
        	
        	System.out.println("1 : Insert Employee Record");
        	System.out.println("2 : Update Employee Data");
        	System.out.println("3 : Delete Employee Record");
        	System.out.println("4 : EXIT");
        	System.out.print("Enter Your Choice :");
        	Choice=sc.nextInt();
        	switch(Choice)
        	{
        	case 1:
        	{
        		insert.insertData();
        		System.out.println("Insert Operation performed Successfully...");
        		break;
        	}
        	case 2:
        	{
        		update.updateData();
        		System.out.println("Update Operation performed Successfully...");
        		break;
        	}
        	case 3:
        	{
        		delete.deleteRecord();
        		System.out.println("Delete Operation performed Successfully...");
        		break;
        	}
        	case 4:
        	{
        		System.out.println("Exiting Application...");
        		loop=false;
        		break;
        	}
        	default :
        	{
        		System.out.println("enter a valid choice");
        	}
        	} 
        	System.out.println("-----------------------------------------------------------------------------------------------------");
        	   
        	
        }
        sc.close();        }
}
