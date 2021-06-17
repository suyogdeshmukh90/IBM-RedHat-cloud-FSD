package com.test;

import com.example.PrintRunnable;
import com.example.ThreadPrint;

public class Test {

	public static void main(String[] args) {
//		new ThreadPrint("First");
//		t1.start();
//		new ThreadPrint("Second");
//		t2.start();
//		
//		new PrintRunnable("A");
//		new PrintRunnable("B");
		
		PrintRunnable pr1=new PrintRunnable("A");
		Thread t1=new Thread(pr1);
		t1.start();
		PrintRunnable pr2=new PrintRunnable("B");
		Thread t2=new Thread(pr2);
		t2.start();
		
		
	}

}
