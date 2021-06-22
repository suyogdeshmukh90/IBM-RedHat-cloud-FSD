package org.demo.Employee_Services;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import model.Employee;
import service.EmployeeServices;
import service.EmployeeServicesImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 EmployeeServices service=new EmployeeServicesImpl();
     	BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
         String firstName,lastName,email=null;
     	int choice=0;
     	do {
     		try {
         		System.out.println("1. Create Employee.");
         		System.out.println("2. Display All Employees");
         		System.out.println("3.Find Employee By Id: ");
         		System.out.println("4.Update Employee by Id: ");
         		System.out.println("5.Delete Employee by Id: ");
         		System.out.print("Enter Your Choice: ");
         		choice=Integer.parseInt(bufferedReader.readLine());
         		switch (choice) {
     			case 1:
     				System.out.print("First Name: ");
     				firstName=bufferedReader.readLine();
     				System.out.print("Last Name: ");
     				lastName=bufferedReader.readLine();
     				System.out.print("Email: ");
     				email=bufferedReader.readLine();
     				Employee employee=new Employee(new Random().nextInt(10000), firstName, lastName, email);
     				employee= service.createEmployee(employee);
     				System.out.println("Created: "+employee);
     				break;
     			case 2:
     				List<Employee> list=service.getAllEmployees();
     				Iterator<Employee> iterator=list.iterator();
     				while(iterator.hasNext())
     				{
     					System.out.println(iterator.next());
     				}
     				break;
     				
     			case 3:
     				System.out.print("id: ");
     				int id=Integer.parseInt(bufferedReader.readLine());
     				employee=service.getEmployeeById(id);
     				if(employee==null)
     				{
     					System.out.println("No Such employee found. ");
     				}
     				else
     				{
     					System.out.println("employee found: "+employee);
     				}
     				
     				break;
     			case 4:
     				System.out.print("Enter the id to update: ");
     				int uid=Integer.parseInt(bufferedReader.readLine());
     				employee=service.updateEmployee(uid);
     				if(employee==null)
     				{
     					System.out.println("No Such employee found. ");
     				}
     				else
     				{
     					System.out.println("employee updated: "+employee);
     				}
     				
     				break;
     			case 5:
     				System.out.print("Enter the id to delete: ");
     				int did=Integer.parseInt(bufferedReader.readLine());
     				employee=service.deleteEmployee(did);
     				if(employee==null)
     				{
     					System.out.println("No Such employee found. ");
     				}
     				else
     				{
     					System.out.println("employee deleted: "+employee);
     				}
     				
     				break;
     			default:
     				System.out.println("invalid choice:");
     				break;
     			}
     			
     		} catch (Exception e) {
     			// TODO: handle exception
     		}
 			
 		} while (choice!=0);
    }
}