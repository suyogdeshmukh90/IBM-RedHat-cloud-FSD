package com.dao;

import com.model.Address;
import com.model.accType;

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

public class AccountDTO {
	private String accId;
	private String accType;
	private String accName;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private double balance;
}
