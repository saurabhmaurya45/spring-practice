package com.springcore.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springcore.jdbc.dao.StudentDao;
import com.springcore.jdbc.entities.Student;

public class App {
	
	public static void main(String[] args) {
		//creating context 
		ApplicationContext context = new  ClassPathXmlApplicationContext("com/springcore/jdbc/config.xml");
		
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
		Student s1= new Student();
		s1.setStudentName("Srishti");
		s1.setAddress("Azamgarh");
		int result = studentDao.insert(s1);
		System.out.println("No of rows inserted.."+ result);
		
	}
	
}
