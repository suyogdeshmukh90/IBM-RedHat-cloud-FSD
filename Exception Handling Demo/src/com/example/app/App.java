package com.example.app;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.UUID;

import com.example.Todo;
public class App {
	private static Scanner sc=new Scanner(System.in);
	private Todo[] todos;
	{
		todos=new Todo[2];
	}
	public static void main(String args[])
	{
		App app=new App();
		
			for(int i=0; i<2;i++)
			{
				try {
				String id=UUID.randomUUID().toString();
				System.out.println("Enter the desc ");
				String desc =sc.next();
				System.out.println("Is Completed?");
				boolean ic=sc.nextBoolean();
				app.todos[i]=new Todo(id, desc, ic);
			}
				catch (ArrayIndexOutOfBoundsException e)
				{
						System.err.println("array index out of bound exception.");
				}
				catch(InputMismatchException im)
				{
					System.out.println("Enter the correct input");
					i--;
					continue;
				}
			}
			for(int i=0;i<=5;i++)
			{
				try {
					
					System.out.println(app.todos[i]);
					
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("Array Index Out Of Bound.");
					
				}
				
			}
		}

	}

