package com.springcore.jdbc.entities;

public class Student {
	private int studentId;
	private String studentName;
	private String address;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String studentName, String address, int studentId) {
		super();
		this.studentName = studentName;
		this.address = address;
		this.studentId = studentId;
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
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	
}
