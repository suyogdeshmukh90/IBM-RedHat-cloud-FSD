package com.example.demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.UUID;

import com.example.Beer;

public class Test {

	private Map<Integer, Beer> map=null;
	
	{
		map=new HashMap<Integer,Beer>();
	}
	
	private static Scanner scanner=new Scanner(System.in);
	public static void main(String args[])
	
	{
		int key=1;
		int choice=0;
		Test tester=new Test();
		
		do
		{
			try {
				System.out.println("1. Add A New Beer.");
				System.out.println("2. Display All Available Beer.");
				System.out.println("3. find the beer.");
				System.out.println("4. Remove the beer.");
				System.out.println("5. Update the beer.");
				System.out.println("0. Quit");
				System.out.print("Enter Your choice: ");
				choice=scanner.nextInt();
				switch (choice) {
				case 1:
					System.out.print("Beer Name: ");
					String name=scanner.next();
					System.out.print("Beer Price: ");
					double price=scanner.nextDouble();
					tester.map.put(key++, new Beer(UUID.randomUUID().toString(), name, price));
					System.out.println("Beer Added Sucessfully...");
					break;
				case 2:
					Collection<Beer> collection=tester.map.values();
					Iterator<Beer> i=collection.iterator();
					while(i.hasNext())
					{
						Beer b=i.next();
						System.out.println(b);
					}

					break;
				case 3:
					System.out.print("Enter beer id: ");
					int id=scanner.nextInt();
					Beer beer=tester.map.get(id);
					if(beer==null)
					{
						System.out.println("no beer found with the id: "+id);
					}
					else
					{
						System.out.println("Beer Found\n"+beer);
					}
					break;
				case 4:
					System.out.print("Enter beer id: ");
					id=scanner.nextInt();
					beer=tester.map.get(id);
					if(beer==null)
					{
						System.out.println("no beer found with the id: "+id);
					}
					else
					{
						tester.map.remove(id);
						System.out.println("Removed Sucessfully");
					}
					break;
				case 5:
					System.out.println("Enter the beer id to update");
					id=scanner.nextInt();
					beer=tester.map.get(id);
					if(beer==null)
					{
						System.out.println("no beer found with the id: "+id);
					}
					else
					{
						System.out.print("Enter New Beer Name: ");
						String nname=scanner.next();
						System.out.print("Enter New Beer Price: ");
						double nprice=scanner.nextDouble();
						tester.map.put(id, new Beer(UUID.randomUUID().toString(), nname, nprice));
						System.out.println("Beer Updated Successfully...");
						break;
					}
					break;
					
				case 0:
					System.out.println(tester.map);
					System.out.println("Exit from System. Bye..");
					
					System.exit(0);
					break;
					
				default:
					System.out.println("Invalid Choice Try Again.");
					break;
				}
				
			} catch (InputMismatchException e) {
				System.err.println("input mispatched.");
				
			}
			
		}while(choice!=0);
		
		
		
	}

}
