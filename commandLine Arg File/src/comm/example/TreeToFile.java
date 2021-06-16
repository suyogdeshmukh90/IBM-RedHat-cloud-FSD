package comm.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;

public class TreeToFile {
	public static void main(String args[]) throws IOException
	{
		File outputFile=new File(args[0]);
		FileWriter out=new FileWriter(outputFile);
		Set<Student> set=new TreeSet<Student>();
		Student student=new Student(UUID.randomUUID().toString(),"Suyog","A");
		Student student1=new Student(UUID.randomUUID().toString(),"Rudra","C");
		Student student2=new Student(UUID.randomUUID().toString(),"Keshav","B");
		set.add(student);
		set.add(student1);
		set.add(student2);
		
		PrintWriter writer= new PrintWriter(out);
		Iterator<Student> i=set.iterator();
		Student std=null;
		while(i.hasNext())
		{
			std=i.next();
			String str= std.getId()+", "+std.getName()+", "+std.getGrade();
			writer.println(str);
			System.out.println(str);
		}
		
		writer.close();
		out.close();
	}

}
