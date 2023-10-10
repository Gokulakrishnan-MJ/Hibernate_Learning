package com.jsp.OneToOneDrivingLicense.dao;

import com.jsp.OneToOneDrivingLicense.dto.LicenseDto;

public class License {

	public static void display(LicenseDto license) {
		System.out.println("License Number :"+license.getLicenseNumber());
		System.out.println("Expiry Date :"+license.getExpiryDate());
		System.out.println("Data of Issue :"+license.getDateOfIssue());
		
	}

	

}
