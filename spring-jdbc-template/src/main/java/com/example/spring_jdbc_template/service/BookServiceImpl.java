package com.example.spring_jdbc_template.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring_jdbc_template.BookNotFoundException;
import com.example.spring_jdbc_template.dao.BookDao;
import com.example.spring_jdbc_template.model.Book;
@Service
public class BookServiceImpl implements BookService{
	BookDao bookDao;
	@Autowired
	public BookServiceImpl(BookDao bookDao) {
		
		this.bookDao = bookDao;
	}

	@Override
	public Book createBook(Book book) {
		
		return bookDao.createBook(book);
	}

	@Override
	public List<Book> displayAllBook() {
		
		return bookDao.displayAllBook();
	}

	@Override
	public List<Book> findBookById(int id) {
		
		return bookDao.findBookById(id);
	}

	@Override
	public Book updateBookById(int id) throws BookNotFoundException, NumberFormatException, IOException {
		
		return bookDao.updateBookById(id);
	}

	@Override
	public void deleteBook(int id) throws BookNotFoundException {
		bookDao.deleteBook(id);
		
	}

}
