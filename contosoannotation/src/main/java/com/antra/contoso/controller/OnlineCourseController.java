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

import com.antra.contoso.domain.OnlineCourse;
import com.antra.contoso.service.OnlineCourseService;

@Controller
@RequestMapping("/OnlineCourse")
public class OnlineCourseController {
	
	@Autowired
	OnlineCourseService onlineCourseService;
	
	@RequestMapping(value= {"/","/list"}, method=RequestMethod.GET)
	public String listOnlineCourses(ModelMap model) {
		List<OnlineCourse> onlineCourses = onlineCourseService.findAllOnlineCourses();
		model.addAttribute("onlineCourses",onlineCourses);
		return "allOnlineCourses";
	}
	
	@RequestMapping(value= {"/save"}, method=RequestMethod.GET)
	public String newOnlineCourse(ModelMap model) {
		OnlineCourse onlineCourse = new OnlineCourse();
		model.addAttribute("onlineCourse",onlineCourse);
		return "registrationOnlineCourse";
	}
	
	//TODO: change dispaly message accordingly.
	@RequestMapping(value= {"/save"},method=RequestMethod.POST)
	public String saveOnlineCourse(@Valid OnlineCourse onlineCourse, BindingResult bindingResult, ModelMap model) {
		if(bindingResult.hasErrors()) {
			return "registrationOnlineCourse";
		}
		onlineCourseService.saveOnlineCourse(onlineCourse);
		model.addAttribute("message","OnlineCourse "+onlineCourse.getOnlineCourseID()+" has been successfully created.");
		return "successOnlineCourse";
	}
	
	@RequestMapping(value= {"/{onlineCourseId}"},method=RequestMethod.DELETE)
	public String deleteOnlineCourse(@PathVariable int onlineCourseId) {
		onlineCourseService.deleteOnlineCourseById(onlineCourseId);
		return "redirect:/OnlineCourse/list";
	}
	
}