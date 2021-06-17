package com.example;

public class ThreadPrint extends Thread {
	public ThreadPrint(String name)
	{
		super(name);
		start();
	}
	
	public void run()
	{
		String name=getName();
		for(int i=1;i<=1000;i++)
		{
			System.out.println(name+" -- "+i);
		}
	}

}
