package com.jsp.OneToMany_Bank.dto;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class BankDto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int branchId;
	private String managerName;
	private String ifscCode;
	private String location;
	
	@OneToMany
	private List<UsersDto> users;

	public int getBankId() {
		return branchId;
	}

	public void setBankId(int bankId) {
		this.branchId = bankId;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<UsersDto> getUsers() {
		return users;
	}

	public void setUsers(List<UsersDto> users) {
		this.users = users;
	}
	
	//getters and setters
	
}
