package com.example.demo.service;

import java.util.List;

import com.example.demo.dao.BookNotFoundException;
import com.example.demo.model.Book;

public interface BookService {
	public Book createBook(Book book);
	
	public List<Book> getAllBooks();
	
	public Book findBookById(Integer id) throws BookNotFoundException;
	
	public Book updateBook(Integer id,Book book) throws BookNotFoundException;

	public Book findBookByBookId(String bookid) throws BookNotFoundException;
	
	public Book findBookByBookName(String bname) throws BookNotFoundException;
	
	public Book updateBookByBookId(String bookid,Book book) throws BookNotFoundException;
	
	public String deleteByBookId(String bookId)  throws BookNotFoundException;


}
