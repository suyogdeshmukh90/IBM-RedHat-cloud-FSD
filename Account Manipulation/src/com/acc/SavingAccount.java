package com.acc;

public class SavingAccount extends Account {
	private double minimumBalance;
	
	
	public SavingAccount() {
		super();
	}
	


	public SavingAccount(int accountNumber, double balance, Customer customerObj, double minimumBalance) {
		super(accountNumber, balance, customerObj);
		this.minimumBalance=minimumBalance;
		
	}

	

	@Override
	public boolean withdraw(double amount) {
		if(balance>=minimumBalance)
		{
			System.out.println("Withdraw Successful of Rs. "+amount);
			balance=balance-amount;
			System.out.println("Balance available is Rs. "+balance);
			return true;
		}
		else
		{
			System.out.println("Withdraw Failed");
			System.out.println("Balance Available is Rs. "+balance);
		return false;
		}
	}

}
