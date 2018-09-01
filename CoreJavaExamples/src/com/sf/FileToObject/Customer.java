package com.sf.FileToObject;

public class Customer {
	private String customerId;
	private String customerName;
	private String address;
	private int creditLimit;
	private long contactNo;
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public Customer(String customerId, String customerName, String address, int creditLimit, long contactNo) {
		//super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.address = address;
		this.creditLimit = creditLimit;
		this.contactNo = contactNo;
	}

	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
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
	public int getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(int creditLimit) {
		this.creditLimit = creditLimit;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", address=" + address
				+ ", creditLimit=" + creditLimit + ", contactNo=" + contactNo + "]";
	}

}
