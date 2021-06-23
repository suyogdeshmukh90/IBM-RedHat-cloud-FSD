package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.Query;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.Scanner;
import java.util.logging.Logger;

import model.Course;
import model.Instructor;
import model.InstructorDetails;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("unchecked")
	public static void main( String[] args )
    {
    	Logger logger=Logger.getLogger("org.example.App.class");
       try {
    	   
    	   SessionFactory sessionFactory= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetails.class).addAnnotatedClass(Course.class).buildSessionFactory();
    	   Session session=sessionFactory.getCurrentSession();
    	   
    	   Instructor instructor=new Instructor();
    	   InstructorDetails details=new InstructorDetails();
    	   instructor.setFirstName("ajinkya");
    	   instructor.setLastName("rahane");
    	   instructor.setEmail("ajinkya@email.com");
    	   
    	   details.setYoutubeChannel("my-channel-2");
    	   details.setHobby("Cricket");
    	   
    	   Course course1=new Course();
    	   course1.setCourseName("Python");
    	   instructor.add(course1);
    	   
    	   Course course2=new Course();
    	   course2.setCourseName("Angular");
    	   instructor.add(course2);
    	   
    	   instructor.setInstructorDetails(details);
    	   details.setInstructor(instructor);
    	   session.getTransaction().begin();
    	   session.persist(instructor);
    	   session.getTransaction().commit();
    	   logger.info("Done!");
//    
    	   //For Display
//    	   session=sessionFactory.openSession();
//      List<Instructor> list=new ArrayList<Instructor>();
//      Query query=session.createQuery("Select e from Instructor e");
//      
//      list=query.getResultList();
//      Iterator<Instructor> i=list.iterator();
//      while(i.hasNext())
//    	  {
//    	  System.out.println(i.next());
//       }
    	   
//    	   For Remove
//    	   session.getTransaction().begin();
//    	   
//    	   session.remove(session.get(Instructor.class, 1));
//    	   session.getTransaction().commit();
//   		System.out.println("Employee Deleted Successfully!");
       }catch(Exception e)
       {
    	   e.printStackTrace();
       }
    }
}
