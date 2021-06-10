package comm.sgc;
import java.util.Scanner;

public class StudentMain {
	private static Scanner sc=new Scanner(System.in);
	
	public static Student getStudentDetails()
	
	{
		
		System.out.println("Enter the Student Id");
		int id=sc.nextInt();

		System.out.println("Enter the Student name");
		String name=sc.next();
		

		System.out.println("Enter the number of subjects");
		int n = sc.nextInt();
		if(n==0)
		{
			System.out.println("Please enter valid number of subjects");
		}
		int[] mark =new int[n];
		for(int i=0;i<n;i++)
		{
		System.out.println("Enter the marks for subject "+i);
		int m=sc.nextInt();
		if(m<=0||m>100)
		{
			System.out.println("Invalid Mark");
			i--;
			continue;
		}
		mark[i]=m;
		}
		Student student=new Student(id,name,mark);
		return student;
		
	}

	public static void main(String[] args) {
		
		
		Student sm=getStudentDetails();
		
		sm.calculateAvg();
		sm.findGrade();
		System.out.println("Average is "+sm.getAverage());
		System.out.println("Grade is "+sm.getGrade());
	}

}
