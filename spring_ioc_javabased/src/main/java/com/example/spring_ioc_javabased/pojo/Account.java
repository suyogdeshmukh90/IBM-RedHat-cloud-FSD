package com.example.spring_ioc_javabased.pojo;


public class Account {
	private int id;
	private String accountId;
	private String accountHolderName;
	private Double accountBalance;
	public Account() {
		super();
	}
	public Account(int id, String accountId, String accountHolderName, Double accountBalance) {
		super();
		this.id = id;
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public Double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double balance) {
		this.accountBalance = balance;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", accountId=" + accountId + ", accountHolderName=" + accountHolderName
				+ ", accountBalance=" + accountBalance + "]";
	}
	

}
