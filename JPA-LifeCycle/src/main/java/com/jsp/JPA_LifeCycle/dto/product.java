package com.jsp.JPA_LifeCycle.dto;

import java.io.Serializable;

public class product implements Serializable {
	
	private int ProductId;
	private String ProductName;
	private int ProductPrice;
	public int getProductId() {
		return ProductId;
	}
	public void setProductId(int productId) {
		ProductId = productId;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public int getProductPrice() {
		return ProductPrice;
	}
	public void setProductPrice(int productPrice) {
		ProductPrice = productPrice;
	}
	
	
	
	
	

}
