package dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import java.util.Scanner;

import model.Employee;
import sessionConnection.MySessionFactory;

public class EmployeeDaoImpl implements EmployeeDao{
	private static Scanner sc=new Scanner(System.in);
	private MySessionFactory mySessionFactory;
	private SessionFactory sessionFactory;
	private Session session;
	{
		mySessionFactory=MySessionFactory.createMySessionFactory();
		sessionFactory=mySessionFactory.getSessionFactory();
	}
	@Override
	public Employee createEmployee(Employee employee) {
		session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.save(employee);
		session.getTransaction().commit();
		return employee;
	}

	@Override
	public List<Employee> getAllEmployees() {
		session=sessionFactory.openSession();
		Query query=session.createQuery("select E from Employee E");
		return query.getResultList();
	}

	@Override
	public Employee getEmployeeById(Integer id) {
		session=sessionFactory.openSession();
		return session.get(Employee.class, id);
	}

	@Override
	public Employee updateEmployee(Integer id) {
		session=sessionFactory.openSession();
		Employee emp=session.get(Employee.class, id);
		System.out.println("Enter the new first name");
		String fname=sc.next();
		System.out.println("Enter the last name");
		String lname=sc.next();
		System.out.println("Enter the email");
		String new_email=sc.next();
		emp.setFirst_name(fname);
		emp.setLast_name(lname);
		emp.setEmail(new_email);
		emp.setEmployeeId(id);
		session.getTransaction().begin();
		session.merge(emp);
		session.getTransaction().commit();
		return emp;
		
	}

	@Override
	public Employee deleteEmployee(Integer id) {
		session=sessionFactory.openSession();
		Employee emp=session.get(Employee.class, id);
		session.getTransaction().begin();
		session.remove(emp);
		session.getTransaction().commit();
		System.out.println("Employee Deleted Successfully!");
		return emp;
	}

}
