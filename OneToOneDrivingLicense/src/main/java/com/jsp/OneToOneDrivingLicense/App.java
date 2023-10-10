package com.jsp.OneToOneDrivingLicense;

import java.util.Scanner;

import com.jsp.OneToOneDrivingLicense.dao.Users;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        System.out.println( "Welcome to DrivingLicense Management System" );
        boolean loop=true;
        while(loop)
        {
        	System.out.println("1.Insert User Data ");
        	System.out.println("2.Update User Data");
        	System.out.println("3.Remove User");
        	System.out.println("4.Display User");
        	System.out.println("0.Exit");
        	System.out.print("Enter Your choice :");
        	int choice =sc.nextInt();
        	switch(choice)
        	{
        	case 1:
        		Users.AddUser();
        		break;
        	case 2 :
        		Users.AddUser();
        		break;
        	case 3:
        		Users.removeUser();
        		break;
        	case 4:
        		Users.display();
        		break;
        	case 0:
        		loop=false;
        		System.out.println("Exiting Application..............");
        		break;
        	default:
        		System.out.println("Enter Valid Choice");
        	}
        	
        }
    }
}
