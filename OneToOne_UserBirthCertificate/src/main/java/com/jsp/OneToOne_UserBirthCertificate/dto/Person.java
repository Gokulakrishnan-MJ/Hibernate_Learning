package com.jsp.OneToOne_UserBirthCertificate.dto;

import java.io.Serializable;

import javax.annotation.processing.Generated;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
@Entity
public class Person implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	private String userName;
	private String Address;
	private long Phno;
	
	@OneToOne
	BirthCertificateDTO birthCertificate;

	public int getUserId() {
		return userId;
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
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public long getPhno() {
		return Phno;
	}

	public void setPhno(long phno) {
		Phno = phno;
	}

	public BirthCertificateDTO getBirthCertificate() {
		return birthCertificate;
	}

	public void setBirthCertificate(BirthCertificateDTO birthCertificate) {
		this.birthCertificate = birthCertificate;
	}
	
	

}
