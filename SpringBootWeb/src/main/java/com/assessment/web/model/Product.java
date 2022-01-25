package com.assessment.web.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	private int productId;
	private int brandId;
	private String productName;
	private int price;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getBrandId() {
		return brandId;
	}
	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", brandId=" + brandId + ", productName=" + productName + ", price="
				+ price + "]";
	}
	public Product(int productId, int brandId, String productName, int price) {
		super();
		this.productId = productId;
		this.brandId = brandId;
		this.productName = productName;
		this.price = price;
	}
	
	public Product() {
		super();
	}
}
