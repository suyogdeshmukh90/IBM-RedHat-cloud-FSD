package com.example.demo.dao;

import java.util.List;
import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;


import com.example.demo.model.Employee;

@Repository
@EnableTransactionManagement
public class EmployeeDaoImpl implements EmployeeDao{

	private EntityManager entityManager;
	
	@Autowired
	public EmployeeDaoImpl(EntityManager entityManager) {
		
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public Employee createEmpoyee(Employee employee) {
		employee.setEmployeeId(UUID.randomUUID().toString());
		entityManager.persist(employee);
		return employee;
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Employee> getAllEmployees() {
		Query query=entityManager.createQuery("Select E from Employee E",Employee.class);
		return query.getResultList();
	}


	@Override
	@Transactional
	public Employee findEmployeeById(Integer id) throws EmployeeNotFoundException {
		Employee employee1=entityManager.find(Employee.class, id);
		if(employee1==null)
		{
			throw new EmployeeNotFoundException("Employee with the given id not found.");
		}
		return employee1;
	}
}
