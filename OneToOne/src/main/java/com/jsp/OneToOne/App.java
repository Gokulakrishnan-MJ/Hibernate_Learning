package com.jsp.OneToOne;

import java.util.Scanner;

import com.jsp.OneToOne.dao.Aadhar_dao;
import com.jsp.OneToOne.dao.Person_dao;
import com.jsp.OneToOne.dao.UserInput;
import com.jsp.OneToOne.dto.Aadhar;
public class App {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Aadhar Based Management System");
		boolean loop=true;
		while(loop)
		{
			System.out.println("-------------------------------------------------------------------------------------------------------------------");
			System.out.println("1.Insert Record");
			System.out.println("2.Update Record");
			System.out.println("3.Delete Record");
			System.out.println("4.Display Record");
			System.out.println("5.Exit");
			System.out.print("Enter your choice :");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				Person_dao.insertPersonData();
				break;
			case 2:
				UserInput.update();
				break;
			case 3:
				Person_dao.deletePerson();
				break;
			case 4:
				Person_dao.displayPerson();
				break;
			case 5:
				loop=false;
				break;
			default:
				System.out.println("Enter a Valid Choice");
			}
		}

	}
}
