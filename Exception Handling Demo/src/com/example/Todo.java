package com.example;

public class Todo {
	private String toid;
	private String desc;
	private boolean isCompleted;
	public Todo() {
		super();
	}
	public Todo(String toid, String desc, boolean isCompleted) {
		super();
		this.toid = toid;
		this.desc = desc;
		this.isCompleted = isCompleted;
	}
	public String getToid() {
		return toid;
	}
	public void setToid(String toid) {
		this.toid = toid;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public boolean isCompleted() {
		return isCompleted;
	}
	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}
	@Override
	public String toString() {
		return "Todo [toid=" + toid + ", desc=" + desc + ", isCompleted=" + isCompleted + "]";
	}
	
	
}
	
	
