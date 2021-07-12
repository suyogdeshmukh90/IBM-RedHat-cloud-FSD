package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name="item_number",unique=true)
	private String itemNumber;
	
	@Column(name="item_name")
	private String itemName;
	
	@Column(name="item_price")
	private Double itemPrice;
	
	@Column(name="is_available")
	private Boolean isAvailable;

	public Item(String itemNumber, String itemName, Double itemPrice, Boolean isAvailable) {
		
		this.itemNumber = itemNumber;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.isAvailable = isAvailable;
	}
	
}
