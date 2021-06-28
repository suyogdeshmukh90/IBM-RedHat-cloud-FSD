package com.example.spring_jdbc_template.service;

import java.io.IOException;
import java.util.List;

import com.example.spring_jdbc_template.BookNotFoundException;
import com.example.spring_jdbc_template.model.Book;

public interface BookService {
	public Book createBook(Book book);
	public List<Book> displayAllBook();
	public List<Book> findBookById(int id);
	public Book updateBookById(int id) throws BookNotFoundException, NumberFormatException, IOException;
	public void deleteBook(int id) throws BookNotFoundException;
}
