package service;

import java.util.List;

import dao.EmployeeDao;
import dao.EmployeeDaoImpl;
import model.Employee;

public class EmployeeServicesImpl implements EmployeeServices {
	EmployeeDao employee=new EmployeeDaoImpl();
	@Override
	public Employee createEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return employee.createEmployee(emp);
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employee.getAllEmployees();
	}

	@Override
	public Employee getEmployeeById(Integer id) {
		// TODO Auto-generated method stub
		return employee.getEmployeeById(id);
	}

	@Override
	public Employee updateEmployee(Integer id) {
		// TODO Auto-generated method stub
		return employee.updateEmployee(id);
	}

	@Override
	public Employee deleteEmployee(Integer id) {
		return employee.deleteEmployee(id);
		
	}

}
