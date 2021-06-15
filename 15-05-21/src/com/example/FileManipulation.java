package com.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileManipulation {
	public static void main(String args[]) throws IOException, FileNotFoundException
	{
		
		File inputFile=new File("farrago.txt");
		File outputFile=new File("ChangedOutput.txt");
		
		FileInputStream inputStream=new FileInputStream(inputFile);
		FileOutputStream outputStream=new FileOutputStream(outputFile);
		int ch;
		while((ch=inputStream.read())!=-1)
		{
			System.out.println(ch);
			if(ch==13||ch==10)
				outputStream.write(ch);
//			else if(ch>=65&&ch<=90)
//				outputStream.write(ch+2);
//			else if(ch>=97&&ch<=122)
//				outputStream.write(ch+2);
			else 
				outputStream.write(ch+2);
		}
		
			inputStream.close();
			outputStream.close();
		
	}

}
