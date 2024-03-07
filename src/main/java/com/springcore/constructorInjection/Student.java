package com.springcore.constructorInjection;

import java.util.List;
import java.util.Map;
import java.util.Properties;



public class Student {
	private int studentId;
	private String studentName;
	private Address studentAddress;
	private List<String>  courses;
	private Map<String, String> courseDescription;
	private Properties userDetails;
	public Student(int studentId, String studentName, Address studentAddress, List<String> courses,
			Map<String, String> courseDescription, Properties userDetails) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.courses = courses;
		this.courseDescription = courseDescription;
		this.userDetails = userDetails;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ ", courses=" + courses + ", courseDescription=" + courseDescription + ", userDetails=" + userDetails
				+ "]";
	}
	
	
	
	
}
