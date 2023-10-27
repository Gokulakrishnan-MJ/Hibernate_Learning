package com.jsp.OneToMany_Bank.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
@Entity
public class UsersDto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	private String userName;
	private String userAccNo;
	private String userPhno;
	@Column(name = "Address")
	private String userAddress;
	
	
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
	public String getUserAccNo() {
		return userAccNo;
	}
	public void setUserAccNo(String userAccNo) {
		this.userAccNo = userAccNo;
	}
	public String getUserPhno() {
		return userPhno;
	}
	public void setUserPhno(String userPhno) {
		this.userPhno = userPhno;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	} 
	@Override
	public String toString() {
		return "User AccNO :"+this.userAccNo+"\nUser Name :"+this.userName+"\nUser Address :"+this.userAddress+"\nUser Address :"+this.userAddress;
		
	}
	
	

}
