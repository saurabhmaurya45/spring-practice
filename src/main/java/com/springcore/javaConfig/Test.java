package com.springcore.javaConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(javaConfig.class);
		Student s1 = context.getBean("student", Student.class);
		
		System.out.println(s1);
	}
}
