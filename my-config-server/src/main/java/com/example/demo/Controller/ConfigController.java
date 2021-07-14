package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ConfigController {
	private Environment environment;

	@Autowired
	public ConfigController(Environment environment) {
		
		this.environment = environment;
	}
	@GetMapping
	public ResponseEntity<String> getStatus()
	{
		return new ResponseEntity<String>("Server running on port no. "+environment.getProperty("local.server.port"), HttpStatus.OK);
	}
}
