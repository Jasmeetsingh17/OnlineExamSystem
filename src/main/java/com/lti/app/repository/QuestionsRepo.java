package com.lti.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lti.app.entity.Questions;

public interface QuestionsRepo extends JpaRepository<Questions, String>{

}
