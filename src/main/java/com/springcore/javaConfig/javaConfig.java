package com.springcore.javaConfig;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springcore.javaConfig")
public class javaConfig {
//	@Bean
//	public Address getAddress() {
//		return new Address();
//	}
//	
//	@Bean(name = {"student", "temp"})
//	public Student getStudent() {
//		return new Student();
//	}
	@Bean(name= {"courseList"})
	public List<String> getCourses(){
		List<String> courses = new ArrayList<String>();
		courses.add("java");
		courses.add("python");
		courses.add("php");
		
		
		return courses;
		
		
	}
	
}
