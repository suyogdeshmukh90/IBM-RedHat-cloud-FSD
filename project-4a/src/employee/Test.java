package employee;

public class Test {

	public static void main(String[] args) {
		Emp emp = null;
		emp= new Emp("Suyog", 15000);
		System.out.println(emp.toString());
		
		Emp emp1 = new Emp();
		
		emp1 = new Emp("Punit", 15000);
		System.out.println(emp.toString());
		System.out.println(emp==emp1);
		System.out.println(emp.equals(emp1));
		
	}

}
