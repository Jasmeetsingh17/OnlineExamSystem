package com.lti.app.service;

import java.util.List;

import com.lti.app.entity.Questions;
import com.lti.app.entity.Topic;

public interface ExamService
{
	public List<Questions> getQuestions(String tlevel, String tid);
	public List<Topic> getTopic();
}
