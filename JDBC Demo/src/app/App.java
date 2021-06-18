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
import com.example.dao.EmployeeNotFoundException;
import com.file.DatabaseToFile;
import com.file.FileToDatabase;

import service.EmployeeService;
import service.EmployeeServiceImpl;

public class App {

	public static void main(String[] args) throws SQLException, NumberFormatException, IOException, EmployeeNotFoundException {
		FileToDatabase fd=new FileToDatabase();
		DatabaseToFile dtf=new DatabaseToFile();
		EmployeeService service=new EmployeeServiceImpl();
		Employee emp;
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		int choice=0;
		do {
		System.out.println("1. Create a new employee");
		System.out.println("2.Display all employees from database");
		System.out.println("3.Find employee in database ");
		System.out.println("4.Create Employee from File");
		System.out.println("5.Enter Data of Employee to File from Database");
		System.out.println("6.Update the Data of Employee");
		System.out.println("7.Delete the Data of Employee");
		System.out.println("0. Exit");
		System.out.println("Select your choice...");
		choice=Integer.parseInt(bufferedReader.readLine());
		switch(choice)
		{
		case 1:
			System.out.println("Enter the first name");
			String fname=bufferedReader.readLine();
			fname=fname.toUpperCase();
			System.out.println("Enter the last name");
			String lname=bufferedReader.readLine();
			lname=lname.toUpperCase();
			System.out.println("Enter the email id");
			String email=bufferedReader.readLine();
			email=email.toLowerCase();
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
		case 5:
			System.out.println("create a new file name or Enter the existing file name for saving details");
			String filename=bufferedReader.readLine();
			dtf.toFile(filename);
			break;
		case 6:
			try {
			System.out.println("Enter the id to update");
			int id=Integer.parseInt(bufferedReader.readLine());
			Employee employee2=service.updateEmployee(id);
			System.out.println("Updated Employee:\n"+employee2);
			}
			catch(EmployeeNotFoundException e)
			{
				System.err.println("Employee not Found at id");
			}
			break;
		case 7:
			System.out.println("Enter the id to delete");
			int id=Integer.parseInt(bufferedReader.readLine());
			List<Employee> employee2=service.deleteEmployee(id);
			System.out.println("Deleted Below Employee from database!");
			System.out.println(employee2);
			break;
			
		case 0:
			System.out.println("Exiting...Bye!!!");
			System.exit(0);
			break;
			
		default:
			System.out.println("Enter valid details...");
			break;
		}
		
		}while(choice!=0);
		
	}

}
