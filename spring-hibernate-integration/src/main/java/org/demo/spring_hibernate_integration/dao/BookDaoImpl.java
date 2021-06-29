package org.demo.spring_hibernate_integration.dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import javax.persistence.Query;

import org.demo.spring_hibernate_integration.model.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;


@Repository
@EnableTransactionManagement
public class BookDaoImpl implements BookDao {
	private SessionFactory sessionFactory;
	BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
	@Autowired
	public BookDaoImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
		
	}

	@Override
	@Transactional
	public Book createBook(Book book) {
		Session session=sessionFactory.getCurrentSession();
		session.persist(book);
		return book;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Book> displayAllBooks() {
		Session currentSession=sessionFactory.openSession();
		Query query=currentSession.createQuery("select B from Book B",Book.class);
		return query.getResultList();
	}

	@Override
	
	public Book findBookById(int id) {
		Session session=sessionFactory.openSession();
		return session.get(Book.class, id);
	}

	@Override
	@Transactional
	public Book updateBook(int id) throws IOException {
		Session session=sessionFactory.getCurrentSession();
		Book book=new Book();
		System.out.println("Enter the new name");
		String nname=bufferedReader.readLine();
		System.out.println("Enter the new price");
		double nprice=Double.parseDouble(bufferedReader.readLine());
		book.setBookId(id);
		book.setBookName(nname);
		book.setBookPrice(nprice);
		session.merge(book);
		return book;
	}

	@Override
	public void deleteBook(int id) {
		Session session=sessionFactory.openSession();
		Book book1 =session.get(Book.class, id);
		session.remove(book1);
		System.out.println("Successfully Deleted book");
	}

}
