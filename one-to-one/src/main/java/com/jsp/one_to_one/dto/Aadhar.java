package com.jsp.one_to_one.dto;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Aadhar implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aadharID;
	private String aadharNumber;
	private String issueDate;
	private String issuningAuthority;
	public int getAadharID() {
		return aadharID;
	}
	public void setAadharID(int aadharID) {
		this.aadharID = aadharID;
	}
	public String getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	public String getIssuningAuthority() {
		return issuningAuthority;
	}
	public void setIssuningAuthority(String issuningAuthority) {
		this.issuningAuthority = issuningAuthority;
	}
	
	
	
	

}
