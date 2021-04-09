package com.wolken.wolkenapp.dto;

public class BookDTO {

	private int bookId;
	private String bookName;
	private String publisher;
	private String edition;
	private String author;
	private int price;
	private String type;

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public BookDTO(int bookId, String bookName, String publisher, String edition, String author, int price,
			String type) {
		System.out.println(this.getClass().getSimpleName() + " object created");
		this.bookId = bookId;
		this.bookName = bookName;
		this.publisher = publisher;
		this.edition = edition;
		this.author = author;
		this.price = price;
		this.type = type;
		
		
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return bookId +" "+bookName+" "+publisher+" " +edition+" "+author+" "+price+" "+type;

	}
	
	


}
