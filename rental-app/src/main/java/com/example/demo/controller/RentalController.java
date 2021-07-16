package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.MovieEntity;
import com.example.demo.model.RentalEntity;
import com.example.demo.proxy.MovieClient;
import com.example.demo.service.RentalService;

@RestController
public class RentalController {

	private RentalService rentalService;
	private MovieClient movieClient;
	@Autowired
	public RentalController(RentalService rentalService, MovieClient movieClient) {
		
		this.rentalService = rentalService;
		this.movieClient = movieClient;
	}
	@PostMapping("/rentals")
	public ResponseEntity<RentalEntity> createRent(@RequestBody RentalEntity rentalEntity) throws Exception
	{
		MovieEntity movie=movieClient.getMovieByName(rentalEntity.getMovieName());
		if(movie.getIsAvailable()==false)
		{
			throw new Exception();
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(rentalService.createRent(rentalEntity));
	}
	@GetMapping("/rentals")
	public ResponseEntity<List<RentalEntity>> getAllRental()
	{
		return ResponseEntity.status(HttpStatus.OK).body(rentalService.getAllRental());
	}
}
