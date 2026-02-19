package com.lti.app.repository;

import java.util.List;

import com.lti.app.entity.Users;

public interface UserLoginRepo {
	public  Users searchUserById(int userid);
	public void updateuser(Users user);
}
