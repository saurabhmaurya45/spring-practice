package com.springcore.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.springcore.jdbc.entities.Student;

public class StudentDaoImpl implements StudentDao{
	
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public int insert(Student student) {
		String query = "insert into student(studentName,address) values(?,?)";
		int result  = this.jdbcTemplate.update(query,student.getStudentName(),student.getAddress());
		return result;
	}
	

	@Override
	public int update(Student student) {
		String query = "update student set studentName = ?, address = ? where studentId = ?";
		int result = this.jdbcTemplate.update(query,student.getStudentName(),student.getAddress(),student.getStudentId());
		return result;
	}


	@Override
	public int delete(int studentId) {
		String query = "delete from student where studentId = ?";
		int result = this.jdbcTemplate.update(query,studentId);
		return result;
	}
	
	
	
	
}
