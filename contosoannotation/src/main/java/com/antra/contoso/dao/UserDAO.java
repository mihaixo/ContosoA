package com.antra.contoso.dao;

import java.util.List;

import com.antra.contoso.domain.User;

public interface UserDAO 
{
	void saveUser(User user);
	
	List<User> findAllUsers();
	
	void deleteUserById(int userId);
	
	public boolean validateLogin(String pass, String uName);

}
