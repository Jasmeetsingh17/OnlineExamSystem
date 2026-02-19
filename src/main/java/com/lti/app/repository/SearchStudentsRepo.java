package com.lti.app.repository;

import java.util.List;

import com.lti.app.entity.Users;

public interface SearchStudentsRepo
{
	public List<Users> SearchStudents(String city, String tname, String state, int marks	);
	public List<String> getAllCities();
	public List<String> getAllStates();

}
