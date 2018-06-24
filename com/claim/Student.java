package com.claim;

public class Student {

	//The class Student has 2 fields

	private String firstName;

	private String lastName;
	
	//and it has 2 constructors below

	public Student() {}

	public Student (String firstName, String lastName) {

		this.firstName = firstName;
		this.lastName = lastName;

	}
	
	//below are 4 methods for this class

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}