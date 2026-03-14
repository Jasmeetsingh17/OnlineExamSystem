package com.lti.app.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.app.entity.Reportcard;
import com.lti.app.entity.Users;

@Repository
public class ReportCardRepoImpl implements ReportCardRepo
{

	@Autowired
	EntityManager eMan;

	@Override
	public List<Users> getReportcard(String rid)
	{
		
		Query qry = eMan.createQuery("select u.fullname, r.marks, t.tname, t.tlevel,r.remarks from Users u inner join Reportcard r on u.userid = r.userid inner join Topic t on t.tid = r.tid where r.rid = ?1");
		// IMP Query qry = eMan.createQuery("select u.fullname, r.marks, t.tname, t.tlevel, r.remarks from Users u inner join Reportcard r on u.userid = r.userid inner join Topic t on t.tid = r.tid where u.userid = ?1");
		qry.setParameter(1, rid);
		return qry.getResultList();
	}

	@Override
	public boolean addReportCard(Reportcard rep)
	{
		eMan.persist(rep);
		return true;
	}

	@Override
	public List<Object[]> getSingleReport(Integer  userid)
	{
	    Query qry = eMan.createQuery(
	        "select u.fullname, t.tname, t.tlevel, r.marks, r.remarks " +
	        "from Users u " +
	        "join Reportcard r on u.userid = r.userid " +
	        "join Topic t on t.tid = r.tid " +
	        "where u.userid = ?1 " +
	        "order by t.tname, t.tlevel"
	    );

	    qry.setParameter(1, userid);

	    return qry.getResultList();
	}
	
	

}
