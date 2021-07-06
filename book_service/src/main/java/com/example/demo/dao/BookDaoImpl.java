package com.example.demo.dao;

import java.util.Collection;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.Book;
@Component
public class BookDaoImpl implements BookDao {

	private Map<Integer, Book> bookMap;
	@Autowired
	public BookDaoImpl(Map<Integer, Book> bookMap) {
		
		this.bookMap = bookMap;
		bookMap.put(new Random().nextInt(100), new Book(UUID.randomUUID().toString(),"Java",19.8));
		bookMap.put(new Random().nextInt(100), new Book(UUID.randomUUID().toString(),"Express",22.2));
		bookMap.put(new Random().nextInt(100), new Book(UUID.randomUUID().toString(),"Python",29.0));

	}

	@Override
	public Collection<Book> displayAllBooks() {
		System.out.println(bookMap);
		return bookMap.values();
	}

	@Override
	public Book createBook(Book book) {
		book.setBookId(UUID.randomUUID().toString());
		bookMap.put(new Random().nextInt(100),book);
		return book;
	}

	
	@Override
	public Book findBook(Integer id) {
		return bookMap.get(id);
		
	}

}
