package com.jsp.OneToMany_Bank;

import java.util.Scanner;

import com.jsp.OneToMany_Bank.dao.Bank;
import com.jsp.OneToMany_Bank.dao.Users;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
        System.out.println("Bank User Management System");
        boolean loop=true;
        while(loop)
        {
        	System.out.println("1. Add Bank Branch");
        	System.out.println("2. Update Branch Details ");
        	System.out.println("3. Remove Branch");
        	System.out.println("4. Display Branch data");
        	System.out.println("5. Add user");
        	System.out.println("6. Update User");
        	System.out.println("7. Remove User");
        	System.out.println("0. Exit");
        	
        	int choice =sc.nextInt();
        	switch(choice)
        	{
        	case 1:
        		Bank.addBank();
        		break;
        	case 2:
        		Bank.updateBank();
        		break;
        	case 3:
        		Bank.deleteBank();
        		break;
        	case 4:
        		Bank.display();
        		break;
        	case 5:
        		Users.addUser();
        		break;
        	case 6:
        		Users.addUser();
        		break;
        	case 7:
        		Users.removeUsers();
        		break;
        	case 0:
        		loop=false;
        		break;
        	default :
        			System.out.println("Enter Valid choice ");
        			break;
        	
        	}
        }
    }
}
