package com.jsp.OneToOne_UserBirthCertificate.dao;

import com.jsp.OneToOne_UserBirthCertificate.dto.BirthCertificateDTO;

public class BirthCeritificate {

	
	public static void display(BirthCertificateDTO birthCertificate) {
		System.out.println("Birth Certificaate ID :"+birthCertificate.getBirthCertificateId());
		System.out.println("Birth Date :"+birthCertificate.getBirthDate());
		System.out.println("Birth Location :"+birthCertificate.getPlaceOfBirth());
		
	}
	
	

}
