package com.example.spring_annotation_ioc.model;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneServices implements FortuneService{

	@Override
	public String getDailyFortune() {
		
		return "Feeling happy";
	}

}
