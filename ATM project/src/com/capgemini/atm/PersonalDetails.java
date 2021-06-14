package com.capgemini.atm;

public class PersonalDetails {

	private String customerName;
	private String address;
	private String email;
	private String accNo;
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public PersonalDetails() {
		super();
	}
	public PersonalDetails(String customerName, String address, String email, String accNo) {
		super();
		this.customerName = customerName;
		this.address = address;
		this.email = email;
		this.accNo = accNo;
	}
	

	
	
}
