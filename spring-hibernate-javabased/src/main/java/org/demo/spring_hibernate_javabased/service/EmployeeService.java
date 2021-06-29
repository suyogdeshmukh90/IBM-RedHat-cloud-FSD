package org.demo.spring_hibernate_javabased.service;

import java.io.IOException;
import java.util.List;

import org.demo.spring_hibernate_javabased.ui.EmployeeRequestModel;
import org.demo.spring_hibernate_javabased.ui.EmployeeResponseModel;

public interface EmployeeService {
	public EmployeeResponseModel createEmployee(EmployeeRequestModel employeeDetails);
	public List<EmployeeResponseModel> displayAllEmployees();
	public EmployeeResponseModel findEmployeeById(String employeeId);
	public EmployeeResponseModel updateEmployee(String employeeId) throws IOException;
	public void deleteEmployee(String employeeId);
}
