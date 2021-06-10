package com.example;
import java.util.Scanner;
public class Main {
	private static Scanner sc=new Scanner(System.in);
	public static Hosteller getHostellerDetails()
	{
		System.out.println("Enter the details:- ");
		
		System.out.println("Enter the student id");
		int id=sc.nextInt();
		System.out.println("Enter the student name");
		String name=sc.next();
		System.out.println("Enter the department Id");
		int deptId=sc.nextInt();
		System.out.println("Enter the gender ");
		String gender=sc.next();
		System.out.println("Enter the phone number ");
		String num=sc.next();
		System.out.println("Entre the Hostel Name");
		String hostelName=sc.next();
		System.out.println("Entre the Room number");
		int roomNumber=sc.nextInt();
		Hosteller hc = new Hosteller(id,name,deptId,gender,num,hostelName,roomNumber);
		return hc;
	}
	public static void main(String[] args) {
		Hosteller sm=getHostellerDetails();
		System.out.println("Modify Room Number?(1/0)");
		int choice;
		choice=sc.nextInt();
		
		if(choice==1)
		{
			System.out.println("Enter the new Room Number");
			int rn=sc.nextInt();
			sm.setRoomNumber(rn);
			System.out.println(sm.getRoomNumber());
			
		}
		System.out.println("Modify Phone Number?(1/0)");
		choice=sc.nextInt();
		if(choice==1)
		{
			System.out.println("Enter the new Phone Number");
			String pn=sc.next();
			sm.setPhone(pn);
			System.out.println(sm.getPhone());
			
		}
	}

}
