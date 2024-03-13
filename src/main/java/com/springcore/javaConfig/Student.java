package com.springcore.javaConfig;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("123")
	private String studentId;
	@Value("Saurabh Maurya")
	private String studentName;
	@Value("#{address}")
	private Address studentAddress;
//	@Value("#{courseList}")
	@Autowired
	private List<String> courses;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String studentId, String studentName, Address studentAddress, List<String> courses) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.courses = courses;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Address getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ ", courses=" + courses + "]";
	}
	
	
	
}
