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

import com.antra.contoso.domain.Instructor;
import com.antra.contoso.service.InstructorService;

@Controller
@RequestMapping("/Instructor")
public class InstructorController {
	
	@Autowired
	InstructorService instructorService;
	
	@RequestMapping(value= {"/","/list"}, method=RequestMethod.GET)
	public String listInstructors(ModelMap model) {
		List<Instructor> instructors = instructorService.findAllInstructors();
		model.addAttribute("instructors",instructors);
		return "allInstructors";
	}
	
	@RequestMapping(value= {"/save"}, method=RequestMethod.GET)
	public String newInstructor(ModelMap model) {
		Instructor instructor = new Instructor();
		model.addAttribute("instructor",instructor);
		return "registrationInstructor";
	}
	
	//TODO: change dispaly message accordingly.
	@RequestMapping(value= {"/save"},method=RequestMethod.POST)
	public String saveInstructor(@Valid Instructor instructor, BindingResult bindingResult, ModelMap model) {
		if(bindingResult.hasErrors()) {
			return "registrationInstructor";
		}
		instructorService.saveInstructor(instructor);
		model.addAttribute("message","Instructor " + instructor.getFirstName() + 
				" " + instructor.getLastName() + " has been successfully created.");
		return "successInstructor";
	}
	
	@RequestMapping(value= {"/{instructorId}"},method=RequestMethod.DELETE)
	public String deleteInstructor(@PathVariable int instructorId) {
		instructorService.deleteInstructorById(instructorId);
		return "redirect:/Instructor/list";
	}
	
}