package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Trainee;

@Repository
public interface TraineeDao extends JpaRepository<Trainee, Integer>{

}
