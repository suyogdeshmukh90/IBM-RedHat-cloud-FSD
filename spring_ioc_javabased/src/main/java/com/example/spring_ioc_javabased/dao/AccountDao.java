package com.example.spring_ioc_javabased.dao;

import java.util.List;

import com.example.spring_ioc_javabased.pojo.Account;

public interface AccountDao {
	public Account createAccount(Account account);
	public List<Account> displayAllAvailableAccount();
	public Account updateAccount(String accountId);
	public void deleteAccount(String accountId);
	

}
