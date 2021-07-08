package com.example.demo.service;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.InstructorDao;
import com.example.demo.dao.InstructorDetailsDao;
import com.example.demo.entity.Instructor;
import com.example.demo.entity.InstructorDetails;
@Service
public class InstructorDetailsServiceImpl implements InstructorDetailsService{

	private InstructorDao instructorDao;
	private InstructorDetailsDao instructorDetailsDao;
	
	@Autowired
	public InstructorDetailsServiceImpl(InstructorDao instructorDao, InstructorDetailsDao instructorDetailsDao) {

		this.instructorDao = instructorDao;
		this.instructorDetailsDao = instructorDetailsDao;
	}

	@Override
	public InstructorDetails createInstructorDetails(InstructorDetails instructorDetails) {
		Instructor i= instructorDao.save(instructorDetails.getInstructor());
		instructorDetails.setInstructor(i);
		return instructorDetailsDao.save(instructorDetails);
	}


	/*
	 * @Override public List<InstructorDetails> getAllInstructorDetails() {
	 * List<InstructorDetails> list=(List<InstructorDetails>)
	 * instructorDetailsDao.findAll(); return list; }
	 */

}
