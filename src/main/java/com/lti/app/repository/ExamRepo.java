package com.lti.app.repository;

import java.util.List;

import com.lti.app.entity.Questions;
import com.lti.app.entity.Topic;

public interface ExamRepo
{
	public void addQuestion();
	public List<Questions> getQuestions(String tlevel, String tid);
	public List<Topic> getTopic();
}
