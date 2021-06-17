package com.example.dao;

import java.util.List;
import java.sql.SQLException;

import com.demo.Employee;

public interface EmployeeDao {
	public Employee createEmployee(Employee employee);
	public List<Employee> getAllEmployees()throws SQLException;
	

}
