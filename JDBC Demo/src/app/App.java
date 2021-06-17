package app;

import java.util.List;
import java.sql.SQLException;
import java.util.Iterator;

import com.demo.Employee;
import com.example.dao.EmployeeDao;
import com.example.dao.EmployeeDaoImpl;

public class App {

	public static void main(String[] args) throws SQLException {
		EmployeeDao dao=new EmployeeDaoImpl();
		List<Employee> employees=dao.getAllEmployees();
		Iterator<Employee> iterator=employees.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());

	}

}
