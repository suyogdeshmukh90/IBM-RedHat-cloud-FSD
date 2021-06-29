package org.demo.spring_hibernate_javabased;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;


import org.demo.spring_hibernate_javabased.config.MyConfig;

import org.demo.spring_hibernate_javabased.service.EmployeeService;
import org.demo.spring_hibernate_javabased.ui.EmployeeRequestModel;
import org.demo.spring_hibernate_javabased.ui.EmployeeResponseModel;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
      	   ApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
      	   EmployeeService service=context.getBean("employeeServiceImpl",EmployeeService.class);
		/*
		 *
		 * EmployeeResponseModel model=service.createEmployee(new
		 * EmployeeRequestModel("neha", "bhasin", "neha@email.com"));
		 * System.out.println(model);
		 */
      	  int choice=-1;
      	  String firstName=null;
      	  String lastName=null;
      	  String email=null;
      	 do {
				System.out.println("1.Add A New Employee");
				System.out.println("2.Display All Employees");
				System.out.println("3.Find Employee By Id");
				System.out.println("4.Update Employee By Id");
				System.out.println("5.Delete the Employee");
				System.out.println("0: Exit");
				System.out.print("your choice: ");
				choice=Integer.parseInt(bufferedReader.readLine());
				switch (choice) {
				case 1:
					System.out.println("Enter the first name");
					firstName=bufferedReader.readLine();
					System.out.println("Enter the last name");
					lastName=bufferedReader.readLine();
					System.out.println("Enter the email");
					email=bufferedReader.readLine();
					EmployeeResponseModel model=service.createEmployee(new EmployeeRequestModel(firstName,lastName,email));
					System.out.println("Following employee created successfully!");
					System.out.println(model);
					break;
				case 2:
					List<EmployeeResponseModel> list=service.displayAllEmployees();
					for(EmployeeResponseModel e:list)
					{
						System.out.println(e);
					}
					
					break;
				case 3:
					try {
	        			System.out.println("Enter the Employee Id");
	        			String id=bufferedReader.readLine();
	        			EmployeeResponseModel emp=service.findEmployeeById(id);
	        			if (emp==null)

							throw new EmployeeNotFoundException("Employee with the given id not found.");
						else
						{
							System.out.println(emp);
						}
	        			
	        			}
						catch(IndexOutOfBoundsException o)
					{
							System.err.println("Employee not found!");
					}
						catch(EmployeeNotFoundException e)
	        			{
	        				System.err.println("Employee not Found!");
	        			}
					break;
					
				case 4:
					try {
	        			System.out.println("Enter the Employee Id");
	        			String id=bufferedReader.readLine();
	        			EmployeeResponseModel emp=service.findEmployeeById(id);
	        			if (emp==null)

							throw new EmployeeNotFoundException("Employee with the given id not found.");
						else
						{
							emp=service.updateEmployee(id);
							System.out.println("following Employee updated successfully");
							System.out.println(emp);
						}
	        			}
					catch(IndexOutOfBoundsException o)
					{
							System.err.println("Employee not found!");
					}
					catch(EmployeeNotFoundException e)
	        			{
	        				System.err.println("Employee not Found!");
	        			}
					break;
				case 5:
					try {
	        			System.out.println("Enter the Employee Id");
	        			String id=bufferedReader.readLine();
	        			EmployeeResponseModel emp=service.findEmployeeById(id);
	        			if (emp==null)

							throw new EmployeeNotFoundException("Employee with the given id not found.");
						else
						{
							service.deleteEmployee(id);
							
						}
	        			}
					catch(IndexOutOfBoundsException o)
					{
							System.err.println("Employee not found!");
					}
					catch(EmployeeNotFoundException e)
	        			{
	        				System.err.println("Employee not Found!");
	        			}
					break;
				}
				}while(choice!=0);
  	} catch (Exception e) {
  		// TODO: handle exception
  		e.printStackTrace();
  	}
    }
}
