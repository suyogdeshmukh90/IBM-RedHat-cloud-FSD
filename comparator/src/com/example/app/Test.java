package com.example.app;


import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;

import java.util.Scanner;
import java.util.Set;
import java.util.UUID;
import com.example.Student;
public class Test {
	
//	private Map<Integer, Student> map=null;
//	
//	{
//		map=new HashMap<Integer,Student>();
//	}
//	
	public void checkName(String name) 
	{
		if(name.length()<5)
		{
			throw new InvalidNameException("Invalid Name");
			
		}
	}
	
	
	private static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		Set<Student> student=new HashSet<Student>();
		int choice=0;
//		int key=1;
		Test test=new Test();
		
		do {
			try {
		System.out.println("Enter your choice");
		System.out.println("1. Enter student details.");
		System.out.println("2.Remove Student details.");
		System.out.println("3.Update Student details");
		System.out.println("4.Display Student details.");
		System.out.println("0. Exit");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter the student name");
			String name=sc.next();
			test.checkName(name);
			System.out.println("Enter the grade");
			String grade=sc.next();
			
			student.add( new Student(UUID.randomUUID().toString(), name, grade));
			System.out.println("Student Added Sucessfully...");
			break;
		case 2:
			System.out.println("Enter the id to remove the student details");
			String rid=sc.next();
			Student std=null;
			Iterator<Student> i= student.iterator();
			while (i.hasNext()) {
				std = i.next();
				if (std.getId().equals(rid)) {
					System.out.println("found: " + std);
					student.remove(std);
					System.out.println("removed.");
				}
				else
				{
					System.out.println("Student not found");
				}
			}
			break;
			
		case 3:
			System.out.println("Enter the id to update the student details");
			String uid=sc.next();
			 
			Iterator<Student> it= student.iterator();
			while (it.hasNext()) {
				std = it.next();
				if (std.getId().equals(uid)) {
					System.out.println("Enter the new name for student");
					String nname=sc.next();
					test.checkName(nname);
					System.out.println("Enter the new grade");
					String gd=sc.next();
					student.add(new Student(uid,nname,gd));
					System.out.println("updated successfully");
				}
				else
				{
					System.out.println("Student not found");
				}
			}
			break;
		case 4:
			
			Iterator<Student> ia=student.iterator();
			while(ia.hasNext())
			{
				Student b=ia.next();
				System.out.println(b);
			}
			break;
			
		case 0:
			System.out.println("Exiting ....Bye!");
			System.exit(0);
			break;
		default:
			System.out.println("Enter the valid input");
		}
		}catch(InputMismatchException i)
			{
				System.err.println("invalid input");
			}
		}while(choice!=0);
	}

}
