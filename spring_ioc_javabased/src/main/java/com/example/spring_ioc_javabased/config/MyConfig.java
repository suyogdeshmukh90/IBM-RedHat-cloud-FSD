package com.example.spring_ioc_javabased.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.example.spring_ioc_javabased.pojo.Account;


@Component
@ComponentScan(basePackages = {"com.example"})
public class MyConfig {
	@Bean
	public ArrayList<Account> list()
	{
		return new ArrayList<Account>();
	}

}
