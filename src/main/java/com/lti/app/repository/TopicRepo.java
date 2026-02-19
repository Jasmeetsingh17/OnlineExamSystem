package com.lti.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.app.entity.Topic;

@Repository
public interface TopicRepo extends JpaRepository<Topic, String>{
	
}
