package com.example.spring_annotation_ioc.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach{
	private FortuneService sadFortuneServices;
	
	@Autowired
	public BasketballCoach(FortuneService sadFortuneServices) {
		super();
		this.sadFortuneServices = sadFortuneServices;
	}
	@Value("${basketballCoach.workout}")
	String workout;
	@Override
	public String getDetails() {
		
		return workout;
	}
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return sadFortuneServices.getDailyFortune();
	}

}