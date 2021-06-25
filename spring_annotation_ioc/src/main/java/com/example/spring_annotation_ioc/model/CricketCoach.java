package com.example.spring_annotation_ioc.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="cricketCoach")
public class CricketCoach implements Coach{
	private FortuneService happyFortuneServices;
	
	@Autowired
	public CricketCoach(FortuneService happyFortuneServices) {
		super();
		this.happyFortuneServices = happyFortuneServices;
	}
	@Value("${cricketCoach.workout}")
	String dailyWorkout;
	public String getDetails()
	{
		 
		return dailyWorkout;
	}
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return happyFortuneServices.getDailyFortune();
	}
	
}
