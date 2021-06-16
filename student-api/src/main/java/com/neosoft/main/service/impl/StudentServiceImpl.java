package com.neosoft.main.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.main.entity.Student;
import com.neosoft.main.exception.ResourceNotFoundException;
import com.neosoft.main.repository.StudentRepository;
import com.neosoft.main.response.CustomResponse;
import com.neosoft.main.service.StudentService;

import lombok.AllArgsConstructor;
@Service
@Transactional
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository repository;
	
	@Override
	public CustomResponse insertStudent(Student student) {
		CustomResponse response = new CustomResponse();

		if (student != null) {
			if (repository.findByEmail(student.getEmail()) == null) {
				Student save = repository.save(student);
				if (save != null) {
					response.setStatus(true);
					response.setMessage("Student inserted !");
				} else {
					response.setStatus(false);
					response.setMessage("Student insertion Failed");
				}
			} else {
				response.setStatus(false);
				response.setMessage("Student Already Exist! Please provide different email!");
			}
		}
		else {
			response.setStatus(false);
			response.setMessage("Null Student!");
		}

		return response;
	}

	@Override
	public List<Student> getStudents() {
		return repository.findAll();
	}

	@Override
	public Student getStudentById(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not found with id: " + id));
	}

}
