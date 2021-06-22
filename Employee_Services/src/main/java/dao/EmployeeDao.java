package dao;

import java.util.List;

import model.Employee;

public interface EmployeeDao {
	public Employee createEmployee(Employee emp);
	public List<Employee> getAllEmployees();
	public Employee getEmployeeById(Integer id);
	public Employee updateEmployee(Integer id);
	public Employee deleteEmployee(Integer id);
}
