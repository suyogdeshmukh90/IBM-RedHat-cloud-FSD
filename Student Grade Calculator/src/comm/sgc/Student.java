package comm.sgc;

public class Student {
	private int id;
	private String name;
	private  int[] marks;
	private static float average;
	private static char grade;
	public Student() {
		super();
	}
	public Student(int id, String name, int[] marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	public void calculateAvg()
	{
		int total=0;
		for(int i=0;i<marks.length;i++)
		{
			total=total+marks[i];
			
		}
		average=total/marks.length;
		
	}
	public float getAverage()
	{
		return average;
	}
	public void findGrade()
	{
		int flag=0;
		if(average>=80 && average<=100)
		{
			grade='O';
			
		}
		else {
			grade='A';
		}
		for(int i=0;i<getMarks().length;i++)
		{
			if(marks[i]<50)
			{
				flag=1;
				break;
			}
			else
				continue;
		}
		if(flag==1)
		{
			grade='F';
		}
	}
	public char getGrade()
	{
		return grade;
	}

}
