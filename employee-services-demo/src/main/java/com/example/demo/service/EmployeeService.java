package com.example.demo.service;

import java.util.List;

import com.example.demo.dao.EmployeeNotFoundException;
import com.example.demo.model.Employee;

public interface EmployeeService {
public Employee createEmpoyee(Employee employee);
	
	public List<Employee> getAllEmployees();

	Employee findEmployeeById(Integer id) throws EmployeeNotFoundException;
}
