package app;

import java.util.List;
import java.util.Random;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;

import com.demo.Employee;

import com.file.FileToDatabase;

import service.EmployeeService;
import service.EmployeeServiceImpl;

public class App {

	public static void main(String[] args) throws SQLException, NumberFormatException, IOException {
		FileToDatabase fd=new FileToDatabase();
		
		EmployeeService service=new EmployeeServiceImpl();
		Employee emp;
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		int choice=0;
		do {
		System.out.println("1. Create a new employee");
		System.out.println("2.Display all employees from database");
		System.out.println("3.Find employee in database ");
		System.out.println("4.Create Employee from File");
		System.out.println("0. Exit");
		System.out.println("Select your choice...");
		choice=Integer.parseInt(bufferedReader.readLine());
		switch(choice)
		{
		case 1:
			System.out.println("Enter the first name");
			String fname=bufferedReader.readLine();
			System.out.println("Enter the last name");
			String lname=bufferedReader.readLine();
			System.out.println("Enter the email id");
			String email=bufferedReader.readLine();
			emp=service.createEmployee(new Employee(new Random().nextInt(100),fname,lname,email));
			System.out.println(emp);
			break;
			
		case 2:

			List<Employee> employees=service.getAllEmployees();
			Iterator<Employee> iterator=employees.iterator();
			while(iterator.hasNext())
				System.out.println(iterator.next());
			break;
		case 3:
			System.out.println("Enter the id to find");
			int searchId=Integer.parseInt(bufferedReader.readLine());
			ResultSet employee=service.searchEmployee(searchId);
			List<Employee> list1=new ArrayList<Employee>();
			int flag=0;
			while(employee.next())
			{
				flag=1;
				System.out.println("employee found");
				list1.add(new Employee(employee.getInt(1),employee.getString(2),employee.getString(3),employee.getString(4)));
				System.out.println(list1);
				
			}
			
			if(flag==0)
				System.out.println("Employee not found!");
						
			break;
		case 0:
			System.out.println("Exiting...Bye!!!");
			System.exit(0);
			break;
			
		case 4:
			try {
			System.out.println("Enter the File name ");
			String file1=bufferedReader.readLine();
			List<Employee> list=fd.createFromFile(file1);
			Iterator<Employee> i=list.iterator();
			while(i.hasNext())
			{
				Employee emp1=i.next();
				emp=service.createEmployee(new Employee(new Random().nextInt(100),emp1.getFirstName(),emp1.getLastName(),emp1.getEmail()));
			}
			
			System.out.println("Employee Details added from file successfully!");
			}catch(FileNotFoundException e)
			{
				System.err.println("File not available. Please try again");
			}
			
			
			
			break;
		default:
			System.out.println("Enter valid details...");
			break;
		}
		
		}while(choice!=0);
		
	}

}
