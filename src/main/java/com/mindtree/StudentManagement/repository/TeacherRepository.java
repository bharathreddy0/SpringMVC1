package com.mindtree.StudentManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.StudentManagement.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

}
