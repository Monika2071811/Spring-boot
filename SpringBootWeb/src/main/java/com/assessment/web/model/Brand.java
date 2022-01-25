package com.assessment.web.model;

import javax.persistence.Entity;
import javax.persistence.Id;


public class Brand {
	
	
	private int Brand_Id;
	private String Brand_Name;
	private String Brand_Avail_Status;
	private String Quantity;
	public int getBrand_Id() {
		return Brand_Id;
	}
	public void setBrand_Id(int brand_Id) {
		Brand_Id = brand_Id;
	}
	public String getBrand_Name() {
		return Brand_Name;
	}
	public void setBrand_Name(String brand_Name) {
		Brand_Name = brand_Name;
	}
	public String getBrand_Avail_Status() {
		return Brand_Avail_Status;
	}
	public void setBrand_Avail_Status(String brand_Avail_Status) {
		Brand_Avail_Status = brand_Avail_Status;
	}
	public String getQuantity() {
		return Quantity;
	}
	public void setQuantity(String quantity) {
		Quantity = quantity;
	}
	@Override
	public String toString() {
		return "Brand [Brand_Id=" + Brand_Id + ", Brand_Name=" + Brand_Name + ", Brand_Avail_Status="
				+ Brand_Avail_Status + ", Quantity=" + Quantity + "]";
	}
	
	public Brand() {
		super();
	}
	public Brand(int brand_Id, String brand_Name, String brand_Avail_Status, String quantity) {
		super();
		this.Brand_Id = brand_Id;
		this.Brand_Name = brand_Name;
		this.Brand_Avail_Status = brand_Avail_Status;
		this.Quantity = quantity;
	}
	
	

}
