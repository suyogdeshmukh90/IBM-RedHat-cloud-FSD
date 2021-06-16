package com.demo;

import java.io.IOException;
import java.util.UUID;
import java.util.Scanner;
public class Tester {
	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		int choice;
		do {
		System.out.println("Select your choice!");
		System.out.println("1.Enter Employee details");
		System.out.println("2.Display Employee");
		System.out.println("3. Update Employee");
		System.out.println("4 Remove Employee");
		System.out.println("5 Save the entire Set to file");
		System.out.println("6. ");
		choice=sc.nextInt();
//		Employee employee=new Employee(UUID.randomUUID().toString(),"John","India");
//		EmployeeService service=new EmployeeServiceImpl();
//		service.createEmployee(employee);
//		System.out.println("Done");
//		System.out.println(service.displayEmployeeFromFile());
		
		switch(choice)
		{
		case 1:
			System.out.println("Enter the name");
			String name=sc.next();
			System.out.println("Enter th email");
			String email=sc.next();
			Employee emp=new Employee(UUID.randomUUID().toString(),name,email);
			break;
		case 2:
			EmployeeService service=new EmployeeServiceImpl();
			System.out.println(service.displayEmployeeFromFile());
			
		}
		}while(choice!=0);
	}

}
