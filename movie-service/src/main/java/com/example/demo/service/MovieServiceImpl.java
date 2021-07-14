package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.MovieEntity;
import com.example.demo.repo.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService{
	private MovieRepository movieRepo;
	
	@Autowired
	public MovieServiceImpl(MovieRepository movieRepo) {
		
		this.movieRepo = movieRepo;
	}

	@Override
	public MovieEntity createMovie(MovieEntity movie) {
		return movieRepo.save(movie);
		
	}

	@Override
	public List<MovieEntity> getAllMovies() {
		
		return movieRepo.findAll();
	}

}
