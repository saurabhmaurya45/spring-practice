package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/refDemo.xml");
		
		Student s1 = (Student) context.getBean("student1");
		
		System.out.println(s1);
		

	}

}
