package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.model.Account;

public interface AccountDao {
	public Account createAccount(Account acc) throws SQLException;
	
	public List<AccountDTO> getAllAccount() throws SQLException;
	
	public void deposit(double amount) throws SQLException;
	public double withdraw(double amount) throws SQLException, AmountNotValidException;
	
	
}
