package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.MovieEntity;
import com.example.demo.model.RentalEntity;
import com.example.demo.proxy.RentalClient;
import com.example.demo.service.MovieService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class MovieController {
	private Environment environment;
	private MovieService movieService;
	private RentalClient rentalClient;
	
	@Autowired
	public MovieController(Environment environment, MovieService movieService, RentalClient rentalClient) {
		super();
		this.environment = environment;
		this.movieService = movieService;
		this.rentalClient = rentalClient;
	}

	@GetMapping
	public String getStatus()
	{
		return "app running and up on port"+environment.getProperty("local.server.port");
	}
	
	@PostMapping("/movies")
	public ResponseEntity<MovieEntity> createMovie(@RequestBody MovieEntity movieEntity)
	{
		return new ResponseEntity<MovieEntity>(movieService.createMovie(movieEntity),HttpStatus.CREATED);
	}
	
	@GetMapping("/movies")
	public ResponseEntity<List<MovieEntity>> getAllMovies()
	{
		return new ResponseEntity<List<MovieEntity>>(movieService.getAllMovies(),HttpStatus.OK);
	}
	@GetMapping("/movies/{movieName}")
	public ResponseEntity<MovieEntity> findByMovieName(@PathVariable("movieName") String movieName)
	{
		return new ResponseEntity<MovieEntity>(movieService.findByMovieName(movieName),HttpStatus.FOUND);
	}
	
	@GetMapping("/movies/rentals")
	@HystrixCommand(fallbackMethod = "rentalFallBack")
	public ResponseEntity<List<RentalEntity>> getAllRental()
	{
		return new ResponseEntity<List<RentalEntity>>(rentalClient.getAllRental(),HttpStatus.OK);
	}
	
	
	public ResponseEntity<List<RentalEntity>> rentalFallBack()
	{
		List<RentalEntity> list=new ArrayList<RentalEntity>();
		list.add(new RentalEntity(0,null,0.0));
		return ResponseEntity.ok(list);
	}

}
