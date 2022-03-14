package com.spring.assignment;

public class Customer {

	private int customerId;
	private String customerName;
	private int customerContact;
	private Address customerAddress;

	public Customer(int customerId, String customerName, int customerContact, Address customerAddress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.customerAddress = customerAddress;
	}

	public void displayinfo() {

		System.out.println("Customer name " + customerName + " " + "Customer Id is " + customerId + " "
				+ "Customer Contact " + customerContact);
		customerAddress.display();
	}

}
