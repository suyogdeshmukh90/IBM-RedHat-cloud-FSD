package com.example;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;

public class FileToCollection {
	private Set<Student> set=new TreeSet<Student>();
	File inputFile=new File("studentInfo.txt");
	
	public Set<Student> create() throws IOException
	{
		FileReader fileReader=new FileReader(inputFile);
		BufferedReader input =new BufferedReader(fileReader);
		String line=null;
		while((line=input.readLine())!=null)
		{
			String[] str=line.split(",");
			Student student=new Student();
			student.setId(UUID.randomUUID().toString());
			student.setFirstName(str[0]);
			student.setLastName(str[1]);
			student.setEmail(str[2]);
			student.setGpa(Double.parseDouble(str[3]));
			set.add(student);
		}
		input.close();
		return set;
	}
}
