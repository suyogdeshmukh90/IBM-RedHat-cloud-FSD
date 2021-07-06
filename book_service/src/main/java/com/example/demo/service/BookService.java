package com.example.demo.service;

import java.util.Collection;

import com.example.demo.model.Book;

public interface BookService {
	public Book createBook(Book book);
	public Book findBook(Integer id);
	public Collection<Book> displayAllBooks();

}
