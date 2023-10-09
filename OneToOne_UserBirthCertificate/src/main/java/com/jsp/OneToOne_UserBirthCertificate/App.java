package com.jsp.OneToOne_UserBirthCertificate;

import java.util.Scanner;

import com.jsp.OneToOne_UserBirthCertificate.dao.User;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
        System.out.println( "Welcome to child Birth Management System" );
        boolean loop=true;
        while(loop)
        {
        	System.out.println("1.Insert User Data ");
        	System.out.println("2.Update User Data");
        	System.out.println("3.Remove User");
        	System.out.println("4.Display User");
        	System.out.println("0.Exit");
        	
        	int choice =sc.nextInt();
        	switch(choice)
        	{
        	case 1:
        		User.AddUser();
        		break;
        	case 2 :
        		User.UpdateUser();
        		break;
        	case 3:
        		User.removeUser();
        		break;
        	case 4:
        		User.display();
        		break;
        	case 0:
        		loop=false;
        		break;
        	default:
        		System.out.println("Enter Valid Choice");
        	}
        	
        }
        
    }
}
