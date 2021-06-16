package com.demo;

import java.io.IOException;

public interface EmployeeService {
	public void createEmployee(Employee e) throws IOException;
	public Employee displayEmployeeFromFile() throws IOException,ClassNotFoundException;

}
