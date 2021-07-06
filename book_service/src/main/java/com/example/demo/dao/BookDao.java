package com.example.demo.dao;

import java.util.Collection;

import com.example.demo.model.Book;

public interface BookDao {
	public Book createBook(Book book);
	public Book findBook(Integer id);
	
	public Collection<Book> displayAllBooks();
}
