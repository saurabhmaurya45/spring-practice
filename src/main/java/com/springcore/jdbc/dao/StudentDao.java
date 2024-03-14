package com.springcore.jdbc.dao;

import java.util.List;

import com.springcore.jdbc.entities.Student;

public interface StudentDao {
	public int insert(Student student);
	public int update(Student student);
	public int delete(int studentId);
	public Student getSingleStudent(int studentId);
	public List<Student> getAllStudent();
	
}
