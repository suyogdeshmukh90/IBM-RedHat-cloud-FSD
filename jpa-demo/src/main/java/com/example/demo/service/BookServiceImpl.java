package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BookDao;
import com.example.demo.dao.BookNotFoundException;
import com.example.demo.model.Book;

@Service
public class BookServiceImpl implements BookService{

	BookDao bookDaoImpl;
	@Autowired
	public BookServiceImpl(BookDao bookDaoImpl) {
		
		this.bookDaoImpl = bookDaoImpl;
	}

	@Override
	public Book createBook(Book book) {
		return  bookDaoImpl.createBook(book);
	}

	@Override
	public List<Book> getAllBooks() {
		return bookDaoImpl.getAllBooks();
	}

	@Override
	public Book findBookById(Integer id) throws BookNotFoundException {
		
		return bookDaoImpl.findBookById(id);
	}

	@Override
	public Book updateBook(Integer id, Book book) throws BookNotFoundException {
		
		return bookDaoImpl.updateBook(id, book);
	}

}
