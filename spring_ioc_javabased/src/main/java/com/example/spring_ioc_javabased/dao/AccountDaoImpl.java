package com.example.spring_ioc_javabased.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.spring_ioc_javabased.pojo.Account;
@Component
public class AccountDaoImpl implements AccountDao {
	private List<Account> list;
	
	public AccountDaoImpl(List<Account> list) {
		
		this.list = list;
	}
	
	@Override
	public Account createAccount(Account account) {
		list.add(account);
		return account;
	}

	@Override
	public List<Account> displayAllAvailableAccount() {
		return list;
	}

	public List<Account> getList() {
		return list;
	}

	public void setList(List<Account> list) {
		this.list = list;
	}

	@Override
	public Account updateAccount(String accountId) {
		Account acc1 =new Account();
		list.add(acc1);
		return acc1;
	}

	@Override
	public void deleteAccount(String accountId) {
		Account acc1 =new Account();
		list.remove(acc1);
		System.out.println("Deleted successfully");
	}

}
