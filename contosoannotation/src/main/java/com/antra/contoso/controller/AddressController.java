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

import com.antra.contoso.domain.Address;
import com.antra.contoso.service.AddressService;

@Controller
@RequestMapping("/Address")
public class AddressController {

	@Autowired
	AddressService addressService;
	
	@RequestMapping(value= {"/","/list"}, method=RequestMethod.GET)
	public String listAddresses(ModelMap model) {
		List<Address> addresses = addressService.findAllAddresses();
		model.addAttribute("addresses",addresses);
		return "allAddresses";
	}
	
	@RequestMapping(value= {"/save"}, method=RequestMethod.GET)
	public String newAddress(ModelMap model) {
		Address address = new Address();
		model.addAttribute("address",address);
		return "registrationAddress";
	}
	
	@RequestMapping(value= {"/save"},method=RequestMethod.POST)
	public String saveAddress(@Valid Address address, BindingResult bindingResult, ModelMap model) {
		if(bindingResult.hasErrors()) {
			return "registrationAddress";
		}
		addressService.saveAddress(address);
		model.addAttribute("message","Address "+address.getAddressId()+" has been successfully created.");
		return "successAddress";
	}
	
	@RequestMapping(value= {"/{addressId}"},method=RequestMethod.DELETE)
	public String deleteAddress(@PathVariable int addressId) {
		addressService.deleteAddressById(addressId);
		return "redirect:/Address/list";
	}
	
}
