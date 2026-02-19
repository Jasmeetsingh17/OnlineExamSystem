package com.lti.app.service;

import java.util.List;

import com.lti.app.entity.Users;

public interface SearchStudentsService
{
	public List<Users> SearchStudents(String city, String tname, String state, int marks);

	public List<String> getAllCities();
	
	public List<String> getAllStates();
}
