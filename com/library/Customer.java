package com.library;

public class Customer {
//Create a method to add new customer's to the list of customer for a particular library.
	//class Customer has these fields
	
	private String firstName;
	private String lastName;
	//need to call object address for address
	private int libcard;
	//private int totalitems;
	private String signupdate;
	private String emailaddr;
	private String phonenumber;
	private Book[] books;
	//private String deweycode;
	
	//Constructor
	public Customer() {
		super();
	}

	public Customer(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Customer(String firstName, String lastName, int libcard, String signupdate, String emailaddr,
			String phonenumber, Book[] books) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.libcard = libcard;
		this.signupdate = signupdate;
		this.emailaddr = emailaddr;
		this.phonenumber = phonenumber;
		this.books = books;
	}

	
	public Customer(String firstName, String lastName, int libcard) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.libcard = libcard;
	}

	//Getters and Setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getLibcard() {
		return libcard;
	}

	public void setLibcard(int libcard) {
		this.libcard = libcard;
	}

	public String getSignupdate() {
		return signupdate;
	}

	public void setSignupdate(String signupdate) {
		this.signupdate = signupdate;
	}

	public String getEmailaddr() {
		return emailaddr;
	}

	public void setEmailaddr(String emailaddr) {
		this.emailaddr = emailaddr;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		this.books = books;
	}
	
	
	
}