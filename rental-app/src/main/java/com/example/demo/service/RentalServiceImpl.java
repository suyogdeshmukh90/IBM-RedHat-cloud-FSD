package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.RentalEntity;
import com.example.demo.repo.RentalRepository;

@Service
public class RentalServiceImpl implements RentalService{

	private RentalRepository rentalRepo;
	@Autowired
	public RentalServiceImpl(RentalRepository rentalRepo) {
		super();
		this.rentalRepo = rentalRepo;
	}

	@Override
	public RentalEntity createRent(RentalEntity rentalEntity) {
		
		return rentalRepo.save(rentalEntity);
	}

	@Override
	public List<RentalEntity> getAllRental() {
		
		return rentalRepo.findAll();
	}

}
