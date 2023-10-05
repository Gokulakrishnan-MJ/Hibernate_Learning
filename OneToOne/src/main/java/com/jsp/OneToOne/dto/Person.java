package com.jsp.OneToOne.dto;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Person implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int personId;
	private String personName;
	private String personEmail;
	private long personPhoneNo;
	private boolean display = true;
	
	//one-to-one relationship

	@OneToOne
	private Aadhar aadhar;

	public int getPersonId() {
		return personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getPersonEmail() {
		return personEmail;
	}

	public void setPersonEmail(String personEmail) {
		this.personEmail = personEmail;
	}

	public long getPersonPhoneNo() {
		return personPhoneNo;
	}

	public void setPersonPhoneNo(long personPhoneNo) {
		this.personPhoneNo = personPhoneNo;
	}

	public Aadhar getAadhar() {
		return aadhar;
	}

	public void setAadhar(Aadhar a) {
		this.aadhar = a;
	}
	public void setDisplay(boolean display) {
		this.display = display;
	}
	public boolean getDisplay()
	{
		return display;
	}
	
}
