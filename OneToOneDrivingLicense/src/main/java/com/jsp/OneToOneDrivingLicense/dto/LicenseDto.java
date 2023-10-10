package com.jsp.OneToOneDrivingLicense.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class LicenseDto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int licenseID;
	
	private long licenseNumber;
	private String expiryDate;
	private String dateOfIssue;
	public int getLicenseID() {
		return licenseID;
	}
	public void setLicenseID(int licenseID) {
		this.licenseID = licenseID;
	}
	public long getLicenseNumber() {
		return licenseNumber;
	}
	public void setLicenseNumber(long licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getDateOfIssue() {
		return dateOfIssue;
	}
	public void setDateOfIssue(String dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}
	
	
}
