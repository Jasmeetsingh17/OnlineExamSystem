package com.lti.app.service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.app.entity.Topic;
import com.lti.app.repository.TopicRepo;

@Service
@Transactional
public class TopicService {
	
	@Autowired
	private TopicRepo topicrepo;

	public TopicService(TopicRepo topicrepo) {
		this.topicrepo = topicrepo;
	}
	
	@PostConstruct
	public void loadData() {
		Topic topic1 = new Topic();
		topic1.setTid("T001");
		topic1.setTname("Java");
		topic1.setTlevel("0");
		Topic topic2 = new Topic();
		topic2.setTid("T002");
		topic2.setTname("Python");
		topic2.setTlevel("0");
		Topic topic3 = new Topic();
		topic3.setTid("T003");
		topic3.setTname("SQL");
		topic3.setTlevel("0");
		Topic topic4 = new Topic();
		topic4.setTid("T004");
		topic4.setTname("C/C++");
		topic4.setTlevel("0");
		Topic topic5 = new Topic();
		topic5.setTid("T005");
		topic5.setTname("PHP");
		topic5.setTlevel("0");
		Topic topic6 = new Topic();
		topic6.setTid("T006");
		topic6.setTname("C#/.net");
		topic6.setTlevel("0");
		topicrepo.save(topic1);
		topicrepo.save(topic2);
		topicrepo.save(topic3);
		topicrepo.save(topic4);
		topicrepo.save(topic5);
		topicrepo.save(topic6);
	}
}
