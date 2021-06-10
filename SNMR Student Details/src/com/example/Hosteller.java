package com.example;

public class Hosteller extends Student {
	private String hostelName;
	private int roomNumber;
	public Hosteller() {
		super();
	}
	public Hosteller(int studentId, String name, int departmentId, String gender, String phone, String hostelName, int roomNumber) {
		super(studentId, name, departmentId, gender, phone);
		this.hostelName=hostelName;
		this.roomNumber=roomNumber;
	}
	
	@Override
	public String getPhone() {
		// TODO Auto-generated method stub
		return super.getPhone();
	}
	@Override
	public void setPhone(String phone) {
		// TODO Auto-generated method stub
		super.setPhone(phone);
	}
	public String getHostelName() {
		return hostelName;
	}
	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	
	
}
