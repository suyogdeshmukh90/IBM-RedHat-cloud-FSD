package com.example;

import java.util.Scanner;

public class App {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int ch;
		QueueEx mq = new QueueEx();
		System.out.println("Enter the size for queue...");
		int len = scanner.nextInt();
		mq.createQueue(len);
		do
		{
		System.out.println("1. Push");
		System.out.println("2.Pop");
		System.out.println("0. Exit");
		System.out.println("Enter the choice...");
		ch = scanner.nextInt();
		switch(ch) {
		case 1: 
			System.out.println("Enter the integer value to push");
			int val = scanner.nextInt();
			mq.push(val);
			break;
			
		case 2:
			mq.pop();
			break;
		case 0:
			System.out.println("Exiting....Bye Bye!!!");
			System.exit(0);
			break;
			
		default:
			System.out.println("Invalid input");
		
		}
		
		}while(ch!=0);

	}

}
