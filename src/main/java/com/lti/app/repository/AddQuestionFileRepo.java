package com.lti.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lti.app.entity.Questions;
@Repository
public interface AddQuestionFileRepo extends CrudRepository<Questions,String>{
	
}
