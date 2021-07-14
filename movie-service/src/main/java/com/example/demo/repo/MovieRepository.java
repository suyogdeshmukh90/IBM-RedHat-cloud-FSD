package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.MovieEntity;

@Repository
public interface MovieRepository extends JpaRepository<MovieEntity, String>{

}
