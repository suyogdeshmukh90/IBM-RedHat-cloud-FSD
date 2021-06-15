package com.example;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class Test {
	public static void main(String args[]) throws IOException
	{
		FileToCollection fileCol=new FileToCollection();
		Set<Student> set=fileCol.create();
		Iterator<Student> i=set.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}
}
