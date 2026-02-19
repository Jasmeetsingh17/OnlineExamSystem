package com.lti.app.service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.app.repository.QuestionsRepo;

@Service
@Transactional
public class QuestionService {
	
	@Autowired
	private QuestionsRepo qRepo;

	public QuestionService(QuestionsRepo qRepo) {
		super();
		this.qRepo = qRepo;
	}
//	
//	@PostConstruct
//	public void loadData() {
//		
//	}
//	
	
	
}
