package com.services;


import java.sql.SQLException;
import java.util.List;

import com.dao.AccountDTO;
import com.dao.AccountDao;
import com.dao.AccountDaoImpl;
import com.dao.AmountNotValidException;

import com.model.Account;

public class ServicesImpl implements Services{
	private AccountDao accDao;
	public ServicesImpl() throws SQLException {
		accDao=new AccountDaoImpl();
	}
	@Override
	public Account createAccount(Account acc) throws SQLException {
	
		return accDao.createAccount(acc);
	}

	@Override
	public List<AccountDTO> getAllAccount() throws SQLException {
		return accDao.getAllAccount();
	}

	@Override
	public void deposit(double amount) throws SQLException {
		
			accDao.deposit(amount);
	}

	@Override
	public double withdraw(double amount) throws SQLException, AmountNotValidException {
		double balance = 0;
		try {
			 balance=accDao.withdraw(amount);
			
		}catch(AmountNotValidException e)
		{
			System.err.println("Invalid Amount to withdraw!");
		}
		return balance;
	}

}
