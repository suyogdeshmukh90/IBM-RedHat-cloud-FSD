package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.MovieEntity;

import com.example.demo.service.MovieService;

@RestController
public class MovieController {
	private Environment environment;
	private MovieService movieService;
	
	@Autowired
	public MovieController(Environment environment, MovieService movieService) {
		
		this.environment = environment;
		this.movieService = movieService;
	}

	@GetMapping
	public String getStatus()
	{
		return "app running and up on port"+environment.getProperty("local.server.port");
	}
	
	@PostMapping("/movies")
	public MovieEntity createMovie(@RequestBody MovieEntity movieEntity)
	{
		return movieService.createMovie(movieEntity);
	}
	
	@GetMapping("/movies")
	public List<MovieEntity> getAllMovies()
	{
		return movieService.getAllMovies();
	}
	@GetMapping("/movies/{movieName}")
	public MovieEntity getMovieByName(@PathVariable("movieName") String movieName)
	{
		return movieService.findByMovieName(movieName);
	}

}
