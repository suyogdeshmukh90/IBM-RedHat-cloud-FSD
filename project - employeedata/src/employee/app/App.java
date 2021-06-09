package employee.app;
import employee.Employee;
import employee.Manager;
import employee.Secretary;
import employee.Engineer;
import employee.Director;
public class App {
    public static void main(String[] args) {
        Employee emp = null;
        emp = new Manager("Suyog", 20000, "30/Apr/1997", "IT");
        System.out.println(emp.getDetails());

        emp = new Engineer("Punit", 18000, "21/Aug/1999", "Computer");
        System.out.println(emp.getDetails());

        emp = new Secretary("Ramesh", 12000, "01/Feb/1998", "Suyog");
        System.out.println(emp.getDetails());

        emp = new Director("Keshav", 25000, "30/Apr/1992", "IT",3000);
        System.out.println(emp.getDetails());


    }

}
