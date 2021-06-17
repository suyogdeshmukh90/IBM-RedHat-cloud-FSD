package com.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FactoryConnection {
	Connection connection;
	private static FactoryConnection factory;
	
	private FactoryConnection() throws SQLException
	{
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","root");
		
	}
	public static FactoryConnection createFactory() throws SQLException
	{
		if(factory==null)
		{
			factory=new FactoryConnection();
		}
		return factory;
	}
	public Connection getMyConnection()
	{
		return connection;
	}
}
