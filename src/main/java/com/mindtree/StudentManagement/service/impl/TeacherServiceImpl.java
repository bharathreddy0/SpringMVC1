package com.mindtree.StudentManagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.StudentManagement.entity.Teacher;
import com.mindtree.StudentManagement.repository.TeacherRepository;
import com.mindtree.StudentManagement.service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService {

	@Autowired
	private TeacherRepository teacherRepo;

	@Override
	public List<Teacher> getAllTeachers() {
		// TODO Auto-generated method stub
		return teacherRepo.findAll();
	}

	@Override
	public Teacher saveTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		return teacherRepo.save(teacher);
	}

	@Override
	public Teacher getTeacherById(int id) {
		// TODO Auto-generated method stub
		return teacherRepo.findById(id).get();
	}

	@Override
	public Teacher updateTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		return teacherRepo.save(teacher);
	}

	@Override
	public void deleteTeacherById(int id) {
		// TODO Auto-generated method stub
		teacherRepo.deleteById(id);
	}

}
