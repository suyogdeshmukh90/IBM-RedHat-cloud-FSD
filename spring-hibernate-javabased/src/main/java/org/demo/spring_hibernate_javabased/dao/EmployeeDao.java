package org.demo.spring_hibernate_javabased.dao;

import java.io.IOException;
import java.util.List;

import org.demo.spring_hibernate_javabased.dto.EmployeeDto;
import org.demo.spring_hibernate_javabased.ui.EmployeeResponseModel;

public interface EmployeeDao {
	public EmployeeResponseModel createEmployee(EmployeeDto employeeDetails);

	public List<EmployeeResponseModel> displayAllEmployees();
	public EmployeeResponseModel findEmployeeById(String employeeId);
	public EmployeeResponseModel updateEmployee(String employeeId) throws IOException;
	public void deleteEmployee(String employeeId);
}
