package comm.app;
import com.model.Employee;
import com.model.Engineer;
import com.model.Manager;

public class App {

	public static void main(String[] args) {
		App app=new App();
		Employee employee=new Manager("John", "Doe", "john@email.com", 10000, "Sales");
		System.out.println(employee.getDetails());
		System.out.println(app.calculateTax(employee));
		employee=new Engineer("Marry", "Public", "marry@email.com", 19000, "Mechanical");
		System.out.println(employee.getDetails());
		System.out.println(app.calculateTax(employee));
	}
	
	
	public double calculateTax(Employee employee)
	{
		double tax=0;
		if(employee instanceof Manager)
		{
			tax= 12.0;
		}
		if(employee instanceof Engineer)
		{
			tax=11.9;
		}
		return tax;
	}

	}


