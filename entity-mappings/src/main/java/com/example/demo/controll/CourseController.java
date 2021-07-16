package com.example.demo.controll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Course;
import com.example.demo.service.CourseNotFoundException;
import com.example.demo.service.CourseService;

@RestController
@RequestMapping("/api")
public class CourseController {

	CourseService courseService;

	@Autowired
	public CourseController(CourseService courseService) {
		super();
		this.courseService = courseService;
	}

	@PostMapping("/courses")
	ResponseEntity<Course> createCourse(@RequestBody Course course) {
		return ResponseEntity.status(HttpStatus.CREATED).body(courseService.createCourse(course));
	}
	/*
	 * @GetMapping("/courses") ResponseEntity<List<Course>> getAllCourses() { return
	 * ResponseEntity.status(HttpStatus.OK).body(courseService.getAllCourses()); }
	 * 
	 * @PutMapping("/instructors/{id}") ResponseEntity<Course>
	 * updateCourseById(@PathVariable("id") Integer id,@RequestBody Course course) {
	 * return
	 * ResponseEntity.status(HttpStatus.OK).body(courseService.updateCourseById(id,
	 * course)); }
	 * 
	 * 
	 * @DeleteMapping("/courses/{id}") ResponseEntity<String>
	 * deleteCourseById(@PathVariable("id") Integer id,@RequestBody Course course)
	 * throws CourseNotFoundException { return
	 * ResponseEntity.status(HttpStatus.OK).body(courseService.deleteCourseById(id,
	 * course)); }
	 */
}
