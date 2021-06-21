package com.app;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

import com.dao.AccountDTO;
import com.dao.AccountDao;
import com.dao.AccountDaoImpl;
import com.dao.AmountNotValidException;
import com.model.Account;
import com.model.Address;
import com.model.City;
import com.model.accType;
import com.services.Services;
import com.services.ServicesImpl;

public class App {
	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws SQLException, AmountNotValidException {
		Services service=new ServicesImpl();
		AccountDao accountDao=new AccountDaoImpl();
		Address add = null;
		
		int choice;
		
		System.out.println("1. Create account");
		
		System.out.println("2. Display Account");
		
		System.out.println("3 Deposit Amount");
		System.out.println("4.Withdraw Amount");
		choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			String aType = null;
			System.out.println("Enter the Account type");
			System.out.println("1.Saving Account");
			System.out.println("2.Credit_card");
			System.out.println("3.Loan");
			System.out.println("4.Current");
			int type=sc.nextInt();
			if(type==1)
			{
				 aType=accType.SAVING.toString();
				
			}
			else if(type==2)
			{
				 aType=accType.CREDIT_CARD.toString();
				
			}
			else if(type==3)
			{
				 aType=accType.LOAN.toString();
				
			}
			else if(type==4)
			{
				aType=accType.CURRENT.toString();
				
			}
			else {
				System.out.println("Enter valid account type.");
			}
			
			
			System.out.println("Enter the account holder name");
			String name=sc.next();
			System.out.println("Enter the address");
			System.out.println("Enter the adress line 1");
			String addline1=sc.next();
			
			System.out.println("Enter the address line 2");
			String addline2=sc.next();
			
			String city = null;
			System.out.println("Enter the city");
			System.out.println("1.Mumbai");
			System.out.println("2.Chennai");
			System.out.println("3.Delhi");
			System.out.println("4.Pune");
			int ch=sc.nextInt();
			if(ch==1)
			{
				city=City.MUMBAI.toString();
				
			}
			else if(ch==2)
			{
				city=City.CHENNAI.toString();
				
			}
			else if(ch==3)
			{
				city=City.DELHI.toString();
			}
			else if(ch==4)
			{
				city=City.PUNE.toString();
			}
			else
			{
				System.out.println("enter valid choice");
			}

			Account account=accountDao.createAccount (new Account(UUID.randomUUID().toString(),accType.valueOf(aType),name,
							new Address(addline1, addline2,City.valueOf(city)), 1000)); 
			System.out.println(account);
			break;
			
		
			
		case 2:
			List<AccountDTO> list=accountDao.getAllAccount();
	    	for(AccountDTO dto:list)
	    	{
	    		System.out.println(dto);
	    	}
			break;
		case 3:
			System.out.println("Enter the amount you want deposit");
			double amount=sc.nextDouble();
			accountDao.deposit(amount);
			
			break;
		case 4:
			System.out.println("Enter the amount you want to withdraw");
			amount=sc.nextDouble();
			double balance=accountDao.withdraw(amount);
			System.out.println("Balance Available");
			break;
		}

	}

}
