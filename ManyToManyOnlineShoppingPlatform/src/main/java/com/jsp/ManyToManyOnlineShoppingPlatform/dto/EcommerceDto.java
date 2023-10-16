package com.jsp.ManyToManyOnlineShoppingPlatform.dto;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class EcommerceDto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ecommerceId;
	private String name;
	private String headquarters;
	private String paymentPartner;
	@ManyToMany
	List<ProductDto> product;
	public List<ProductDto> getProduct() {
		return product;
	}
	public void setProduct(List<ProductDto> product) {
		this.product = product;
	}
	public int getEcommerceId() {
		return ecommerceId;
	}
	public void setEcommerceId(int ecommerceId) {
		this.ecommerceId = ecommerceId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHeadquarters() {
		return headquarters;
	}
	public void setHeadquarters(String headquarters) {
		this.headquarters = headquarters;
	}
	public String getPaymentPartner() {
		return paymentPartner;
	}
	public void setPaymentPartner(String paymentPartner) {
		this.paymentPartner = paymentPartner;
	}
	
	

}
