package com.services;

import java.sql.SQLException;
import java.util.List;

import com.dao.AccountDTO;
import com.dao.AmountNotValidException;
import com.model.Account;

public interface Services {
	public Account createAccount(Account acc) throws SQLException;
	
	public List<AccountDTO> getAllAccount() throws SQLException;
	
	public void deposit(double amount) throws SQLException;
	public double withdraw(double amount) throws SQLException, AmountNotValidException;
}
