package com.acc.test;
import com.acc.*;
import java.util.Scanner;

public class Test {
;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the Customer Id");
//		int name=sc.nextInt();
		Customer cus=new Customer();
		System.out.println("Enter the amount to withdraw");
		double Wd=sc.nextInt();
		SavingAccount sa=new SavingAccount(101,24000,cus,1000);
		sa.withdraw(14000);
		
		
	}

}
