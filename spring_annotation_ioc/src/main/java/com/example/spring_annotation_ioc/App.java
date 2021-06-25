package com.example.spring_annotation_ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.spring_annotation_ioc.model.BasketballCoach;
import com.example.spring_annotation_ioc.model.Coach;
import com.example.spring_annotation_ioc.model.CricketCoach;
import com.example.spring_annotation_ioc.model.Person;

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
			/*
			 * Person person=context.getBean("person", Person.class);
			 * System.out.println(person);
			 * 
			 * Person person1=context.getBean("person", Person.class); person1.setId(201);
			 * person1.setName("Rock"); person1.setEmail("rock@email.com");
			 * person1.setTeam("Delhi Capitals");
			 * 
			 * System.out.println(person1); System.out.println(person==person1);
			 */
    		
    		Coach coach=context.getBean("cricketCoach",CricketCoach.class);
    		System.out.println(coach.getDetails());
    		System.out.println(coach.getDailyFortune());
    		Coach coach1=context.getBean("basketballCoach",BasketballCoach.class);
    		System.out.println(coach1.getDetails());
    		System.out.println(coach1.getDailyFortune());
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
}
