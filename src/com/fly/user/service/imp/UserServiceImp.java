package com.fly.user.service.imp;

import com.fly.user.dao.UserDao;
import com.fly.user.service.UserService;

public class UserServiceImp implements UserService {

	private UserDao userDao ;
	@Override
	public void userSave() {
		
		userDao.save();
	}
	public UserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	
}
