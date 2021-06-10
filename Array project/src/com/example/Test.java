package com.example;
import java.util.Scanner;

public class Test {
	static int size;
	private static Scanner scanner=new Scanner(System.in);
	static int index=-1;
	static private Employee[] emp;
	

	public static void main(String[] args) {
		int choice;
		
		
		Test test = new Test();
		emp = new Employee[size];
		System.out.println("Enter the size of total employees");
		size = scanner.nextInt();
		do {
		System.out.println("Select Choice!");
		System.out.println("1. Enter Employee");
		System.out.println("2.Manager");
		System.out.println("3. Engineer");
		System.out.println("4. Display");
		choice=scanner.nextInt();
		if(choice==1) {
			index++;
		if(index>=size)
		{
			System.out.println("Memory Full");
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
			
			
			emp[index]=new Employee(empid,fname,lname,emailId);
			System.out.println("Details successfully entered!");
			
		}
		}
		else if(choice==2) {
			index++;
			if(index>=size)
			{
				System.out.println("Memory Full");
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
				System.out.println("Enter the Department");
				String dept=scanner.next();
				
				emp[index]=new Manager(empid,fname,lname,emailId, dept);
				System.out.println("Details successfully entered!");
				
			}
			}
		
		else if(choice==3) {
			index++;
			if(index>=size)
			{
				System.out.println("Memory Full");
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
				System.out.println("Enter the Branch");
				String branch=scanner.next();
				
				emp[index]=new Engineer(empid,fname,lname,emailId, branch);
				System.out.println("Details successfully entered!");
				
			}
			}
		else if(choice == 4)
		{
			for(int i=0;i<test.emp.length;i++)
			{
				System.out.println(test.emp[i]);
			}
		}
		else if(choice==0)
		{
			System.out.println("Exiting...");
			System.exit(0);
		}
		else
		{
			System.out.println("Inavlid Input!");
		}
		}while(choice!=0);
	}

}
