package com.library;

public class Book {
	private String title;
    private String author;
    private String publisher;
    private String summary;
    private String isbn; //cuz it has dashes
    private int numberOfPages;
    //private boolean checkedout; - do object call for date checked out/checked in
    private String branchloc;
    private String genre;
    private String deweydecimal;
    


	//Constructors
    public Book() {
		super();
	}
    public Book(String title, String author, String publisher, String summary, String isbn, int numberOfPages,
			String branchloc, String genre, String deweydecimal) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.summary = summary;
		this.isbn = isbn;
		this.numberOfPages = numberOfPages;
		this.branchloc = branchloc;
		this.genre = genre;
		this.deweydecimal = deweydecimal;
	}
    
    public Book(String title, String author, String isbn, int numberOfPages,
			String branchloc) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.numberOfPages = numberOfPages;
		this.branchloc = branchloc;
		
	}

	// make this an object of the book dateckedout;
    

    
    // Getters and Setters
    public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	public String getBranchloc() {
		return branchloc;
	}
	public void setBranchloc(String branchloc) {
		this.branchloc = branchloc;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getDeweydecimal() {
		return deweydecimal;
	}
	public void setDeweydecimal(String deweydecimal) {
		this.deweydecimal = deweydecimal;
	}
	
	//Methods
	
/*	public void searchforbook(String title){
    	Branch branches = new Branch();
    	branches.
    	title = getTitle();
    	
    	if (title)
    }
    */
}

