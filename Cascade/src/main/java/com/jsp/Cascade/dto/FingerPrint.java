package com.jsp.Cascade.dto;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class FingerPrint {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int fingerprintId;
	@Cascade(CascadeType.PERSIST)
	private String fingerprintName;
	public int getFingerprintId() {
		return fingerprintId;
	}
	public void setFingerprintId(int fingerprintId) {
		this.fingerprintId = fingerprintId;
	}
	public String getFingerprintName() {
		return fingerprintName;
	}
	public void setFingerprintName(String fingerprintName) {
		this.fingerprintName = fingerprintName;
	}
	

}
