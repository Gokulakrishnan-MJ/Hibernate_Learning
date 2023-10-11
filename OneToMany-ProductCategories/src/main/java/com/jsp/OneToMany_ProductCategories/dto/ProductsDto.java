package com.jsp.OneToMany_ProductCategories.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ProductsDto {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int productId;
	private String productName;
	private String Dealer;
	private int price;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDealer() {
		return Dealer;
	}
	public void setDealer(String dealer) {
		Dealer = dealer;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
