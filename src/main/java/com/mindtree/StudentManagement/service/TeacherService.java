package com.mindtree.StudentManagement.service;

import java.util.List;

import com.mindtree.StudentManagement.entity.Teacher;

public interface TeacherService {
	List<Teacher> getAllTeachers();

	Teacher saveTeacher(Teacher teacher);

	Teacher getTeacherById(int id);

	Teacher updateTeacher(Teacher teacher);

	void deleteTeacherById(int id);
}
