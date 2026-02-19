package com.lti.app.service;

import java.util.List;

import com.lti.app.entity.Users;

public interface UserServiceLogin {
	public Users searchUserById(int userid);
	public void updateuser(Users user);
}
