package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorlController {

	@Autowired
	private Environment environment;
	
	public HelloWorlController(Environment environment) {
		super();
		this.environment = environment;
	}

	@GetMapping("/")
	public String hello()
	{
		return "Hello World Apploication is running on port number:"+environment.getProperty("local.server.port");
	}
}
