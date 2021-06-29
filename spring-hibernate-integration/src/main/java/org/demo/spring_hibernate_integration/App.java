package org.demo.spring_hibernate_integration;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Random;


import org.demo.spring_hibernate_integration.model.Book;
import org.demo.spring_hibernate_integration.service.BookService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



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
        	@SuppressWarnings("resource")
			ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        	BookService service=context.getBean("bookServiceImpl", BookService.class);
        	int choice=-1;
        	System.out.println("Select your choice");
        	do {
        		System.out.println("1. Create Book");
        		System.out.println("2. Display All Books");
        		System.out.println("3. Find Book ");
        		System.out.println("4. Update Book");
        		System.out.println("5. Delete Book");
        		choice=Integer.parseInt(bufferedReader.readLine());
        		
        		switch(choice)
        		{
        		case 1:
        			System.out.println("Enter the Name of Book");
        			String name=bufferedReader.readLine();
        			System.out.println("Enter the Price of Book");
        			Double price=Double.parseDouble(bufferedReader.readLine());
        			
        			Book book=service.createBook(new Book(new Random().nextInt(100),name,price));
        			System.out.println("Following Book created successfully!");
        			System.out.println(book);
        			break;
        			
        		case 2:
        			List<Book> list=service.displayAllBooks();
        			for(Book b:list)
                	{
                		System.out.println(b);
                	}
        			break;
        		
        		case 3:
        			try {
        			System.out.println("Enter the Book Id");
        			int id=Integer.parseInt(bufferedReader.readLine());
        			Book book1 = service.findBookById(id);
					if (book1==null)

						throw new BookNotFoundException("book with the given id not found.");
					else
					{
						System.out.println(book1);
					}
        			}catch(BookNotFoundException e)
        			{
        				System.err.println("Book not Found!");
        			}
					break;
        			
        		case 4:
        			try {
        			System.out.println("Enter the Book Id");
        			int id=Integer.parseInt(bufferedReader.readLine());
        			Book book2 =service.findBookById(id);
					if (book2==null)
						throw new BookNotFoundException("book with the given id not found.");
					else
					{
						
						Book book3=service.updateBook(id);
						System.out.println("following book updated successfully");
						System.out.println(book3);
					}
        			}catch(BookNotFoundException e)
        			{
        				System.err.println("Book not Found!");
        			}
					break;
					
        		case 5:
        			try {
        			System.out.println("Enter the Book Id");
        			int id=Integer.parseInt(bufferedReader.readLine());
        			Book book2 = service.findBookById(id);
					if (book2==null)

						throw new BookNotFoundException("book with the given id not found.");
					else
					{
						
						service.deleteBook(id);
					}
        			}catch(BookNotFoundException e)
        			{
        				System.err.println("Book not Found!");
        			}
					break;
				default:
						System.out.println("Enter the valid choice");
						break;
					}
        	}while(choice!=0);
        }catch (Exception e) {
			e.printStackTrace();
		}
    }
}
