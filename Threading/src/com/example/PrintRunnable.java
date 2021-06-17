package com.example;

public class PrintRunnable implements Runnable{
	
	private String name;
//	private Thread thread;
	public PrintRunnable(String name)
	{
		this.name=name;
//		thread=new Thread(this,name);
//		thread.start();
	}
	@Override
	public void run() {
		for(int i=1;i<=100;i++)
		{
			System.out.println(name+" -> "+i);
		}
		
	}

}
