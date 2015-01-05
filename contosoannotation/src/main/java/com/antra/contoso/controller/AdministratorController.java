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

import com.antra.contoso.domain.Administrator;
import com.antra.contoso.service.AdministratorService;

@Controller
@RequestMapping("/Administrator")
public class AdministratorController {

	@Autowired
	AdministratorService administratorService;
	
	@RequestMapping(value= {"/","/list"}, method=RequestMethod.GET)
	public String listAdministrators(ModelMap model) {
		List<Administrator> administrators = administratorService.findAllAdministrators();
		model.addAttribute("administrators",administrators);
		return "allAdministrators";
	}
	
	@RequestMapping(value= {"/save"}, method=RequestMethod.GET)
	public String newAdministrator(ModelMap model) {
		Administrator administrator = new Administrator();
		model.addAttribute("administrator",administrator);
		return "registrationAdministrator";
	}
	
	@RequestMapping(value= {"/save"},method=RequestMethod.POST)
	public String saveAdministrator(@Valid Administrator administrator, BindingResult bindingResult, ModelMap model) {
		if(bindingResult.hasErrors()) {
			return "registrationAdministrator";
		}
		administratorService.saveAdministrator(administrator);
		model.addAttribute("message","Administrator " + administrator.getFirstName() + 
				" " + administrator.getLastName() + " has been successfully created.");
		return "successAdministrator";
	}
	
	@RequestMapping(value= {"/{administratorId}"},method=RequestMethod.DELETE)
	public String deleteAdministrator(@PathVariable int administratorId) {
		administratorService.deleteAdministratorById(administratorId);
		return "redirect:/Administrator/list";
	}
	
}
