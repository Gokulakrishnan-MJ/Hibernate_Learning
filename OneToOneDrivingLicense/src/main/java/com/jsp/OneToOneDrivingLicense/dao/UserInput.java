package com.jsp.OneToOneDrivingLicense.dao;

import java.util.Scanner;

import com.jsp.OneToOneDrivingLicense.dto.LicenseDto;
import com.jsp.OneToOneDrivingLicense.dto.User;

public class UserInput implements DaoInterface{

	public static LicenseDto addLicense(LicenseDto license) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the License Number :");
		license.setLicenseNumber(sc.nextLong());
		System.out.print("Enter the License Issue Date :");
		license.setDateOfIssue(sc.next());
		System.out.println("Enter the License Expiry Data :");
		license.setExpiryDate(sc.next());
		transaction.begin();
		manager.persist(license);
		transaction.commit();
		return license;
	}

	public static User addUser(User user) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name :");
		user.setUserName(sc.next());
		System.out.println("Enter PH no :");
		user.setPhno(sc.nextLong());
		System.out.println("Enter Address :");
		user.setAddress(sc.next());
		
		return user;
	}

	public static int getId() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		return id;
	}

}
