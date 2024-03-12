package com.springcore.auto.wire.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Test {

	public static void main(String [] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/auto/wire/annotation/autoWiringDemo.xml") ;
		
		Emp emp1 = (Emp) context.getBean("emp1");
		
		System.out.println(emp1);
	
	}
}
