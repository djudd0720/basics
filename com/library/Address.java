package com.library;

public class Address {
	private String firstname;
	private String lastname;
	private String staddr;
	private String city;
	private String state;
	private String zip;
	
	//Contructors
	
	public Address() {
		super();
	}


	public Address(String firstname, String lastname, String staddr, String city, String state, String zip) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.staddr = staddr;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	//Getters and Setters
	
	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getStaddr() {
		return staddr;
	}


	public void setStaddr(String staddr) {
		this.staddr = staddr;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getZip() {
		return zip;
	}


	public void setZip(String zip) {
		this.zip = zip;
	}

	//Methods
	
	
}
