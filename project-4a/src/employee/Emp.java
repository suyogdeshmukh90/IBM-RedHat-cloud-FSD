package employee;



public class Emp {
	private String empName;
	private double salary;
	
	public Emp() {
		super();
	}
	public Emp(String empName, double salary)
	{
		super();
		this.empName=empName;
		this.salary=salary;
	}
	
	


	@Override
	public String toString() {
		return "Employee Name: " + empName + " Salary: " + salary;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		Emp emp = null;
		if (obj instanceof Emp) {
			emp = (Emp) obj;
		}
		if(this.salary==emp.salary)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
