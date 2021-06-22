package service;

import java.util.List;

import model.Employee;

public interface EmployeeServices {
	public Employee createEmployee(Employee emp);
	public List<Employee> getAllEmployees();
	public Employee getEmployeeById(Integer id);
	public Employee updateEmployee(Integer id);
	public Employee deleteEmployee(Integer id);
}
