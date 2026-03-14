package com.lti.app.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.lti.app.entity.Questions;
import com.lti.app.repository.AddQuestionFileRepo;

@Service
public class AddQuestionFileService {

	@Autowired
	private AddQuestionFileRepo ques;
	
	String line="";
	public void saveQuestions(MultipartFile file) {

	    try {
	        BufferedReader br = new BufferedReader(
	                new InputStreamReader(file.getInputStream()));

	        String line;

	        while ((line = br.readLine()) != null) {

	            String[] data = line.split(",");

	            Questions q = new Questions();

	            q.setQid(data[0]);
	            q.setQname(data[1]);
	            q.setOption1(data[2]);
	            q.setOption2(data[3]);
	            q.setOption3(data[4]);
	            q.setOption4(data[5]);
	            q.setCorrect_Ans(data[6]);
	            q.setTid(data[7]);
	            q.setTlevel(data[8]);

	            ques.save(q);
	        }

	        br.close();

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
}
