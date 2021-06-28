package com.example.spring_jdbc_template;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.List;
import java.util.Random;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.spring_jdbc_template.config.MyConfig;
import com.example.spring_jdbc_template.model.Book;
import com.example.spring_jdbc_template.service.BookService;
import com.example.spring_jdbc_template.service.BookServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try {
    		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
    		
			int choice=0;
			String bookName=null;
			double bookPrice=0.0;
    		@SuppressWarnings("resource")
			ApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
    		BookService bookService=context.getBean("bookServiceImpl",BookServiceImpl.class);
    		do {
				System.out.println("1.Add A New Book");
				System.out.println("2.Display All Book");
				System.out.println("3.Find Book By Id");
				System.out.println("4.Update Book By Id");
				System.out.println("5.Delete the book");
				System.out.println("0: Exit");
				System.out.print("your choice: ");
				choice=Integer.parseInt(bufferedReader.readLine());
				switch (choice) {
				case 1:
					System.out.print("Book Name: ");
					bookName=bufferedReader.readLine();
					System.out.println("Book Price: ");
					bookPrice=Double.parseDouble(bufferedReader.readLine());
					System.out.println(bookService.createBook(new Book(new Random().nextInt(1000), bookName, bookPrice)));
					break;
				case 2:
					List<Book> list=bookService.displayAllBook();
					System.out.println("BOOK_ID\tBOOK_NAME\tBOOK_PRICE\n=================================\n");
					for(Book book:list)
					{
						book.displayAllBook();
					}
					break;
				case 3:
					
					try {

						System.out.print("Book Id: ");
						int id = Integer.parseInt(bufferedReader.readLine());
						List<Book> b = bookService.findBookById(id);
						if (b.isEmpty())

							throw new BookNotFoundException("book with the given id not found.");
						else
						{
							System.out.println(b);
						}
					}

					catch (BookNotFoundException e) {
						System.err.println(e.getMessage());
					}
					
					
					break;
				case 4:
					System.out.print("Book Id: ");
					int id = Integer.parseInt(bufferedReader.readLine());
					System.out.println(bookService.updateBookById(id));
					break;
				case 5:
					
						System.out.print("Book Id: ");
						id = Integer.parseInt(bufferedReader.readLine());
						bookService.deleteBook(id);
						break;
					
				default:
					break;
				}
				
			} while (choice!=0);
			
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
}
