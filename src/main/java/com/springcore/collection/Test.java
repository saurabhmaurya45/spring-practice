package com.springcore.collection;

import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	
	public static void main(String[ ] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collection/collectionConfig.xml");
		Employee emp1 = (Employee)context.getBean("emp1");
		
		System.out.println(emp1);
		Properties pr = (Properties)emp1.getProps();
		System.out.println(pr.getProperty("host"));
		 
	}

}
