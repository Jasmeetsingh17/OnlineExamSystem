package com.lti.app.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.app.entity.Users;

@Repository
public class SearchStudentsRepoImpl implements SearchStudentsRepo
{

	@Autowired
	EntityManager eMan;

	@Override
	public List<Users> SearchStudents(String city, String tname, String state, int marks)
	{
		//Query qry = eMan.createQuery(
		//		"select u from Users u inner join Reportcard r on u.userid = r.userid inner join Topic t on t.tid = r.tid where u.city = 'Navi Mumbai' and t.tname = 'Java'");
		Query qry = eMan.createQuery("select u.fullname, u.email, u.mobile_number, u.city, u.state, u.college, u.userid, r.marks, r.remarks from Users u inner join Reportcard r on u.userid = r.userid inner join Topic t on t.tid = r.tid where u.city = ?1 and r.marks = ?4 and u.state = ?3 and t.tname = ?2");
		
		qry.setParameter(1, city);
		qry.setParameter(2, tname);
		qry.setParameter(3, state);
		qry.setParameter(4, marks);
		
		return qry.getResultList();
	}

	@Override
	public List<String> getAllCities()
	{
		// TODO Auto-generated method stub
		Query qry = eMan.createQuery("select distinct city from Users");
		return qry.getResultList();
	}
	
	@Override
	public List<String> getAllStates()
	{
		// TODO Auto-generated method stub
		Query qry = eMan.createQuery("select distinct state from Users");
		return qry.getResultList();
	}

}
