package com.example.spring_ioc_javabased;

import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.spring_ioc_javabased.dao.AccountDao;
import com.example.spring_ioc_javabased.dao.AccountDaoImpl;
import com.example.spring_ioc_javabased.pojo.Account;
import com.example.spring_ioc_javabased.services.AccountService;
import com.example.spring_ioc_javabased.services.AccountServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
	private static Scanner sc=new Scanner(System.in);
	public static void main( String[] args )
    {
    	try {
    		 
    	
        @SuppressWarnings("resource")
		ApplicationContext context=new AnnotationConfigApplicationContext("MyConfig.class");
       
       AccountServiceImpl service= context.getBean("services",AccountServiceImpl.class);
       int choice=-1;
       String accountHolderName=null;
		double balance=0;
       do {
    	   System.out.println("1. Create Account: ");
       
		System.out.println("2: Display All Account: ");
		System.out.println("3. Update Account by id");
		System.out.println("4.Delete account by id");
		System.out.println("0. Exit");
		System.out.print("Your Choice: ");
		choice=sc.nextInt();
		switch (choice) {
		case 1:
			System.out.print("Account Holder Name: ");
			accountHolderName=sc.next();
			System.out.println("Balance: ");
			balance=sc.nextDouble();
			String str[]=UUID.randomUUID().toString().split("-");
			Account account=new Account();
			account.setId(new Random().nextInt(1000));
			account.setAccountId(str[4]);
			account.setAccountHolderName(accountHolderName);
			account.setAccountBalance(balance);
			Account tempAcc=service.createAccount(account);
			System.out.println("Account created: "+tempAcc);
			break;
			
		case 2:
			List<Account> list=service.displayAllAvailableAccount();
			Iterator<Account> i=list.iterator();
			while(i.hasNext())
			{
				System.out.println(i.next());
			}
			break;
			
		case 3:
			System.out.println("Enter the account id to update");
			String id=sc.next();
			List<Account> list1=service.displayAllAvailableAccount();
			
			Iterator<Account> it=list1.iterator();
			int flag=0;
			Account acc;
			while(it.hasNext())
			{
				acc=it.next();
				if(acc.getAccountId()==id)
				{
					flag=1;
					System.out.print("Enter new Account Holder Name: ");
					String new_accountHolderName=sc.next();
					System.out.println("new Balance: ");
					Double nbalance=sc.nextDouble();
					Account acc1=new Account();
					Account tempAcc1=service.createAccount(acc1);
					System.out.println("Account updaed successfully: "+tempAcc1);
					
				}
				
			}
			if(flag==0)
				System.out.println("Account  not fouund!");
			break;
			
		case 4:
			System.out.println("Enter the account id to update");
			String id1=sc.next();
			List<Account> list2=service.displayAllAvailableAccount();
			
			Iterator<Account> itr=list2.iterator();
			 flag=0;
			Account acc2;
			while(itr.hasNext())
			{
				acc2=itr.next();
				if(acc2.getAccountId()==id1)
				{
					flag=1;
					service.DeleteAccount(id1);
					
				}
				
			}
			if(flag==0)
				System.out.println("Account  not fouund!");
			break;
			
		} 
		
       }while(choice!=0);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    	}
}
