package com.sf.FileToObject;

import java.util.ArrayList;

public class CustomerList {
	private ArrayList<Customer> customers=new ArrayList<>();

	public ArrayList<Customer> getCustomers() {
		return customers;
	}

	public void addCustomer(Customer customer) {
		customers.add(customer);
	}

	public CustomerList() {
		// TODO Auto-generated constructor stub
	}

}
