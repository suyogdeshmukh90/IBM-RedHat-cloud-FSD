package com.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.UUID;

public class Test {
	private static Scanner sc=new Scanner(System.in);
	

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File file=new File("studentDetails.txt");
		FileOutputStream fileOutputStream;
		ObjectOutputStream objectOutputStream;
		FileInputStream fileInputStream;
		ObjectInputStream objectInputStream;
		
		Set<Student> set=new HashSet<Student>();
		
		int choice;
		do {
		System.out.println("Select your choice!");
		System.out.println("1.Enter Student details");
		System.out.println("2.Display Student");
		System.out.println("3. Update Student");
		System.out.println("4 Remove Student");
		System.out.println("5 Save the details to Student file");
		System.out.println("6. Print the object from Student File ");
		choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("Enter the name");
			String name=sc.next();
			System.out.println("Enter the grade");
			String grade=sc.next();
			set.add(new Student(UUID.randomUUID().toString(),name,grade));
			break;
		case 2:
			
			Iterator<Student> i=set.iterator();
			Student std=null;
			while(i.hasNext())
			{
				std=i.next();
				String str= std.getId()+", "+std.getName()+", "+std.getGrade();
				
				System.out.println(str);
			}
			break;
		case 3:
			int flag=0;
			System.out.println("Enter the id you want to update");
			String uid=sc.next();
			
			Iterator<Student> it=set.iterator();
			Student stud=null;
			while(it.hasNext())
			{
				stud=it.next();
				if(uid==stud.getId())
				{
					flag=1;
					System.out.println("Enter the new name to update");
					String nname=sc.next();
					System.out.println("Enter the new grade");
					String ngrade=sc.next();
					stud.setName(ngrade);
					
					set.add(new Student(uid,nname,ngrade));
					System.out.println("Student Updated Successfully!!!");
					break;
				}
			}
			if(flag==0)
			{
				System.out.println("Student not found!");
			}
			break;
			
		case 4:
			flag=0;
			System.out.println("Enter the id you want to remove");
			String rid=sc.next();
			Iterator<Student> ir=set.iterator();
			Student sttud=null;
			while(ir.hasNext())
			{
				sttud=ir.next();
				if(rid==sttud.getId())
				{
					set.remove(sttud);
					System.out.println("Student Removed Successfully!!!");
				}
				
			}
			if(flag==0)
			{
				System.out.println("Student not found!");
			}
			
			break;
		case 5:
			fileOutputStream=new FileOutputStream(file);
			objectOutputStream=new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(set);
			System.out.println("Done Saved into File successfully!");
			break;
		case 6:
			fileInputStream = new FileInputStream(file);
			objectInputStream = new ObjectInputStream(fileInputStream);
			Set<Student> set1=(Set<Student>)objectInputStream.readObject();
			System.out.println(set1);
		}
		}while(choice!=0);
	}
	
}
