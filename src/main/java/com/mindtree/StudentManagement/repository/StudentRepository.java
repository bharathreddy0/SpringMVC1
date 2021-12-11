package com.mindtree.StudentManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.StudentManagement.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
