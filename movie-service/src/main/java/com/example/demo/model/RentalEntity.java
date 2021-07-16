package com.example.demo.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class RentalEntity {

	private Integer rentId;

	private String movieName;
	
	private double rentAmount;

}
