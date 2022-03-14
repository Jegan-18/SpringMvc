package com.spring.assignment;

public class Address {

	private String street;
	private String city;
	private String state;
	private int zip;
	private String country;

	public void setStreet(String street) {
		this.street = street;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
    public  void display() {
    	System.out.println("My address is "  + street + '\n'+ city + '\n'  + zip  + '\n'  + country);
		return;
		
    }

}
