package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.Book;

public interface BookDao {
	public Book createBook(Book book);
	
	public List<Book> getAllBooks();
	
	public Book findBookById(Integer id) throws BookNotFoundException;
	
	public Book updateBook(Integer id, Book book) throws BookNotFoundException;
}
