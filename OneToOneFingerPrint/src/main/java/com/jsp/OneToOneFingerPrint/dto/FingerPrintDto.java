package com.jsp.OneToOneFingerPrint.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class FingerPrintDto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int fingerPrintId;
	private String fingerPrint;
	@OneToOne(mappedBy = "fingerprint")
	private UserDto user;
	
	
	
	public UserDto getUser() {
		return user;
	}
	public void setUser(UserDto user) {
		this.user = user;
	}
	public int getFingerPrintId() {
		return fingerPrintId;
	}
	public void setFingerPrintId(int fingerPrintId) {
		this.fingerPrintId = fingerPrintId;
	}
	public String getFingerPrint() {
		return fingerPrint;
	}
	public void setFingerPrint(String fingerPrint) {
		this.fingerPrint = fingerPrint;
	}
	
	
}
