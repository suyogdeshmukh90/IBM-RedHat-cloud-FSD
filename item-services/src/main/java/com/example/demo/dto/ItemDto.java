package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ItemDto {

	private String itemNumber;
	private String itemName;
	private Double itemPrice;
	private Boolean isAvailable;
}
