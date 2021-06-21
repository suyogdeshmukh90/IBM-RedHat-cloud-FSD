package com.model;

public enum City {
	
	MUMBAI("Mumbai"),
	CHENNAI("Chennai"),
	DELHI("Delhi"),
	PUNE("Pune");
	
	private String city;

	private City(String city) {
		this.city = city;
	}

	public String getCity() {
		return city;
	}
	

}
