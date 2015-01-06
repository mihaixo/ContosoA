package com.antra.contoso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.antra.contoso.dao.UserDAO;
import com.antra.contoso.domain.User;


@Service("userService")
@Transactional
public class UserServiceImp implements UserService {
	
	@Autowired
	private UserDAO userDao;

	@Override
	public void saveUsers(User user) {
		userDao.saveUser(user);

	}

	@Override
	public List<User> findAllUsers() {
		List<User> lis= userDao.findAllUsers();
		return lis;
	}

	@Override
	public void deleteUsersById(int userId) {
		userDao.deleteUserById(userId);

	}

	@Override
	public boolean validateLogin(String pass, String uName) {
		return userDao.validateLogin(pass,uName);
	}

}
