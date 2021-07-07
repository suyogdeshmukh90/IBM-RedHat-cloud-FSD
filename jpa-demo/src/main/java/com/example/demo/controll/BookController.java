package com.example.demo.controll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.BookNotFoundException;
import com.example.demo.model.Book;
import com.example.demo.service.BookService;
import com.example.demo.ui.BookErrorResponse;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class BookController {
	
	BookService bookService;
	@Autowired
	public BookController(BookService bookServiceImpl) {
		
		this.bookService = bookServiceImpl;
	}
	
	@GetMapping("/api/books")
	public ResponseEntity<List<Book>> getAllBooks()
	{
		log.info("within get all method");
		return ResponseEntity.status(HttpStatus.OK).body(bookService.getAllBooks());
	}

	@PostMapping("/api/books")
	public ResponseEntity<Book> createBook(@RequestBody Book book)
	{
		log.info("within create method");
		return ResponseEntity.status(HttpStatus.CREATED).body(bookService.createBook(book));
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
		log.info("within find By Id");
		return ResponseEntity.status(HttpStatus.OK).body(bookService.findBookById(id));
	}
	
	@GetMapping("/api/books/find/{bookid}")
	public ResponseEntity<Book> findBookById(@PathVariable("bookid") String bookid) throws BookNotFoundException
	{
		log.info("within find By bookId");
		return ResponseEntity.status(HttpStatus.CREATED).body(bookService.findBookByBookId(bookid));
	}
	@GetMapping("/api/books/findByName/{bookName}")
	public ResponseEntity<Book> findBookByBookName(@PathVariable("bookName") String bookName) throws BookNotFoundException
	{
		log.info("within find By book Name");
		return ResponseEntity.status(HttpStatus.CREATED).body(bookService.findBookByBookName(bookName));
	}
	@PutMapping("/api/books/find/{bookId}")
	public ResponseEntity<Book> updateBookByBookId(@PathVariable("bookId") String bookId,@RequestBody Book book) throws BookNotFoundException
	{
		log.info("within find By Update Book by Bookid");
		return ResponseEntity.status(HttpStatus.OK).body(bookService.updateBookByBookId(bookId, book));
	}
	@PutMapping("/api/books/{Id}")
	public ResponseEntity<Book> updateBook(@PathVariable("Id") Integer Id,@RequestBody Book book) throws BookNotFoundException
	{
		log.info("within find By Update Book by id");
		return ResponseEntity.status(HttpStatus.OK).body(bookService.updateBook(Id, book));
	}
	
	@DeleteMapping("/api/books/{bookId}")
	public ResponseEntity<String> deleteByBookId(@PathVariable("bookId") String bookId) throws BookNotFoundException
	{
		return ResponseEntity.ok(bookService.deleteByBookId(bookId));
	}
}
