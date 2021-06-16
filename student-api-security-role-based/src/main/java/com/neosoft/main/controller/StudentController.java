package com.neosoft.main.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.main.entity.Student;
import com.neosoft.main.response.CustomResponse;
import com.neosoft.main.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService studentServiceImpl;

	@PostMapping("/insert")
	public CustomResponse registerUser(@Valid @RequestBody Student student) {
		CustomResponse response = studentServiceImpl.insertStudent(student);
		return response;
	}

	@GetMapping("/findById/{id}")
	public ResponseEntity<Student> getUserById(@PathVariable("id") Long id) {
		Student student = studentServiceImpl.getStudentById(id);
		return ResponseEntity.ok().body(student);
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<Student>> getAllStudents() {
		List<Student> students = studentServiceImpl.getStudents();
		if (students != null) {
			return ResponseEntity.ok().body(students);
		} else
			return ResponseEntity.notFound().build();
	}

}
