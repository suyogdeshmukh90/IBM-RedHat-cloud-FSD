package com.example.spring_annotation_ioc.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public interface Coach {
	
	public String getDetails();
	public String getDailyFortune();
	
}
