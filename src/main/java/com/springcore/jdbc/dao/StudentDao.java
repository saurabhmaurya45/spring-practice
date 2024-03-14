package com.springcore.jdbc.dao;

import com.springcore.jdbc.entities.Student;

public interface StudentDao {
	public int insert(Student student);
	public int update(Student student);
	public int delete(int studentId);
	
}
