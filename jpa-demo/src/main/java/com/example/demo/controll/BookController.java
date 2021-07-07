package com.example.demo.controll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.BookNotFoundException;
import com.example.demo.model.Book;
import com.example.demo.service.BookService;
import com.example.demo.ui.BookErrorResponse;

@RestController
public class BookController {
	
	BookService bookServiceImpl;
	@Autowired
	public BookController(BookService bookServiceImpl) {
		
		this.bookServiceImpl = bookServiceImpl;
	}
	
	@GetMapping("/api/books")
	public ResponseEntity<List<Book>> getAllBooks()
	{
		return ResponseEntity.status(HttpStatus.OK).body(bookServiceImpl.getAllBooks());
	}

	@PostMapping("/api/books")
	public ResponseEntity<Book> createBook(@RequestBody Book book)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(bookServiceImpl.createBook(book));
	}
	
	@ExceptionHandler
	public ResponseEntity<BookErrorResponse> handleBookNotFoundException(BookNotFoundException e) {
		BookErrorResponse response = new BookErrorResponse();
		response.setMessage(e.getMessage());
		response.setStatusCode(HttpStatus.NOT_FOUND.value());
		response.setErrorReportingTime(System.currentTimeMillis());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
	}

	@ExceptionHandler
	public ResponseEntity<BookErrorResponse> handleTypeMisMatchedException(Exception e) {
		BookErrorResponse response = new BookErrorResponse();
		response.setMessage(e.getMessage());
		response.setStatusCode(HttpStatus.NOT_FOUND.value());
		response.setErrorReportingTime(System.currentTimeMillis());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
	}
	@GetMapping("/api/books/{id}")
	public ResponseEntity<Book> findBookById(@PathVariable("id") Integer id) throws BookNotFoundException
	{
		return ResponseEntity.status(HttpStatus.OK).body(bookServiceImpl.findBookById(id));
	}
	
	@PostMapping("/api/books/{id}")
	public ResponseEntity<Book> updateBook(@PathVariable("id") Integer id ,@RequestBody Book book) throws BookNotFoundException
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(bookServiceImpl.updateBook(id,book));
	}
	
}
