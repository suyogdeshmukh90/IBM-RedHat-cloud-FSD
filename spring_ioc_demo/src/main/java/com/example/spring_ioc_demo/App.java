package com.example.spring_ioc_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.model.Coach;
import com.example.model.Employee;
import com.example.model.ManagerEmp;

import model2.MyInterface;
import model3.Customer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try {
    		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    		/*Coach theCoach=context.getBean("theCoach",Coach.class);
    		System.out.println(theCoach.getDailyWorkout());
    		
    		ManagerEmp emp=context.getBean("employee", ManagerEmp.class);
    		
    		
    		emp.setFirstName("john");
    		emp.setLastName("miller");
    		System.out.println(emp.getDetails());
    		*/
    		
    		/*MyInterface cd=context.getBean("theCD", MyInterface.class);
    		System.out.println(cd.getDetails());
    		MyInterface cd1=context.getBean("theCD1", MyInterface.class);
    		System.out.println(cd1.getDetails());*/
    		
    		Customer cus=context.getBean("theCustomer",Customer.class);
    		System.out.println(cus.toString());
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
        
    }
}
