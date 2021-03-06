package com.example.demo;

import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dao.ItemDao;
import com.example.demo.model.Item;

@SpringBootApplication
@EnableEurekaClient
public class ItemServicesApplication implements CommandLineRunner{
	private ItemDao itemDao;
	@Autowired
	public ItemServicesApplication(ItemDao itemDao) {
		
		this.itemDao = itemDao;
	}

	public static void main(String[] args) {
		SpringApplication.run(ItemServicesApplication.class, args);
	}
	
	@Bean
	public ModelMapper modelMapper()
	{
		return new ModelMapper();
	}
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	@Override
	public void run(String... args) throws Exception {
		itemDao.save(new Item(UUID.randomUUID().toString(),"Item-1", 100.0, true));
		itemDao.save(new Item(UUID.randomUUID().toString(),"Item-2", 101.0, false));
		itemDao.save(new Item(UUID.randomUUID().toString(),"Item-3", 100.2, true));
		
	}
}
