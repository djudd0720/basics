package com.library;


public class Application2 {

	public static void main(String[] args) {
		// This is the main to call and use Library class
		//Your program should be able to print out a customer's name and all the books,
		//checked out under their names. 
		
		//Customer customer1 = new Customer();
		//Customer customer2 = new Customer("Denise", "Judd");
		//Customer customer3 = new Customer(12345);
		//stem.out.println(customer2.getFirstName() + " " + customer2.getLastName());
		//System.out.println(customer3.getName());
		
		//customer1.setFirstName("Julie");
		//customer1.setLastName("Radan");
	
		//Branch [] branchNum = {" ", " "};
		//System.out.println(student1.getFirstName() + " " + student1.getLastName());
		Library LibDistrict1 = new Library();
		Library LibDistrict2 = new Library();
		Library LibDistrict3 = new Library();
		LibDistrict1.nameofdistrict = "St Louis County";
		
		LibDistrict2.nameofdistrict = "St Louis City";
		LibDistrict3.nameofdistrict = "St Charles County";
		
		Branch branch1 = new Branch();
		Branch branch2 = new Branch();
		Branch branch3 = new Branch();
		
		branch1.setBranchName("Bridgeton Trails");
		branch2.setBranchName("Rock Road");
		branch3.setBranchName("Thornhill");
		branch1.setLocation("123 McKelvey Rd");		
		branch2.setLocation("333 St Charles Rock Road");
		branch3.setLocation("888 Fee Fee Road");
		
		LibDistrict1.addBranch(branch1);
		
		Customer cust1 = new Customer("Denise", "Judd", 7399);
		Customer cust2 = new Customer();
		Address cust3 = new Address("Jamie","Jacobs", "62 North Lake St", "Creve Coeur", "MO", "63222");
		//Address cust1 = new Address("Denise", "Judd", "123 Maple St", "Richmond", "VA", "23228");
		cust2.setLastName("Radan");
		cust2.setFirstName("Kristi");
		
		Address custaddr1 = new Address();
		Address custaddr2 = new Address();
		custaddr1.setFirstname("Eileen");
		custaddr1.setLastname("Hall");
		
		custaddr1.setStaddr("2367 Royal Road");
		custaddr1.setCity("Bridgeton");
		custaddr1.setState("Missouri");
		custaddr1.setZip("63044");
		custaddr2.setStaddr("7789 Jones Lane");
		custaddr2.setCity("St Louis");
		custaddr2.setState("MO");
		custaddr2.setZip("63141");
		
		Book book1 = new Book("Sisters","Jodie Piccoult", "34567", 326, "Bridgeton Trails");
		Book book2 = new Book("Jack of all Trades", "Roger Huette", "55555", 67, "Thornhill");
		Book book3 = new Book("The Way Back", "Denise Judd", "99999", 340, "Bridgeton Trails");
		
		Book bookList [] = {book1,book2,book3};
		
		Library enterBookList = new Library();
		enterBookList.setBook(bookList);
		
		//Get the book list
		Book [] getBookArray =enterBookList.getBook();
		for (int i = 0; i < getBookArray.length; i++) {
			System.out.println(getBookArray[i].getTitle());
		}

		
		Branch Branchrequest = new Branch();
		
		
		Branchrequest.setBranchName("Bridgeton Trails");
		//findloc(Branchrequest.getBranchName());
		System.out.println(Branchrequest.getBranchName());
		System.out.println(Branchrequest.getLocation());
		Branchrequest.getBranchname(1); //method to print Branch name for int 1
		
		
		System.out.println("Customer1 is: " + cust1.getFirstName() + " " + cust1.getLastName());
		System.out.println("And the library card number is " + cust1.getLibcard());
	}

	

	//private static void Branch getbranchname(int i) {
		// TODO Auto-generated method stub
		
//	}

}
