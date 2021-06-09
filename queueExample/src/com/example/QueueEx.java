package com.example;

import java.util.Arrays;

public class QueueEx {
	private int[] container;
	private int size;
	private int front;
	private int rear;
	{
		front = -1;
		rear = -1;
	}
	public void createQueue(int size)
	{
		this.size=size;
		container = new int[this.size];
		System.out.println("Queue Created Successfully...");
	}
	
	public void push(int value)
	{
		if(front>size)
		{
			System.out.println("Queue Overflow...");
		}
		else
		{
			container[++front]=value;
			System.out.println("Pushed Successfully");
			++rear;
		}
	}
	
	public void pop()
	{
		
		if(rear==-1)
		{
			System.out.println("Queue Underflow");
		}
		else
		{
			System.out.println("Poped Successfully - "+container[rear--]);
			front--;
		}
	}
	public void searchQueue(int item)
	{
		int location=Arrays.binarySearch(container, item);
		if(location<0)
		{
			System.out.println("Item Not Found!");
		}
		else
		{
			System.out.println("Item Found At "+location+" postion");
		}
	}
	public int[] displayQueue()
	{
		return container;
	}
	public int[] sortedQueue()
	{
//		for(i=0;i<size-1;i++)
//		{
//			for(int j=1;j<size;j++)
//			{
//				if(container[j]>container[j+1])
//				{
//					int temp=container[j];
//					container[j]=container[j+1];
//					container[j+1]=temp;
//				}
//			}
//		}
		 Arrays.sort(container);
		return container;
	}
}
