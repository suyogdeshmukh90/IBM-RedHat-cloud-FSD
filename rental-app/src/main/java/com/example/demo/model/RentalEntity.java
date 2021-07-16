package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="rental")
public class RentalEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer rentId;
	@Column(name="movie_name")
	private String movieName;
	@Column(name="rent_ammount")
	private double rentAmount;

}
