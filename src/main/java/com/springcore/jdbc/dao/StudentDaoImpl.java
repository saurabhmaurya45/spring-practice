package com.springcore.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.springcore.jdbc.entities.Student;

public class StudentDaoImpl implements StudentDao{
	
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public int insert(Student student) {
		String query = "insert into student(studentName,address) values(?,?)";
		int result  = this.jdbcTemplate.update(query,student.getStudentName(),student.getAddress());
		return result;
	}


	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
}
