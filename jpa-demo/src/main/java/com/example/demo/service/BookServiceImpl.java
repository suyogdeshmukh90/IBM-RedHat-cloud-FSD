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

	@Override
	public Book findBookByBookId(String bookid) throws BookNotFoundException {
		
		return bookDaoImpl.findBookByBookId(bookid);
	}

	@Override
	public Book findBookByBookName(String bname) throws BookNotFoundException {
		
		return bookDaoImpl.findBookByBookName(bname);
	}

	@Override
	public Book updateBookByBookId(String bookid, Book book) throws BookNotFoundException {
		
		return bookDaoImpl.updateBookByBookId(bookid, book);
	}

	@Override
	public String deleteByBookId(String bookId)  throws BookNotFoundException{
		
		return bookDaoImpl.deleteByBookId(bookId);
	}

}
