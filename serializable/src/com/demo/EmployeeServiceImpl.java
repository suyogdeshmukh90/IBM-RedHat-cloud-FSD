package com.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeServiceImpl implements EmployeeService {
	private FileOutputStream fileOutputStream;
	private ObjectOutputStream objectOutputStream;
	private FileInputStream fileInputStream;
	private ObjectInputStream objectInputStream;
	
	@Override
	public void createEmployee(Employee e) throws IOException {
		fileOutputStream=new FileOutputStream("employee.file");
		objectOutputStream=new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(e);
	}

	@Override
	public Employee displayEmployeeFromFile() throws IOException, ClassNotFoundException {
		fileInputStream=new FileInputStream("employee.file");
		objectInputStream =new ObjectInputStream(fileInputStream);
		Employee e=(Employee)objectInputStream.readObject();
		return e;
	}

}
