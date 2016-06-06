package com.demo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.demo.api.UserApi;
import com.demo.dao.UserDao;
import com.demo.model.User;
import com.demo.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService,UserApi {
	@Resource
	private UserDao userDao;
	
	public User findUserBy(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public int insertUser(User user) {
		
		return userDao.insertUser(user);
	}

}
