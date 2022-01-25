package com.assessment.web.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	
	@Id
	private int customer_Id;
    private String Customer_Name;
	private String Zip_Cd;
	public int getCustomer_Id() {
		return customer_Id;
	}
	public void setCustomer_Id(int customer_Id) {
		this.customer_Id = customer_Id;
	}
	public String getCustomer_Name() {
		return Customer_Name;
	}
	public void setCustomer_Name(String customer_Name) {
		Customer_Name = customer_Name;
	}
	public String getZip_Cd() {
		return Zip_Cd;
	}
	public void setZip_Cd(String zip_Cd) {
		Zip_Cd = zip_Cd;
	}
	@Override
	public String toString() {
		return "Customer [customer_Id=" + customer_Id + ", Customer_Name=" + Customer_Name + ", Zip_Cd=" + Zip_Cd + "]";
	}
	public Customer() {
		super();
	}
	public Customer(int customer_Id, String customer_Name, String zip_Cd) {
		super();
		this.customer_Id = customer_Id;
		this.Customer_Name = customer_Name;
		this.Zip_Cd = zip_Cd;
	}
	
	

}
