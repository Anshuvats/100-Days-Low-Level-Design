package javaOOPSBasics;

import java.util.ArrayList;

public class MainBook {

	public static void main(String[] args) {
		Book b1=new Book("How to Proceed","Anshu Kumar", "H123dklsf");
		Book b2=new Book("English is my first language","kenn ejmd","osmslkf2131mls");
		
		Book.addBook(b1);
		Book.addBook(b2);
		
		ArrayList<Book>bookCollection=Book.getBookCollections();
		
		for(Book book:bookCollection) {
			System.out.println(book.getTitle()+" "+book.getAuthor()+" "+book.getIsbn());
		}
		
		Book.removeBook(b2);
		
		for(Book book:bookCollection) {
			System.out.println(book.getTitle()+" "+book.getAuthor()+" "+book.getIsbn());
		}
	}

}
