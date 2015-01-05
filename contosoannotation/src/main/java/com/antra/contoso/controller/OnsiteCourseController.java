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

import com.antra.contoso.domain.OnsiteCourse;
import com.antra.contoso.service.OnsiteCourseService;

@Controller
@RequestMapping("/OnsiteCourse")
public class OnsiteCourseController {
	
	@Autowired
	OnsiteCourseService onsiteCourseService;
	
	@RequestMapping(value= {"/","/list"}, method=RequestMethod.GET)
	public String listOnsiteCourses(ModelMap model) {
		List<OnsiteCourse> onsiteCourses = onsiteCourseService.findAllOnsiteCourses();
		model.addAttribute("onsiteCourses",onsiteCourses);
		return "allOnsiteCourses";
	}
	
	@RequestMapping(value= {"/save"}, method=RequestMethod.GET)
	public String newOnsiteCourse(ModelMap model) {
		OnsiteCourse onsiteCourse = new OnsiteCourse();
		model.addAttribute("onsiteCourse",onsiteCourse);
		return "registrationOnsiteCourse";
	}
	
	//TODO: change dispaly message accordingly.
	@RequestMapping(value= {"/save"},method=RequestMethod.POST)
	public String saveOnsiteCourse(@Valid OnsiteCourse onsiteCourse, BindingResult bindingResult, ModelMap model) {
		if(bindingResult.hasErrors()) {
			return "registrationOnsiteCourse";
		}
		onsiteCourseService.saveOnsiteCourse(onsiteCourse);
		model.addAttribute("message","OnsiteCourse "+onsiteCourse.getOnsiteCourseId()+" has been successfully created.");
		return "successOnsiteCourse";
	}
	
	@RequestMapping(value= {"/{onsiteCourseId}"},method=RequestMethod.DELETE)
	public String deleteOnsiteCourse(@PathVariable int onsiteCourseId) {
		onsiteCourseService.deleteOnsiteCourseById(onsiteCourseId);
		return "redirect:/OnsiteCourse/list";
	}
	
}