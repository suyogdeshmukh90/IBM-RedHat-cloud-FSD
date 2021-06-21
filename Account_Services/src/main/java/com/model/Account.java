package com.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Account {
	
		private String accId;
		private accType accType;
		private String accName;
		private Address address;
		double balance;

	

}
