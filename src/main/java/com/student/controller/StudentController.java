package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.Student;
import com.student.services.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping("/students")
	public Student saveStudent(@RequestBody Student student) {
		
		return studentService.saveStudent(student);
		
	}
	
	@GetMapping("/students")
	public List<Student> fetchStudents(){
		return studentService.fetchStudents();
	}
}
