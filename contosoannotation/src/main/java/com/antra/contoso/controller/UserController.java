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

import com.antra.contoso.domain.User;
import com.antra.contoso.service.UserService;

@Controller
@RequestMapping("/User")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value= {"/","/list"}, method=RequestMethod.GET)
	public String listUsers(ModelMap model) {
		List<User> users = userService.findAllUsers();
		model.addAttribute("users",users);
		return "allUsers";
	}
	
	@RequestMapping(value= {"/save"}, method=RequestMethod.GET)
	public String newUser(ModelMap model) {
		User user = new User();
		model.addAttribute("user",user);
		return "registrationUser";
	}
	
	//TODO: change dispaly message accordingly.
	@RequestMapping(value= {"/save"},method=RequestMethod.POST)
	public String saveUser(@Valid User user, BindingResult bindingResult, ModelMap model) {
		if(bindingResult.hasErrors()) {
			return "registrationUser";
		}
		userService.saveUser(user);
		model.addAttribute("message","User "+user.getUserName()+" has been successfully created.");
		return "successUser";
	}
	
	@RequestMapping(value= {"/{userId}"},method=RequestMethod.DELETE)
	public String deleteUser(@PathVariable int userId) {
		userService.deleteUserById(userId);
		return "redirect:/User/list";
	}
	
}
