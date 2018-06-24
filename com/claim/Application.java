package com.claim;

public class Application {

	public static void main(String[] args) {
		// calls the class Student in other program
		Student student1 = new Student();
		Student student2 = new Student("Denise", "Judd");
		System.out.println(student2.getFirstName() + " " + student2.getLastName());
		
		student1.setFirstName("Julie");
		student1.setLastName("Radan");
	
		
		System.out.println(student1.getFirstName() + " " + student1.getLastName());
	}

}
