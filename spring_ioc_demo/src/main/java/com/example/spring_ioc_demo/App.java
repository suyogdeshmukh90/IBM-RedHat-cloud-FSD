package com.example.spring_ioc_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.model.Coach;
import com.example.model.Employee;

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
//    		Coach theCoach=context.getBean("theCoach",Coach.class);
//    		System.out.println(theCoach.getDailyWorkout());
    		
    		Employee emp=context.getBean("employee", Employee.class);
    		
    		System.out.println(emp);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
        
    }
}
