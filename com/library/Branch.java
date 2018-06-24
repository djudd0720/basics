package com.library;

public class Branch {
	//Create a method to get the branch the library is associated with.
	
	private int District;
	private String branchName;
	private String location;
    private String openingHours;
    private Customer[] customer; //??does this go here
    private Book[] books; //books at this branch?




	//Constructors
	public Branch() {
		super();
	}
	public Branch(String branchName) {
		super();
		this.branchName = branchName;
	}
	public Branch(int district, String branchName, String location, String openingHours, Customer[] customer,
			Book[] books) {
		super();
		District = district;
		this.branchName = branchName;
		this.location = location;
		this.openingHours = openingHours;
		this.customer = customer;
		this.books = books;
	}
	
	//Getter and Setters
	
	public int getDistrict() {
		return District;
	}
	public void setDistrict(int district) {
		District = district;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getOpeningHours() {
		return openingHours;
	}
	public void setOpeningHours(String openingHours) {
		this.openingHours = openingHours;
	}
	public Customer[] getCustomer() {
		return customer;
	}
	public void setCustomer(Customer[] customer) {
		this.customer = customer;
	}
	public Book[] getBooks() {
		return books;
	}
	public void setBooks(Book[] books) {
		this.books = books;
	}
	
	//Methods
	
void getBranchname(int District) {
	switch(District) {
	case 1: 
		System.out.println( "Branch is Bridgeton");
		break;
	case 2:
		System.out.println( "Branch is Rock Road");
		break;
	case 3: 
		System.out.println( "Branch is Thornhill");
		break;
}
}
void findloc(String branchName) {
	this.branchName = branchName;
	getLocation(); //????
	System.out.println(location);
	
}	
    
//public String getBranch(int num) {
	

	
}