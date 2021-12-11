package com.mindtree.StudentManagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.StudentManagement.entity.Student;
import com.mindtree.StudentManagement.repository.StudentRepository;
import com.mindtree.StudentManagement.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepo;
	
	
//	public StudentServiceImpl(StudentRepository studentRepo) {
//		super();
//		this.studentRepo = studentRepo;
//	}


	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepo.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepo.save(student);
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return studentRepo.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepo.save(student);
	}

	@Override
	public void deleteStudentById(int id) {
		// TODO Auto-generated method stub
		studentRepo.deleteById(id);
	}
}
