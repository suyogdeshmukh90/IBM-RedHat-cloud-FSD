package com.example.demo.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.GetMapping;


import com.example.demo.model.RentalEntity;

@FeignClient(name="rental-app-service")
public interface RentalClient {
	@GetMapping("/rentals")
	public List<RentalEntity> getAllRental();
}
