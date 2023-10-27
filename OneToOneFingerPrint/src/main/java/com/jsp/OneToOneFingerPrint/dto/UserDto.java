package com.jsp.OneToOneFingerPrint.dto;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;

@Entity
public class UserDto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	private String userName;
	private String address;
	
	private Long phNo;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ForeignKey",referencedColumnName ="fingerPrint")
	private FingerPrintDto fingerprint;
	
	
	
	public int getUserId() {
		return userId;
	}
	public FingerPrintDto getFingerprint() {
		return fingerprint;
	}
	public void setFingerprint(FingerPrintDto fingerprint) {
		this.fingerprint = fingerprint;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getPhNo() {
		return phNo;
	}
	public void setPhNo(Long phNo) {
		this.phNo = phNo;
	}
	

}
