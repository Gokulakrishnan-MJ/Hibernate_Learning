package com.jsp.OneToOne.dto;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Aadhar implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aadharID;
	private long aadharNumber;
	private String issueDate;
	private String issuningAuthority;
	public int getAadharID() {
		return aadharID;
	}

	public long getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(long aadharNumber) {
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
