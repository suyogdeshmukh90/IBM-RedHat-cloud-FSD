package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmployeeDao {
	public Employee createEmpoyee(Employee employee);
	
	public List<Employee> getAllEmployees();

	Employee findEmployeeById(Integer id) throws EmployeeNotFoundException;
	
}