package comm.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileUtilities {
	public static void main(String args[]) throws IOException,FileNotFoundException
	{
		File inputFile=new File(args[0]);
		File outputFile=new File(args[1]);
		
		FileReader in=new FileReader(inputFile);
		FileWriter out=new FileWriter(outputFile);
		
		BufferedReader inputStream = new BufferedReader(in);
		PrintWriter outputStream = new PrintWriter(out);
		
		String st;
		while ((st = inputStream.readLine()) != null) {
			System.out.println(st);
			outputStream.println(st);
			
		}

		in.close();
		out.close();
	}

}
