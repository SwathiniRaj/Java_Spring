package com.sf.java.core;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MainClass {

	public MainClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		CustomerList customers =new CustomerList();
		try {

			File file = new File("src/com/sf/java/core/customers.txt");

			@SuppressWarnings("resource")
			BufferedReader buffer = new BufferedReader(new FileReader(file));
			String readLine = "";


			while ((readLine = buffer.readLine()) != null) {
				String line = readLine;
				String[] values = line.split(",");
				if(values!=null) {
					customers.addCustomer(new Customer(values[0], values[1], values[2], Integer.parseInt(values[3].trim()), Long.parseLong(values[4].trim())));
				}
			}
			
			System.out.println(customers.getCustomers());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
