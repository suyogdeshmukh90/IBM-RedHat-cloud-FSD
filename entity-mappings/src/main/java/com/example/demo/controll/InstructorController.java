package com.example.demo.controll;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Instructor;
import com.example.demo.service.InstructorNotFoundException;
import com.example.demo.service.InstructorService;

@RestController
@RequestMapping("/api")
public class InstructorController {

	InstructorService instructorService;

	@Autowired
	public InstructorController(InstructorService instructorService) {
		super();
		this.instructorService = instructorService;
	}
	
	@PostMapping("/instructors")
	ResponseEntity<Instructor> createInstructor(@RequestBody Instructor instructor)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(instructorService.createInstructor(instructor));
	}
	
	@GetMapping("/instructors")
	ResponseEntity<Iterable<Instructor>> getAllInstructors()
	{
		return ResponseEntity.status(HttpStatus.OK).body(instructorService.getAllInstructors());
	}
	
	/*
	 * @PutMapping("/instructors/{id}") ResponseEntity<Instructor>
	 * updateInstructorById(@PathVariable("id") Integer id,@RequestBody Instructor
	 * instructor) throws InstructorNotFoundException { return
	 * ResponseEntity.status(HttpStatus.OK).body(instructorService.
	 * updateInstructorById(id, instructor)); }
	 */
	
	@DeleteMapping("/instructors/{id}")
	ResponseEntity<String> deleteInstructorById(@PathVariable("id") Integer id,@RequestBody Instructor instructor) throws InstructorNotFoundException
	{
		return ResponseEntity.status(HttpStatus.OK).body(instructorService.deleteInstructorById(id, instructor));
	}
	
}
