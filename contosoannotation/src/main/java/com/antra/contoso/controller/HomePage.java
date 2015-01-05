package com.antra.contoso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.antra.contoso.dao.TestDAO;
import com.antra.contoso.domain.Student;


@Controller
@RequestMapping("/")
public class HomePage 
{
	@Autowired
	TestDAO testDAO;
	
	@RequestMapping(value= {"/"}, method=RequestMethod.GET)
	public String listAddresses(ModelMap model) {
		return "homePage";
	}
	@RequestMapping(value= {"/test"}, method=RequestMethod.GET)
	public String runTest(ModelMap model) {
		//TestDAO testDAO= new TestDAO();
		testDAO.run();
		return "homePage";
	}
	@RequestMapping(value= {"/exception"}, method=RequestMethod.GET)
	public String runException(ModelMap model) {
		Student s= null;
		System.out.println(s.getFirstName());
		return "homePage";
	}

}
