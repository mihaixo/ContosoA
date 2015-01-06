package com.antra.contoso.service;

import java.util.List;

import com.antra.contoso.domain.User;

public interface UserService 
{
	void saveUser(User user);
	
	List<User> findAllUsers();
	
	void deleteUserById(int userId);
	
	boolean validateLogin(String pass, String uName);

}
