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
		System.out.println("3. Search");
		System.out.println("4. Display Queue!");
		System.out.println("5. Sort the Queue ");
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
		
		case 3:
			System.out.println("Enter the value to search in Queue.");
			int value = scanner.nextInt();
			mq.searchQueue(value);
		case 4:
			int[] myQueue=mq.displayQueue();
			for(int i:myQueue)
			{
				System.out.print(i+" ");
			}
			break;
		case 5:
			int[] sQueue=mq.sortedQueue();
			for(int i:sQueue)
			{
				System.out.print(i+" ");
			}
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
