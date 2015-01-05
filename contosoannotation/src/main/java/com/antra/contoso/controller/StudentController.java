package com.antra.contoso.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.antra.contoso.domain.Student;
import com.antra.contoso.service.StudentService;

@Controller
@RequestMapping("/Student")
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@RequestMapping(value= {"/","/list"}, method=RequestMethod.GET)
	public String listStudents(ModelMap model) {
		List<Student> students = studentService.findAllStudents();
		model.addAttribute("students",students);
		return "allStudents";
	}
	
	@RequestMapping(value= {"/save"}, method=RequestMethod.GET)
	public String newStudent(ModelMap model) {
		Student student = new Student();
		model.addAttribute("student",student);
		return "registrationStudent";
	}
	
	@RequestMapping(value= {"/save"},method=RequestMethod.POST)
	public String saveStudent(@Valid Student student, BindingResult bindingResult, ModelMap model) {
		if(bindingResult.hasErrors()) {
			return "registrationStudent";
		}
		studentService.saveStudent(student);
		model.addAttribute("message","Student "+student.getFirstName()+" "+student.getLastName()+" , has been successfully created.");
		return "successStudent";
	}
	
	@RequestMapping(value= {"/{studentId}"},method=RequestMethod.DELETE)
	public String deleteStudent(@PathVariable int studentId) {
		studentService.deleteStudentById(studentId);
		return "redirect:/Student/list";
	}
	
}
