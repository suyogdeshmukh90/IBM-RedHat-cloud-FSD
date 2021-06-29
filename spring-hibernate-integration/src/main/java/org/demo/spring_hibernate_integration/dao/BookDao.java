package org.demo.spring_hibernate_integration.dao;

import java.io.IOException;
import java.util.List;

import org.demo.spring_hibernate_integration.model.Book;

public interface BookDao {
	public Book createBook(Book book);
	public List<Book> displayAllBooks();
	public Book findBookById(int id);
	public Book updateBook(int id) throws IOException;
	public void deleteBook(int id);
	

}
