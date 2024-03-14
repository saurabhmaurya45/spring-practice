package com.springcore.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

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


	@Override
	public Student getSingleStudent(int studentId) {
		String query = "select * from student where studentId = ?";
		
		RowMapper<Student> rowMapper = new RowMapperImpl();
		
		Student student = this .jdbcTemplate.queryForObject(query, rowMapper, studentId);
		
		return student;
	}


	@Override
	public List<Student> getAllStudent() {
		String query = "select * from student";
		List<Student> studentList = this.jdbcTemplate.query(query,new RowMapperImpl( ));
		
		return studentList;
	}
	
	
	
	
	
}
