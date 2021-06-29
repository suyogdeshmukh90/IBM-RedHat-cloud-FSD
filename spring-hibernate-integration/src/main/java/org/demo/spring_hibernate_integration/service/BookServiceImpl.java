package org.demo.spring_hibernate_integration.service;

import java.io.IOException;
import java.util.List;

import org.demo.spring_hibernate_integration.dao.BookDao;
import org.demo.spring_hibernate_integration.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class BookServiceImpl implements BookService{

	BookDao bookDao;
	@Autowired
	public BookServiceImpl(BookDao bookDao) {
		super();
		this.bookDao = bookDao;
	}

	@Override
	
	public Book createBook(Book book) {
		
		return bookDao.createBook(book);
	}

	@Override
	public List<Book> displayAllBooks() {
		
		return bookDao.displayAllBooks();
	}

	@Override
	public Book findBookById(int id) {
		
		return bookDao.findBookById(id);
	}

	@Override
	
	public Book updateBook(int id) throws IOException {
		
		return bookDao.updateBook(id);
	}

	@Override
	public void deleteBook(int id) {
		bookDao.deleteBook(id);
	}

}
