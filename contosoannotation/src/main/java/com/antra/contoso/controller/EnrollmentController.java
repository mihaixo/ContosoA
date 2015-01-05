package com.antra.contoso.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.antra.contoso.domain.Enrollment;
import com.antra.contoso.service.EnrollmentService;

@Controller
@RequestedMapping("/Enrollment")
public class EnrollmentController {
	
	@Autowired
	EnrollmentService enrollmentService;
	
	@RequestMapping(value= {"/","/list"}, method=RequestMethod.GET)
	public String listEnrollments(ModelMap model) {
		List<Enrollment> enrollments = enrollmentService.findAllEnrollments();
		model.addAttribute("enrollments",enrollments);
		return "allEnrollments";
	}
	
	@RequestMapping(value= {"/save"}, method=RequestMethod.GET)
	public String newEnrollment(ModelMap model) {
		Enrollment enrollment = new Enrollment();
		model.addAttribute("enrollment",enrollment);
		return "registrationEnrollment";
	}
	
	//TODO: change dispaly message accordingly.
	@RequestMapping(value= {"/save"},method=RequestMethod.POST)
	public String saveEnrollment(@Valid Enrollment enrollment, BindingResult bindingResult, ModelMap model) {
		if(bindingResult.hasErrors()) {
			return "registrationEnrollment";
		}
		enrollmentService.saveEnrollment(enrollment);
		model.addAttribute("message","Enrollment "+enrollment.getEnrollmentId()+" has been successfully created.");
		return "successEnrollment";
	}
	
	@RequestMapping(value= {"/{enrollmentId}"},method=RequestMethod.DELETE)
	public String deleteEnrollment(@PathVariable int enrollmentId) {
		enrollmentService.deleteEnrollmentById(enrollmentId);
		return "redirect:/Enrollment/list";
	}

}
