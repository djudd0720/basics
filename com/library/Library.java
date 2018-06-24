package com.library;

public class Library {
	//A library would have a collection of books;

//Create a Library Object with method to count the total amount of books in the library.
	//Create a method to get the branch the library is associated with.
	
	String nameofdistrict; //St Louis County library
    //private String numofbranches;  //one of which includes Bridgeton
    private Branch[] branchnum;
    private Book[] books;
    
//Constructors
    
    
public Library() {
		super();
	}

public Library(Branch[] branchnum) {
	super();
	this.branchnum = branchnum;
}

public Library(String nameofdistrict, Branch[] branchnum, Book[] book) {
		super();
		this.nameofdistrict = nameofdistrict;
		this.branchnum = branchnum;
		this.books = book;
	}

//Getters and setters

public String getNameofdistrict() {
	return nameofdistrict;
}

public void setNameofdistrict(String nameofdistrict) {
	this.nameofdistrict = nameofdistrict;
}

public Branch[] getBranchnum() {
	return branchnum;
}

public void setBranchnum(Branch[] branchnum) {
	this.branchnum = branchnum;
}

public Book[] getBook() {
	return books;
}

public void setBook(Book[] book) {
	this.books = book;
}

public void addBranch(Branch branch1) {
	// TODO Auto-generated method stub
if(branchnum==null) {
	branchnum=new Branch[1];

}
else { branchnum = expandBranch(branchnum);

}
branchnum[branchnum.length -1]=branch1;
}

private Branch[] expandBranch(Branch[] branchnum) {
	// 
	Branch[] temp = new Branch[branchnum.length+1];
	//for loop
	for(int i = 0; i<branchnum.length; i++) {
		temp[i] = branchnum[i];
	}
	return temp;
}
public void addBook(Book book) {
	if (books ==null) {
		books = new Book[1];
		
	}
	else {
		books=expandBook(books);
	}
	books[books.length -1] = book;
}

private Book expandBook(Book books) {
	// TODO Auto-generated method stub
	Book[] target = new Book[books.length +1];
		for(int i = 0; i<books.length; i++) {
			target[i] = books[i];
	}
	return target;
}
}


//Methods

