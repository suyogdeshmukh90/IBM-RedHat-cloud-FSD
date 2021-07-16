package com.example.demo.service;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.InstructorDao;
import com.example.demo.dao.InstructorDetailsDao;
import com.example.demo.entity.Instructor;
import com.example.demo.entity.InstructorDetails;

@Service
public class InstructorServiceImpl implements InstructorService{

	private InstructorDao instructorDao;
	
	
	@Autowired
	public InstructorServiceImpl(InstructorDao instructorDao, InstructorDetailsDao instructorDetailsDao) {
		
		this.instructorDao = instructorDao;
		
	}

	@Override
	public Instructor createInstructor(Instructor instructor) {
		
		return instructorDao.save(instructor);
	}

	
	@Override
	public List<Instructor> getAllInstructors() {
	
		List<Instructor> list= instructorDao.findAll();
		return list;
	}

	
	/*
	 * @Override public Instructor updateInstructorById(Integer id, Instructor
	 * instructor) throws InstructorNotFoundException { Instructor i=
	 * instructorDao.findById(id).get(); InstructorDetails instructorDetails =
	 * i.getInstructorDetails(); if(i==null) { throw new
	 * InstructorNotFoundException("Instructor with given id not found"); }
	 * 
	 * 
	 * 
	 * i.setFirstName(instructor.getFirstName());
	 * i.setLastName(instructor.getLastName()); i.setEmail(instructor.getEmail());
	 * instructorDetails.setYoutubeChannel(instructor.getInstructorDetails().
	 * getYoutubeChannel());
	 * 
	 * instructorDetails.setHobby(instructor.getInstructorDetails().getHobby());
	 * i.setInstructorDetails(instructorDetails); instructorDao.save(i); return i; }
	 */

	@Override
	public String deleteInstructorById(Integer id, Instructor instructor) throws InstructorNotFoundException {
		Instructor i=instructorDao.findById(id).get();
		if(i==null)
		{
			throw new InstructorNotFoundException("Instructor with given id not found");
		}
		instructorDao.delete(i);
		return "Deleted Successfully!";
	}

}
