package com.jsp.CrudApplication.dao;

import java.util.Scanner;

public class update {
	public static void updateData()
	{
		int choice=0;
		Scanner sc=new Scanner(System.in);
		do {
			int Choice;
			System.out.println("1 : update Name");
			System.out.println("2 : update Dept");
			System.out.println("3 : update Address");
			System.out.println("4 : update Phone Numbwe");
			System.out.println("0 : quit Operation");
			System.out.println("");
			System.out.print("Enter Your Choice : ");
			Choice=sc.nextInt();
			switch(Choice)
			{
			case 1:
			{
				break;
			}
			case 2:
			{
				break;
			}
			case 3:
			{
				break;
			}
			case 4:
			{
				
			}
			}
			
			
			
			System.out.println("To update Another Record enter 1 else Enter 0 :");
			choice= sc.nextInt();
		}while(choice==1);
		sc.close();
	}

}
