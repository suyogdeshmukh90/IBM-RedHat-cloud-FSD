package com.app;

import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Random;

import com.model.Order;
import com.service.Services;
import com.service.ServicesImpl;

import factory.FactoryOrder;

public class App {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Services service=new ServicesImpl();
		FactoryOrder factory=new FactoryOrder();
		int choice=0;
		
		InputStreamReader reader=null;
		BufferedReader bufferedReader=null;
		reader=new InputStreamReader(System.in);
		bufferedReader=new BufferedReader(reader);
		do {
			System.out.println("Select your choice!");
			System.out.println("1.Create order in list ");
			System.out.println("2.Display order from list ");
			System.out.println("3. Save orders to File");
			System.out.println("4.Display All Orders from File");
			choice=Integer.parseInt(bufferedReader.readLine());
			switch(choice)
			{
				case 1:
					System.out.println("Enter the order Quantity");
					int quantity=Integer.parseInt(bufferedReader.readLine());
					System.out.println("Enter the Order Name");
					String name=bufferedReader.readLine();
					System.out.println("Enter the orderBy name");
					String orderby=bufferedReader.readLine();
					Order tempOrder=new Order();
					tempOrder.setQuantity(quantity);
					tempOrder.setOrderName(name);
					tempOrder.setOrderBy(orderby);
					tempOrder.setOrderId(new Random().nextInt());
					tempOrder.setOrderDate(new Date());
					Order or=service.createOrder(tempOrder);
					System.out.println("Order Successfully created!");
					break;
				case 2:
					List<Order> list=service.getAllOrder();
					for(Order i:list)
					{
						System.out.println(i);
					}
					break;
				case 3:
					List<Order> ls=service.getAllOrder();
					System.out.println("Saving to File...");
					factory.saveOrder(ls);
					System.out.println("Saved Successfully!");
					break;
				case 4:
					List<Order> list1=factory.displayAllOrders();
					for(Order ot:list1)
					{
						System.out.println(ot);
					}
					break;
				case 0:
					System.out.println("Exiting...Bye");
					System.exit(0);
					break;
				default:
					System.out.println("Invalid choice!");
					
					
			}
		}while(choice!=0);
		

	}

}
