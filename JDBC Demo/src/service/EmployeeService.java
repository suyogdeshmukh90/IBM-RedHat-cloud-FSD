package service;

import java.util.List;
import java.sql.SQLException;

import com.demo.Employee;

public interface EmployeeService {
	public Employee createEmployee(Employee employee) throws SQLException;
	
	public List<Employee> getAllEmployees()throws SQLException;

}
