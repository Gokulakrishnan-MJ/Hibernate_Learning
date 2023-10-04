package com.jsp.one_to_one;

import java.util.Scanner;

import com.jsp.one_to_one.dao.CRUD;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to AADHAR based Person Management System");
		System.out.println();
		boolean loop = true;
		int Choice;
		while (loop) {

			System.out.println("1 : Insert  Record");
			System.out.println("2 : Update  Data");
			System.out.println("3 : Delete  Record");
			System.out.println("4 : Display a Record");
			System.out.println("5 : EXIT");
			System.out.print("Enter Your Choice :");
			Choice = sc.nextInt();
			CRUD operation = new CRUD();
			switch (Choice) {
			case 1: {
				operation.insert();
				System.out.println("Insert Operation performed Successfully...");
				break;
			}
			case 2: {
				operation.update();
				System.out.println("Update Operation performed Successfully...");
				break;
			}
			case 3: {
				operation.delete();
				System.out.println("Delete Operation performed Successfully...");
				break;
			}
			case 4:
			{
				operation.display();
				System.out.println("Display operation Performed Successfully");
				break;
			}
			case 5: {
				System.out.println("Exiting Application...");
				loop = false;
				break;
			}
			default: {
				System.out.println("enter a valid choice");
			}
			}
			System.out.println(
					"-----------------------------------------------------------------------------------------------------");

		}
		sc.close();

    }
}
