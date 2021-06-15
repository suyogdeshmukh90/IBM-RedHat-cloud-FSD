package com.example;

public class State implements Comparable<State> {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public State(String name) {
		super();
		this.name = name;
	}

	@Override
	public int compareTo(State o) {
		return name.compareTo(o.getName());
	}
	

}
