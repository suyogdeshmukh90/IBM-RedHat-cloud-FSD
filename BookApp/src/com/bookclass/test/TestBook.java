package com.bookclass.test;
import com.bookclass.*;
public class TestBook {

	public static void main(String[] args) {
		Book book1 = new Book("Gary Rich", 8.99f, 19.99f, "How to get rich", 100);
		System.out.println("\n1) Book Details\n    1a) Author: " + book1.getAuthorName() + " | cost price: "+ book1.getCostPrice() +" | sale price:"+ 
		book1.getSalePrice() +" | pages: "+ book1.getPages() +" | title: " + book1.getTitle()+"\n");
		System.out.println("    1b) Author " + book1.getAuthorName() + " nets a per-book profit of $" + book1.getProfit() + " and a tax of $" + book1.getTax());

		Ebook book2 = new Ebook("Seth Devilin", 10f, 23f, "Bad habits that lead to success", 200, "Amazon", 80);
		
		System.out.println("\n1) EBook Details\n    2a) Author: " + book2.getAuthorName() + " | cost price: "+ book2.getCostPrice() +" | sale price:"+ 
		book2.getSalePrice() +" | pages: "+ book2.getPages() +" | title: " + book2.getTitle()+"\n");
	
		System.out.println("    2b) Author " + book2.getAuthorName() + " nets a per-book profit of $" + book2.getProfit() + " and a tax of $" + book2.getTax());
	
		System.out.println("\n    2c) Book \"" + book2.getTitle() + "\" has a per-page size of " + book2.getPageSize() +" MB\n");
	}

}
