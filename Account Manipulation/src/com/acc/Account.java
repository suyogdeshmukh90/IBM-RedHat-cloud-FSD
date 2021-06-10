package com.acc;

public abstract class Account extends Customer {
	protected int accountNumber;
	protected double balance;
	Customer customerObj;
	public Account() {
		super();
	}
	public Account(int accountNumber, double balance, Customer customerObj) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customerObj = customerObj;
	}
	public abstract boolean withdraw(double amount);
	
	

}
