package com.neosoft.main.service;

import java.util.List;

import com.neosoft.main.entity.Student;
import com.neosoft.main.response.CustomResponse;

public interface StudentService {
	
	public CustomResponse insertStudent(Student student);

	public List<Student> getStudents();

	public Student getStudentById(Long id);
}
