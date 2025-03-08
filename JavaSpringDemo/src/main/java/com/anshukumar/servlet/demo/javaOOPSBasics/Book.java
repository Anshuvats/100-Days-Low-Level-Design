package javaOOPSBasics;

import java.util.ArrayList;

public class Book {

	private String title;
	private String author;
	private String isbn;
	
	private static ArrayList<Book>bookCollections=new ArrayList<Book>();
	
	public Book(String title, String author, String isbn) {
		this.title=title;
		this.author=author;
		this.isbn=isbn;
	}

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

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public static void addBook(Book book) {
		bookCollections.add(book);
	}
	public static void removeBook(Book book) {
		bookCollections.remove(book);
	}
	
	public static ArrayList<Book>getBookCollections(){
		return bookCollections;
	}
}
