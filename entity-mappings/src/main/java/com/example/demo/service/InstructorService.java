package com.example.demo.service;



import java.util.List;

import com.example.demo.entity.Instructor;

public interface InstructorService {
	public Instructor createInstructor(Instructor instructor);
	public List<Instructor> getAllInstructors();
//	public Instructor updateInstructorById(Integer id, Instructor instructor) throws InstructorNotFoundException;
	public String deleteInstructorById(Integer id,Instructor instructor) throws InstructorNotFoundException;
}
