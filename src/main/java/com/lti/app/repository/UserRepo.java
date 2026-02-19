package com.lti.app.repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.app.entity.Users;

@Repository
public class UserRepo implements UserRepo1 {

	@Autowired
	EntityManager eMan;
	@Override
	public void addUser(Users user) {
		// TODO Auto-generated method stub
		eMan.persist(user);
	}

}
