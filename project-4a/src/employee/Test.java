package employee;
import employee.Emp;
public class Test {

	public static void main(String[] args) {
		Emp emp = new Emp();
		emp.createEmp("Suyog", 15000);
		System.out.println(emp.toString());
		
		Emp emp1 = new Emp();
		
		emp1.createEmp("Punit", 12000);
		System.out.println(emp.toString());
		System.out.println(emp==emp1);
		System.out.println(emp.equals(emp1));
		
	}

}
