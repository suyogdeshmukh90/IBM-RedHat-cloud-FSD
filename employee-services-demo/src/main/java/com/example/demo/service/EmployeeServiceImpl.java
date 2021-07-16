package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.dao.EmployeeNotFoundException;
import com.example.demo.model.Employee;

@Service

public class EmployeeServiceImpl implements EmployeeService{

	
	private EmployeeDao employeeDaoImpl;
	@Autowired
	public EmployeeServiceImpl(EmployeeDao employeeDaoImpl) {
		
		this.employeeDaoImpl = employeeDaoImpl;
	}

	@Override
	public Employee createEmpoyee(Employee employee) {
		
		return employeeDaoImpl.createEmpoyee(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		return employeeDaoImpl.getAllEmployees();
	}

	@Override
	public Employee findEmployeeById(Integer id) throws EmployeeNotFoundException {
		
		return employeeDaoImpl.findEmployeeById(id);
	}

}
