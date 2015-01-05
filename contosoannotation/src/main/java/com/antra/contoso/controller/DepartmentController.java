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

import com.antra.contoso.domain.Department;
import com.antra.contoso.service.DepartmentService;

@Controller
@RequestMapping("/Department")
public class DepartmentController {
	
	@Autowired
	DepartmentService departmentService;
	
	@RequestMapping(value= {"/","/list"}, method=RequestMethod.GET)
	public String listDepartments(ModelMap model) {
		List<Department> departments = departmentService.findAllDepartments();
		model.addAttribute("departments",departments);
		return "allDepartments";
	}
	
	@RequestMapping(value= {"/save"}, method=RequestMethod.GET)
	public String newDepartment(ModelMap model) {
		Department department = new Department();
		model.addAttribute("department",department);
		return "registrationDepartment";
	}
	
	//TODO: change dispaly message accordingly.
	@RequestMapping(value= {"/save"},method=RequestMethod.POST)
	public String saveDepartment(@Valid Department department, BindingResult bindingResult, ModelMap model) {
		if(bindingResult.hasErrors()) {
			return "registrationDepartment";
		}
		departmentService.saveDepartment(department);
		model.addAttribute("message","Department "+department.getName()+" has been successfully created.");
		return "successDepartment";
	}
	
	@RequestMapping(value= {"/{departmentId}"},method=RequestMethod.DELETE)
	public String deleteDepartment(@PathVariable int departmentId) {
		departmentService.deleteDepartmentById(departmentId);
		return "redirect:/Department/list";
	}

}
