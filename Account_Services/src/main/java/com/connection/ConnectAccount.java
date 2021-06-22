package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectAccount {
	Connection connection;
	private static ConnectAccount connectAcc;
	private ConnectAccount() throws SQLException
	{
		
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/account","root","root");
		
	}
	public  ConnectAccount createConnection() throws SQLException
	{
		if(connectAcc==null)	
			connectAcc=new ConnectAccount();
		
		return connectAcc;
	}
	public Connection getMyConnection()
	{
		return connection;
	}
}
