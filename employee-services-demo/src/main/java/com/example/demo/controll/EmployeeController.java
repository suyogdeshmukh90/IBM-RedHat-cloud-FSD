package com.example.demo.controll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.dao.EmployeeNotFoundException;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

import com.example.demo.ui.EmployeeErrorResponse;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class EmployeeController {

	private EmployeeService employeeServiceImpl;
	
	@Autowired
	public EmployeeController(EmployeeService employeeServiceImpl) {
		
		this.employeeServiceImpl = employeeServiceImpl;
	}
	
	@GetMapping("/api/employee")
	public ResponseEntity<List<Employee>> getAllEmployees()
	{
		log.info("within get all employee method");
		return ResponseEntity.status(HttpStatus.OK).body(employeeServiceImpl.getAllEmployees());
	}
	
	@PostMapping("/api/employee")
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee)
	{
		log.info("within create method");
		return ResponseEntity.status(HttpStatus.CREATED).body(employeeServiceImpl.createEmpoyee(employee));
	}
	
	@ExceptionHandler
	public ResponseEntity<EmployeeErrorResponse> handleEmployeeNotFoundException(EmployeeNotFoundException e) {
		EmployeeErrorResponse response = new EmployeeErrorResponse();
		response.setMessage(e.getMessage());
		response.setStatusCode(HttpStatus.NOT_FOUND.value());
		response.setErrorReportingTime(System.currentTimeMillis());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
	}
	
	@ExceptionHandler
	public ResponseEntity<EmployeeErrorResponse> handleTypeMisMatchedException(Exception e) {
		EmployeeErrorResponse response = new EmployeeErrorResponse();
		response.setMessage(e.getMessage());
		response.setStatusCode(HttpStatus.NOT_FOUND.value());
		response.setErrorReportingTime(System.currentTimeMillis());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
	}
	@GetMapping("/api/books/{id}")
	public ResponseEntity<Employee> findEmployeeById(@PathVariable("id") Integer id) throws EmployeeNotFoundException
	{
		log.info("within find By Id");
		return ResponseEntity.status(HttpStatus.OK).body(employeeServiceImpl.findEmployeeById(id));
	}
}
