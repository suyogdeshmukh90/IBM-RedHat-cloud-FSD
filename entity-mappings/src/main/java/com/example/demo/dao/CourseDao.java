package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Course;
@Repository
public interface CourseDao extends CrudRepository<Course, Integer>{
	
	
}
