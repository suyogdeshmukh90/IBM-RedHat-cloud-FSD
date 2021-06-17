package com.example.dao;

import java.sql.Connection;
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
		list =new ArrayList<Employee>();
		factory=factory.createFactory();
		connection=factory.getMyConnection();
	}
	@Override
	public Employee createEmployee(Employee employee) {
		
		
		
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() throws SQLException {
		
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery("select * from employee");
		
		while(resultSet.next())
		{
			list.add(new Employee(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), 
					resultSet.getString(4)));
		}
		return list;
	}

}
