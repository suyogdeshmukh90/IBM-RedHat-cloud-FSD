package app;

import java.util.List;
import java.util.Random;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;

import com.demo.Employee;



import service.EmployeeService;
import service.EmployeeServiceImpl;

public class App {

	public static void main(String[] args) throws SQLException, NumberFormatException, IOException {
		EmployeeService service=new EmployeeServiceImpl();
		Employee emp;
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		int choice=0;
		do {
		System.out.println("1. Create a new employee");
		System.out.println("2.Display all employees from database");
		System.out.println("3.Find employee in database ");
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
			int flag=0;
			while(employee.next())
			{
				flag=1;
				System.out.println("employee found");
				
			}
			
			if(flag==0)
				System.out.println("Employee not found!");
			
			
//			
//			while(it.hasNext())
//			{
//				if(searchId==((Employee) employee).getId())
//				{
//					System.out.println("Employee found! ");
//					System.out.println(emp);
//					flag=1;
//				}
//			}
//			
			break;
		case 0:
			System.out.println("Exiting...Bye!!!");
			System.exit(0);
			break;
		case 4:
			System.out.println("Enter valid details...");
			break;
		}
		
		}while(choice!=0);
		
	}

}
