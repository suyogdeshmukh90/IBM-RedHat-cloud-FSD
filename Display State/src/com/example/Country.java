package com.example;


import java.util.List;

public class Country implements Comparable<Country> {
	private String name;
	private List<State> states;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<State> getStates() {
		return states;
	}
	public void setStates(List<State> states) {
		this.states = states;
	}
	public Country(String name, List<State> states) {
		super();
		this.name = name;
		this.states = states;
	}
	@Override
	public int compareTo(Country c) {
		return name.compareTo(c.getName());
	}
	

}
