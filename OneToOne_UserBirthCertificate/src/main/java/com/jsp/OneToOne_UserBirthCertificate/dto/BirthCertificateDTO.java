package com.jsp.OneToOne_UserBirthCertificate.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BirthCertificateDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int birthCertificateId;
	
	private String birthDate;
	private String placeOfBirth;
	
	
	public int getBirthCertificateId() {
		return birthCertificateId;
	}
	public void setBirthCertificateId(int birthCertificateId) {
		this.birthCertificateId = birthCertificateId;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getPlaceOfBirth() {
		return placeOfBirth;
	}
	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}
	
	

}
