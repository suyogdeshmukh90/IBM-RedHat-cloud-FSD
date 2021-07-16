package com.example.demo.service;

import java.util.List;

import com.example.demo.model.RentalEntity;

public interface RentalService {
	public RentalEntity createRent(RentalEntity rentalEntity);
	public List<RentalEntity> getAllRental();
	
}
