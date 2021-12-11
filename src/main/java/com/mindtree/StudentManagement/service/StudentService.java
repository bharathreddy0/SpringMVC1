package com.mindtree.StudentManagement.service;

import java.util.List;

import com.mindtree.StudentManagement.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();

	Student saveStudent(Student student);
	
	Student getStudentById(int id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(int id);
}
