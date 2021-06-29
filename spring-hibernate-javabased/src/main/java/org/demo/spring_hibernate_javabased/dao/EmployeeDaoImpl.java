package org.demo.spring_hibernate_javabased.dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.Query;

import org.demo.spring_hibernate_javabased.dto.EmployeeDto;
import org.demo.spring_hibernate_javabased.entity.Employee;
import org.demo.spring_hibernate_javabased.ui.EmployeeResponseModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
@Repository
@EnableTransactionManagement
public class EmployeeDaoImpl implements EmployeeDao{
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));

	private SessionFactory sessionFactory;

	private ModelMapper modelMapper;
	
	public EmployeeDaoImpl(SessionFactory sessionFactory, ModelMapper modelMapper) {
		
		this.sessionFactory = sessionFactory;
		this.modelMapper = modelMapper;
	}

	@Override
	@Transactional
	public EmployeeResponseModel createEmployee(EmployeeDto employeeDetails) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		Employee employee=modelMapper.map(employeeDetails, Employee.class);
		Session currentSession = sessionFactory.getCurrentSession();
//		currentSession.getTransaction().begin();
		currentSession.persist(employee);
//		currentSession.getTransaction().commit();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		EmployeeResponseModel model = modelMapper.map(employee, EmployeeResponseModel.class);
		return model;
	
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<EmployeeResponseModel> displayAllEmployees() {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		Session currentSession = sessionFactory.openSession();
		Query query=currentSession.createQuery("select B from Employee B",Employee.class);
		List<Employee> list=query.getResultList();
		
		Iterator<Employee> i=list.iterator();
		List<EmployeeResponseModel> list1=new ArrayList<EmployeeResponseModel>();
		while(i.hasNext())
		{
				list1.add(modelMapper.map(i.next(), EmployeeResponseModel.class));
		}
		
		return list1;
	}

	@Override
	
	public EmployeeResponseModel findEmployeeById(String employeeId) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		Session session=sessionFactory.openSession();
//		Employee employee=session.get(Employee.class, employeeId);
		Session currentSession = sessionFactory.openSession();
		@SuppressWarnings("deprecation")
		Query query=currentSession.createQuery("select B from Employee B where employeeId=:empId").setString("empId",employeeId);
		List<Employee> list=query.getResultList();
		
		Iterator<Employee> i=list.iterator();
		List<EmployeeResponseModel> list1=new ArrayList<EmployeeResponseModel>();
		while(i.hasNext())
		{
				list1.add(modelMapper.map(i.next(), EmployeeResponseModel.class));
		}
		
		EmployeeResponseModel model = list1.get(0);
		return model;
	}

	@Override
	@Transactional
	public EmployeeResponseModel updateEmployee(String employeeId) throws IOException {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

		Session session=sessionFactory.getCurrentSession();
		Session currentSession = sessionFactory.openSession();
		@SuppressWarnings("deprecation")
		Query query=currentSession.createQuery("select B from Employee B where employeeId=:empId").setString("empId",employeeId);
		@SuppressWarnings("unchecked")
		List<Employee> list=query.getResultList();
		
		Employee employee=list.get(0);
		
		
//		Employee employee=session.get(Employee.class, employeeId);
		System.out.println("Enter the new first name");
		String nfirst=bufferedReader.readLine();
		System.out.println("Enter the new last name");
		String nlast=bufferedReader.readLine();
		System.out.println("Enter the new email");
		String nemail=bufferedReader.readLine();
		employee.setFirstName(nfirst);
		employee.setLastName(nlast);
		employee.setEmail(nemail);
		
		session.merge(employee);
		EmployeeResponseModel model = modelMapper.map(employee, EmployeeResponseModel.class);
		return model;
		
	}

	@Override
	
	public void deleteEmployee(String employeeId) {
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("select B from Employee B where employeeId=:empId").setString("empId",employeeId);
		@SuppressWarnings("unchecked")
		List<Employee> list=query.getResultList();
		
		Employee employee=list.get(0);
		session.remove(employee);
		System.out.println("Successfully Deleted book");
	}

}
