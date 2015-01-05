package com.antra.contoso.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.antra.contoso.domain.Student;
import com.antra.contoso.service.StudentService;


@Controller
@RequestMapping("/Student")
public class StudentController 
{
	@Autowired
	StudentService studentService;
	
	@RequestMapping(value= {"/","/list"}, method=RequestMethod.GET)
	public String listStudents(ModelMap model) {
		List<Student> students = studentService.findAllStudent();
		//System.out.println(students.get(0).getEnrollmentDate());
		model.addAttribute("students",students);
		return "allStudents";
	}
	
	@RequestMapping(value= {"/save"}, method=RequestMethod.GET)
	public String newStudent(ModelMap model) {
		Student student = new Student();
		model.addAttribute("student",student);
		return "registerStudent";
	}
	
	@RequestMapping(value= {"/save"},method=RequestMethod.POST)
	public String saveStudent(@Valid Student student, BindingResult bindingResult, ModelMap model) {
		if(bindingResult.hasErrors()) {
			return "registerStudent";
		}
		studentService.saveStudent(student);
		model.addAttribute("message","Student, "+student.getFirstName()+" "+student.getLastName()+" , has been successfully created.");
		return "successS";
	}

}
