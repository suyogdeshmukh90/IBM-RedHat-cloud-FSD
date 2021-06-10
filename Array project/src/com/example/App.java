package com.example;
import java.util.Scanner;

public class App {
	private static Scanner scanner=new Scanner(System.in);
	static int size;
	static int index;
	{
		index = -1;
	}
	private Employee[] emp;
	{
		emp = new Employee[size];
	}
	
	
	
	public void pushEmployee()
	{
		if(index>size)
		{
			System.out.println("Memory Full...");
		}
		else
		{
			System.out.println("Enter the Employee id");
			Integer empid = scanner.nextInt();
			System.out.println("Enter the first name");
			String fname=scanner.next();
			System.out.println("Enter the last name");
			String lname=scanner.next();
			System.out.println("Enter the Email id");
			String emailId=scanner.next();
			emp[++index]=new Employee(empid,fname,lname,emailId);
			System.out.println("Details successfully entered!");
			
		}
	}
	public void pushManager()
	{
		if(index>size)
		{
			System.out.println("Memory Full...");
		}
		else
		{
			System.out.println("Enter the Employee id");
			Integer empid = scanner.nextInt();
			System.out.println("Enter the first name");
			String fname=scanner.nextLine();
			System.out.println("Enter the last name");
			String lname=scanner.nextLine();
			System.out.println("Enter the Email id");
			String emailId=scanner.nextLine();
			System.out.println("Enter the Department");
			String dept=scanner.nextLine();
			
			emp[++index]=new Manager(empid,fname,lname,emailId,dept);
			System.out.println("Details successfully entered!");
			
		}
	}
	
	public void pushEngineer()
	{
		if(index>size)
		{
			System.out.println("Memory Full...");
		}
		else
		{
			System.out.println("Enter the Employee id");
			Integer empid = scanner.nextInt();
			System.out.println("Enter the first name");
			String fname=scanner.nextLine();
			System.out.println("Enter the last name");
			String lname=scanner.nextLine();
			System.out.println("Enter the Email id");
			String emailId=scanner.nextLine();
			System.out.println("Enter the branch");
			String branch=scanner.nextLine();
			
			emp[++index]=new Engineer(empid,fname,lname,emailId,branch);
			System.out.println("Details successfully entered!");
			
		}
	}
	
	
	public static void main(String args[])
	{
		App app = new App();
		System.out.println("Enter the size of total employees");
		size = scanner.nextInt();
		int choice;
		do {
		System.out.println("1. to Enter Employee Details.");
		System.out.println("2. to Enter Manager Details.");
		System.out.println("3. to Enter Engineer Details.");
		System.out.println("4. to Display Details.");
		System.out.println("5. to Exit...");
		choice=scanner.nextInt();
		
		switch(choice)
		{
		case 1:
			app.pushEmployee();
			break;
		case 2:
			app.pushManager();
			break;
		case 3:
			app.pushEngineer();
			break;
		case 4:
			for(Employee emps : app.emp)
			{
				System.out.println(emps);
			}
		case 5:
			System.out.println("Exiting...");
			System.exit(0);
		default:
			System.out.println("Invalid Input...");
		}
		
		}while(choice!=5);
	
	}
	
}
