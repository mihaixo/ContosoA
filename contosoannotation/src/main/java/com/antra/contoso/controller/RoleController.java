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

import com.antra.contoso.domain.Role;
import com.antra.contoso.service.RoleService;

@Controller
@RequestMapping("/Role")
public class RoleController {
	
	@Autowired
	RoleService roleService;
	
	@RequestMapping(value= {"/","/list"}, method=RequestMethod.GET)
	public String listRoles(ModelMap model) {
		List<Role> roles = roleService.findAllRoles();
		model.addAttribute("roles",roles);
		return "allRoles";
	}
	
	@RequestMapping(value= {"/save"}, method=RequestMethod.GET)
	public String newRole(ModelMap model) {
		Role role = new Role();
		model.addAttribute("role",role);
		return "registration";
	}
	
	@RequestMapping(value= {"/save"},method=RequestMethod.POST)
	public String saveRole(@Valid Role role, BindingResult bindingResult, ModelMap model) {
		if(bindingResult.hasErrors()) {
			return "registration";
		}
		roleService.saveRole(role);
		model.addAttribute("message","Role ,"+role.getRoleName()+" , has been successfully created.");
		return "successR";
	}
	
	@RequestMapping(value= {"/{roleId}"},method=RequestMethod.DELETE)
	public String deleteRole(@PathVariable int roleId) {
		roleService.deleteRoleById(roleId);
		return "redirect:/list";
	}
	
}
