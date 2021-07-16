package com.example.demo.controll;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.InstructorDetails;
import com.example.demo.service.InstructorDetailsService;

@RestController
@RequestMapping("/api")
public class InstructorDetailsController {
	
	InstructorDetailsService instructorDetailsService;

	@Autowired
	public InstructorDetailsController(InstructorDetailsService instructorDetailsService) {
		super();
		this.instructorDetailsService = instructorDetailsService;
	}
	
	@PostMapping("/instructorDetails")
	ResponseEntity<InstructorDetails> createInstructorDetails(@RequestBody InstructorDetails instructorDetails)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(instructorDetailsService.createInstructorDetails(instructorDetails));
	}
	
	/*
	 * @GetMapping("/instructorDetails") ResponseEntity<Iterable<InstructorDetails>>
	 * getAllInstructorDeatils() { return
	 * ResponseEntity.status(HttpStatus.OK).body(instructorDetailsService.
	 * getAllInstructorDetails()); }
	 */
}
