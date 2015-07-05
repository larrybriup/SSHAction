package com.briup.service.impl;

import com.briup.bean.User;
import com.briup.dao.UserDao;
import com.briup.service.UserService;

public class UserServiceImpl implements UserService{
	private UserDao userDao;
	public void register(User user) throws RuntimeException {
		User u = 
			userDao.findByName(user.getUserName());
		if(u!=null){
			throw new RuntimeException("用户名已经存在！！");
		}
		userDao.saveOrUpdate(user);
	}
	public UserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}