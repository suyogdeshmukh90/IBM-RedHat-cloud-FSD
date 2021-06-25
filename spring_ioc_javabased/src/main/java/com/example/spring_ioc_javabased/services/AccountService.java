package com.example.spring_ioc_javabased.services;

import java.util.List;

import com.example.spring_ioc_javabased.pojo.Account;

public interface AccountService {
	public Account createAccount(Account account);
	public List<Account> displayAllAvailableAccount();
	public Account UpdateAccount(String accountId);
	public void  DeleteAccount(String accountId);
	

}
