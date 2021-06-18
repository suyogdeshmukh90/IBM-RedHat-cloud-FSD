package com.example.dao;

import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.Employee;

public interface EmployeeDao {
	public Employee createEmployee(Employee employee) throws SQLException;
	public List<Employee> getAllEmployees()throws SQLException;
	public ResultSet searchEmployee(int searchId) throws SQLException;
	
	

}
