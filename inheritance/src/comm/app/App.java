package comm.app;
import com.model.Employee;
import com.model.Engineer;
import com.model.Manager;
//this is app
public class App {

	public static void main(String[] args) {
		App app=new App();
		Employee employee=new Manager("John", "Doe", "john@email.com", 11000, "Sales");
		System.out.println(employee.getDetails());
		System.out.println(app.calculateTax(employee));
		employee=new Engineer("Marry", "Public", "marry@email.com", 17000, "Mechanical");
		System.out.println(employee.getDetails());
		System.out.println(app.calculateTax(employee));
	}
	
	
	public String calculateTax(Employee employee)
	{
		double tax=0;
		if(employee instanceof Manager)
		{
			Manager manager = (Manager)employee;
			tax= (12.4/100)*manager.getSalary();
		}
		if(employee instanceof Engineer)
		{
			Engineer engineer = (Engineer)employee;
			tax=(11.9/100)*engineer.getSalary();
		}
		return "tax:"+tax;
	}

	}

 