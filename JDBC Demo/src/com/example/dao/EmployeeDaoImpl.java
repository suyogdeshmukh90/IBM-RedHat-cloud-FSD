package com.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.Employee;
import com.factory.FactoryConnection;
import java.sql.Statement;

public class EmployeeDaoImpl implements EmployeeDao {
	private List<Employee> list;
	private FactoryConnection factory;
	private Connection connection;
	
	public EmployeeDaoImpl() throws SQLException
	{
		
		factory=factory.createFactory();
		connection=factory.getMyConnection();
	}
	@Override
	public Employee createEmployee(Employee employee) throws SQLException {
		PreparedStatement preparedStatement=connection.prepareStatement("insert into employee(employee_id,first_name,last_name,email)values(?,?,?,?)");
		preparedStatement.setInt(1, employee.getId());
		preparedStatement.setString(2, employee.getFirstName());
		preparedStatement.setString(3, employee.getLastName());
		preparedStatement.setString(4, employee.getEmail());
		int result=preparedStatement.executeUpdate();
		System.out.println(result+" rows added successfully!");
		
		
		return employee;
	}

	@Override
	public List<Employee> getAllEmployees() throws SQLException {
		list =new ArrayList<Employee>();
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery("select * from employee");
		
		while(resultSet.next())
		{
			list.add(new Employee(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), 
					resultSet.getString(4)));
		}
		return list;
	}
	
	public ResultSet searchEmployee(int searchId) throws SQLException {
		list=new  ArrayList<Employee>();
		PreparedStatement state=connection.prepareStatement("select * from employee where employee_id=?");
		state.setInt(1,searchId);
		ResultSet result=state.executeQuery();
		
		return result;
	}

}
