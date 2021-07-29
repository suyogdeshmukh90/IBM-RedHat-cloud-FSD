package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.TraineeDao;
import com.example.demo.model.Trainee;

@SpringBootApplication
@EnableEurekaClient
public class TraineeServiceApplication implements CommandLineRunner{
	
	private TraineeDao traineeDao;
	@Autowired
	public TraineeServiceApplication(TraineeDao traineeDao) {
		
		this.traineeDao = traineeDao;
	}

	public static void main(String[] args) {
		SpringApplication.run(TraineeServiceApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		traineeDao.save(new Trainee("Kevin"));
		traineeDao.save(new Trainee("Shawn"));
		
		
	}

}
