package com.example.test;

import com.example.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.example.*;
public class Tester {

	public static void main(String args[]) throws IOException, ParseException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of Employees");
		int n=Integer.parseInt(br.readLine());
		List<Employee> employeeList=new ArrayList<Employee>();
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter the details for Employee"+(i+1));
			System.out.print("\nEnter the name");
			String name=br.readLine();
			System.out.print("Enter the department");
			String department=br.readLine();
			System.out.print("Enter the date");
			Date dateOfJoining= new SimpleDateFormat("MM/dd/yyyy").parse(br.readLine());
			System.out.print("Enter the age");
			int age=Integer.parseInt(br.readLine());
			System.out.print("Enter the salary");
			int salary=Integer.parseInt(br.readLine());
			Employee e=new Employee(name,department,dateOfJoining,age,salary);
			employeeList.add(e);
		}
			System.out.println("1.Sort employees by salary");
			System.out.println("2.Sort employees by age and by date of joining");
			System.out.println("Enter your choice");
			int choice=Integer.parseInt(br.readLine());
			switch(choice)
			{
			case 1:
				Collections.sort(employeeList);
				EmployeeBO.printEmployees(employeeList);
				break;
			case 2:
				Collections.sort(employeeList,new AgeComparator());
				EmployeeBO.printEmployees(employeeList);
				break;
			default:
				System.out.println("Invalid choice");
			}
		}
	
	
}
