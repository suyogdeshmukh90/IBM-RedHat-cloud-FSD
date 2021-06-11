package com.example.app;
import java.util.InputMismatchException;
import com.example.*;
import java.util.Scanner;

import java.util.UUID;

import com.example.Todo;
public class App {
	private static Scanner sc=new Scanner(System.in);
//	private Todo[] todos;
//	{
//		todos=new Todo[2];
//	}
	public static void main(String args[])
	{
		App app=new App();
		Employee emp=null;
		Manager m=new Manager();
		
		app.check(emp);
		app.check(m);
		
	}	
	private void check(Employee o)
	{
		try {
			if(o instanceof Manager)
			{
				Manager manager=(Manager) o;
				System.out.println("Manager"+manager.toString());
			}
			else
			{
				System.out.println("Employee"+o.toString());
			}
		}
		catch (NullPointerException e) {
			System.err.println("null pointer Exception");
//			e.printStackTrace();
		}
	}
//			for(int i=0; i<2;i++)
//			{
//				try {
//				String id=UUID.randomUUID().toString();
//				System.out.println("Enter the desc ");
//				String desc =sc.next();
//				System.out.println("Is Completed?");
//				boolean ic=sc.nextBoolean();
//				app.todos[i]=new Todo(id, desc, ic);
//			}
//				catch (ArrayIndexOutOfBoundsException e)
//				{
//						System.err.println("array index out of bound exception.");
//				}
//				catch(InputMismatchException im)
//				{
//					System.err.println("Enter the correct input");
//					i--;
//					continue;
//				}
//			}
//			for(int i=0;i<=5;i++)
//			{
//				try {
//					
//					System.out.println(app.todos[i]);
//					
//				} catch (ArrayIndexOutOfBoundsException e) {
//					System.err.println("Array Index Out Of Bound.");
//					
//				}
//				
//			}
//		}

}

