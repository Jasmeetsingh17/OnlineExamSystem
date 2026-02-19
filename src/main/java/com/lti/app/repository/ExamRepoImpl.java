package com.lti.app.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.app.entity.Questions;
import com.lti.app.entity.Topic;

@Repository
public class ExamRepoImpl implements ExamRepo
{
	@Autowired
	EntityManager eMan;
//	
//	@Override
//	public void addQuestion() 
//	{
//		// TODO Auto-generated method stub
//		Questions q1 = new Questions("Q001","What is java?","A","B","C","Programming language", "Programming language", "T001");
//		Questions q2 = new Questions("Q002","What is Python?","X","Y","Z","Interpreted language", "Interpreted language", "T002");
//		
//		List <Questions> quest = new ArrayList<>();
//		Topic t1 = new Topic("T001","Java",1);
//		Topic t2 = new Topic("T002", "Python", 1);

//		quest.add(q1);
//		quest.add(q2);

//		t1.setQuestion(quest);
//		t2.setQuestion(quest);
//
//		eMan.persist(t1);
//		eMan.persist(t2);
//		System.out.println("Values added");
//	}

//	@Override
//	public List<Questions> getQuestions(String tid)
//	{
//		// TODO Auto-generated method stub
////		Query qry = eMan.createQuery("select q from Questions q where q.tid = ?1 and q.tlevel = ?0");
//		Query qry = eMan.createQuery("select q from Questions q where q.tid = ?1");
//		qry.setParameter(1, tid);
//		//qry.setParameter(0, tlevel);
//		
//		return qry.getResultList();
//	}
	
	@Override
	public List<Questions> getQuestions(String tlevel, String tid)
	{
		// TODO Auto-generated method stub
//		Query qry = eMan.createQuery("select q from Questions q where q.tid = ?1 and q.tlevel = ?0");
		Query qry = eMan.createQuery("select q from Questions q where q.tlevel = ?1 and q.tid =?0");
		qry.setParameter(1, tlevel);
		qry.setParameter(0, tid);
		
		return qry.getResultList();
	}
	
	@Override
	public List<Topic> getTopic()
	{
		// TODO Auto-generated method stub
		Query qry = eMan.createQuery("from Topic");
		return qry.getResultList();
	}

	@Override
	public void addQuestion() {
		// TODO Auto-generated method stub
		
	}
	
}
