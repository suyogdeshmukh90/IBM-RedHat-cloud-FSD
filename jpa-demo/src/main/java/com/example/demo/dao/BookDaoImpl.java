package com.example.demo.dao;

import java.util.List;

import java.util.UUID;


import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Book;

@Repository
@EnableTransactionManagement
public class BookDaoImpl implements BookDao{

	private EntityManager entityManager;
	
	@Autowired
	public BookDaoImpl(EntityManager entityManager) {
		
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public Book createBook(Book book) {
		
		book.setBookId(UUID.randomUUID().toString());
		entityManager.persist(book);
		return book;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Book> getAllBooks() {
		Query query=entityManager.createQuery("Select B from Book B",Book.class);
		return query.getResultList();
	}

	@Override
	@Transactional
	public Book findBookById(Integer id) throws BookNotFoundException {
		Book book1=entityManager.find(Book.class, id);
		if(book1==null)
		{
			throw new BookNotFoundException("book with the given id not found.");
		}
		return book1;
	}

	@Override
	@Transactional
	public Book updateBook(Integer id, Book book) throws BookNotFoundException {
		Book book1=entityManager.find(Book.class, id);
		if(book1==null)
		{
			throw new BookNotFoundException("book with the given id not found.");
		}
		book1.setId(id);
		book1.setBookId(book.getBookId());
		book1.setBookName(book.getBookName());
		book1.setBookPrice(book.getBookPrice());
		return book1;
	}

}
