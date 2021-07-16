package com.example.demo.proxy;



import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import com.example.demo.model.MovieEntity;

@FeignClient(name="movie-service")
public interface MovieClient {
	
	

	@GetMapping("/movies/{movieName}")
	public MovieEntity getMovieByName(@PathVariable("movieName") String movieName);

}
