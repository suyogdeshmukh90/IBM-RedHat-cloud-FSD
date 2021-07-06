package com.example.demo.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.BookDao;
import com.example.demo.model.Book;
@Component
public class BookServiceImpl implements BookService {

	private BookDao bookDaoImpl;
	
	@Autowired
	public BookServiceImpl(BookDao bookDaoImpl) {
		
		this.bookDaoImpl = bookDaoImpl;
	}


	@Override
	public Collection<Book> displayAllBooks() {
		
		return bookDaoImpl.displayAllBooks();
	}


	@Override
	public Book createBook(Book book) {
		
		return bookDaoImpl.createBook(book);
	}


	@Override
	public Book findBook(Integer id) {
		
		return bookDaoImpl.findBook(id);
	}

}
