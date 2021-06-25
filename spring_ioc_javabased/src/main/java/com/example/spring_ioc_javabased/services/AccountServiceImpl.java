package com.example.spring_ioc_javabased.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.spring_ioc_javabased.dao.AccountDao;
import com.example.spring_ioc_javabased.pojo.Account;
@Component(value="services")
public class AccountServiceImpl implements AccountService{

	AccountDao accountDaoImpl;
	@Autowired
	public AccountServiceImpl(AccountDao accountDaoImpl) {
		
		this.accountDaoImpl = accountDaoImpl;
	}

	@Override
	public Account createAccount(Account account) {
		return accountDaoImpl.createAccount(account);
	}

	@Override
	public List<Account> displayAllAvailableAccount() {
		return accountDaoImpl.displayAllAvailableAccount();
	}

	@Override
	public Account UpdateAccount(String accountId) {
		// TODO Auto-generated method stub
		return accountDaoImpl.updateAccount(accountId);
	}

	@Override
	public void DeleteAccount(String accountId) {
		// TODO Auto-generated method stub
		accountDaoImpl.deleteAccount(accountId);
	}

}
