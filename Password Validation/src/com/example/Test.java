package com.example;

import java.util.Scanner;

public class Test {
	
	private static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		
		String password;
		System.out.println("Enter your password to check");
		password=sc.next();
		if(UserMainCode.checkPaswword(password)==true)
			System.out.println("Valid Password");
		else
			throw new InvalidPasswordException("Invalid Password");
			System.out.println("Invalid Password");
	}
}
