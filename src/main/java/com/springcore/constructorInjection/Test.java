package com.springcore.constructorInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constructorInjection/ConstructorInjectionDemo.xml");
		
		Student s1 = (Student) context.getBean("student1");
		
		System.out.println(s1);

	}

}
