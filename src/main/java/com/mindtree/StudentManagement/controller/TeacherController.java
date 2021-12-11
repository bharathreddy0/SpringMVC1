package com.mindtree.StudentManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.mindtree.StudentManagement.entity.Teacher;
import com.mindtree.StudentManagement.service.TeacherService;

@Controller
public class TeacherController {
	
	@Autowired
	private TeacherService teacherService;
	
	@GetMapping("/teachers")
	public String listTeachers(Model model) {
		model.addAttribute("teachers", teacherService.getAllTeachers());
		return "teachers";
	}

	@GetMapping("/teachers/new")
	public String createTecherForm(Model model) {

		// create teacher object to hold teacher form data
		Teacher teacher = new Teacher();
		model.addAttribute("teacher", teacher);
		return "create_teacher";
	}

	@PostMapping("/teachers")
	public String saveTeacher(@ModelAttribute("teacher") Teacher teacher) {
		teacherService.saveTeacher(teacher);
		return "redirect:/teachers";
	}

	@GetMapping("/teachers/edit/{id}")
	public String editTeacherForm(@PathVariable int id, Model model) {
		model.addAttribute("teacher", teacherService.getTeacherById(id));
		return "edit_teacher";
	}

	@PostMapping("/teachers/{id}")
	public String updateTeacher(@PathVariable int id, @ModelAttribute("teacher") Teacher teacher, Model model) {
		// get teacher from database by id
		Teacher existingTeacher = teacherService.getTeacherById(id);
		existingTeacher.setId(id);
		existingTeacher.setfName(teacher.getfName());
		existingTeacher.setlName(teacher.getlName());
		existingTeacher.setEmail(teacher.getEmail());

		// save updated teacher object
		teacherService.updateTeacher(existingTeacher);
		return "redirect:/teachers";
	}
	
	// handler method to handle delete teacher request
	@GetMapping("/teachers/{id}")
	public String deleteTeacher(@PathVariable int id) {
		teacherService.deleteTeacherById(id);
		return "redirect:/teachers";
	}
}
