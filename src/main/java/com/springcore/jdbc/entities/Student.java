package com.springcore.jdbc.entities;

public class Student {
	private String studentName;
	private String address;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String studentName, String address) {
		super();
		this.studentName = studentName;
		this.address = address;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
