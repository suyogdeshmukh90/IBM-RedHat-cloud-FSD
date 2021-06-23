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
import model.People;
import model.Review;
import model.Student;
import model.University;

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
    	   
    	   SessionFactory sessionFactory= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetails.class).addAnnotatedClass(Course.class).addAnnotatedClass(Review.class).addAnnotatedClass(People.class).buildSessionFactory();
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
    	   
    	   Review review=new Review();
    	   review.setComment("helpful");
    	   Course course=new Course();
    	   course.addReview(review);
    	   
    	   People people1=new People();
    	   people1.setFirstname("manyata");
    	   people1.setLastname("Kumar");
    	   people1.setEmail("manyata@email.com");
    	   
    	   List<Course> list=new ArrayList<Course>();
    	   list.add(course1);
    	   list.add(course2);
    	   people1.setCourses(list);
    	   session.getTransaction().begin();
    	   session.persist(instructor);
    	   
    	   session.persist(people1);
    	   session.getTransaction().commit();
    	   logger.info("Done!");
    	   
    	  /*Student student=new Student();
    	   University university=new University();
    	   student.setFirstName("Rahul");
    	   student.setLastName("Dravid");
    	   student.setSection("Science");
    	   university.add(student);
    	   
    	   Student student1=new Student();
    	   student1.setFirstName("chetan");
    	   student1.setLastName("sharma");
    	   student1.setSection("commerce");
    	   university.add(student1);
    	   university.setUniversityName("SPPU");
    	   university.setCountry("India");
    	   student.setUniversityDetails(university);
    	   session.getTransaction().begin();
    	   session.persist(university);
    	   session.getTransaction().commit();
    	   
    	   */
    	  
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
