package com.example.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CourseDao;
import com.example.demo.dao.InstructorDao;
import com.example.demo.entity.Course;
import com.example.demo.entity.Instructor;

@Service
public class CourseServiceImpl implements CourseService{

	InstructorDao instructorDao;
	CourseDao courseDao;
	@Autowired
	public CourseServiceImpl(InstructorDao instructorDao, CourseDao courseDao) {
		
		this.instructorDao = instructorDao;
		this.courseDao = courseDao;
	}

	@Override
	public Course createCourse(Course course) {
		Instructor i= instructorDao.save(course.getInstructor());
		course.setInstructor(i);
		return courseDao.save(course);
	}
	
	/*
	 * @Override public List<Course> getAllCourses() { Iterable<Course> list=
	 * courseDao.findAll(); return list; }
	 */
			

	/*
	 *
	 * @Override public Course updateCourseById(Integer id, Course course) { // TODO
	 * Auto-generated method stub return null; }
	 * 
	 * @Override public String deleteCourseById(Integer id, Course course) throws
	 * CourseNotFoundException { Course course1=courseDao.findById(id).get();
	 * if(course1==null) { throw new
	 * CourseNotFoundException("Course with given id not found"); }
	 * courseDao.delete(course1); return "Deleted Successfully!"; }
	 */
}
