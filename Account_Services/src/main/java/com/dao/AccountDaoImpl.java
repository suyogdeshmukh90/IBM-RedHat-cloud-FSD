package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.connection.ConnectAccount;
import com.model.Account;

public class AccountDaoImpl implements AccountDao {
	private Account acc;
	private ConnectAccount connectAcc;
	private Connection connection;
	private List<AccountDTO> accounts;
	
	

	
		public AccountDaoImpl() throws SQLException {
			
				connectAcc = connectAcc.createConnection();
				connection = connectAcc.getMyConnection();
		}
	
	@Override
	public Account createAccount(Account account) throws SQLException {
		PreparedStatement preparedStatement = connection.prepareStatement("insert into account values(?,?,?,?,?,?,?)");
		preparedStatement.setString(1, account.getAccId());
		preparedStatement.setString(2, account.getAccType().getaccType());
		preparedStatement.setString(3, account.getAccName());
		preparedStatement.setString(4, account.getAddress().getAddressline1());
		preparedStatement.setString(5, account.getAddress().getAdressline2());
		preparedStatement.setString(6, account.getAddress().getCity().getCity());
		preparedStatement.setDouble(7, account.getBalance());
		preparedStatement.executeUpdate();
		return account;
		
	}

	@Override
	public List<AccountDTO> getAllAccount() throws SQLException {
		accounts = new ArrayList<AccountDTO>();
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from account");
		while (resultSet.next()) {

			accounts.add(new AccountDTO(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3),
					resultSet.getString(4), resultSet.getString(5), resultSet.getString(6), resultSet.getDouble(7)));
		}

		return accounts;
		
		
	}

	@Override
	public void deposit(double amount) throws SQLException {
		
		acc.setBalance(amount+acc.getBalance());
		System.out.println("Rs. "+amount+" deposited successfully");
		System.out.println("Updated balance is Rs."+acc.getBalance());
		PreparedStatement preparedStatement = connection.prepareStatement("insert into account(balance) values(?)");
		preparedStatement.setDouble(1, acc.getBalance());
		preparedStatement.executeUpdate();
		

	}

	@Override
	public double withdraw(double amount) throws SQLException, AmountNotValidException {
		if(acc.getBalance()>500)
		{
			double withAmt=acc.getBalance()-amount;
			if(withAmt>500)
			{
				acc.setBalance(withAmt);
				PreparedStatement preparedStatement = connection.prepareStatement("insert into account(balance) values(?)");
				preparedStatement.setDouble(1, acc.getBalance());
				preparedStatement.executeUpdate();
			}
			else
			{
				throw new AmountNotValidException("Amount not valid to withdraw");
			}
		}
		else
		{
			throw new AmountNotValidException("Amount not valid to withdraw");
		}
		
		return acc.getBalance();
		
	}

}
