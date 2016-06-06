package com.demo.service;

import com.demo.model.User;


public interface UserService {
	public int insertUser(User user);
	public User findUserBy(int userId);
}
