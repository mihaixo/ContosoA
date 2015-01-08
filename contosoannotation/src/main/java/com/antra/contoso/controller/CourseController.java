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

import com.antra.contoso.domain.Course;
import com.antra.contoso.domain.Department;
import com.antra.contoso.service.CourseService;
import com.antra.contoso.service.DepartmentService;

@Controller
@RequestMapping("/Course")
public class CourseController {

	@Autowired
	CourseService courseService;
	
	@Autowired
	DepartmentService departmentService;
	
	@RequestMapping(value= {"/","/list"}, method=RequestMethod.GET)
	public String listCourses(ModelMap model) {
		List<Course> courses = courseService.findAllCourses();
		model.addAttribute("courses",courses);
		return "allCourses";
	}
	
	@RequestMapping(value= {"/save"}, method=RequestMethod.GET)
	public String newCourse(ModelMap model) {
		Course course = new Course();
		model.addAttribute("course",course);
		
		List<Department> departmentList = departmentService.findAllDepartments();
		model.addAttribute("departmentList", departmentList);
		return "registrationCourse";
	}
	
	@RequestMapping(value= {"/save"},method=RequestMethod.POST)
	public String saveCourse(@Valid Course course, BindingResult bindingResult, ModelMap model) {
		if(bindingResult.hasErrors()) {
			return "registrationCourse";
		}
		courseService.saveCourse(course);
		model.addAttribute("message","Course "+course.getCourseName()+" has been successfully created. Department: \n\t" + course.getDepartment().toString());
		return "successCourse";
	}
	
	@RequestMapping(value= {"/{courseId}"},method=RequestMethod.DELETE)
	public String deleteCourse(@PathVariable int courseId) {
		courseService.deleteCourseById(courseId);
		return "redirect:/Course/list";
	}
	
}
