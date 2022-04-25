package com.student.services;

import java.util.List;

import com.student.entity.Student;

public interface StudentService {

	

	Student saveStudent(Student student);

	List<Student> fetchStudents();

}
