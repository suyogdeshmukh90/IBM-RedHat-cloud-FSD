package service;

import java.sql.SQLException;
import java.util.List;

import com.demo.Employee;
import com.example.dao.EmployeeDao;
import com.example.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService{
private EmployeeDao employeeDao;
	
	
	public EmployeeServiceImpl() throws SQLException {
		employeeDao=new EmployeeDaoImpl();
	}
	@Override
	public Employee createEmployee(Employee employee) throws SQLException {
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() throws SQLException {
		return employeeDao.getAllEmployees();
	}

}
