package com.lti.app.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "topic")
public class Topic
{
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private String tid;
	private String tname;
	private String tlevel;
	public Topic(String tid, String tname, String tlevel) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.tlevel = tlevel;
	}
	public Topic() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTlevel() {
		return tlevel;
	}
	public void setTlevel(String tlevel) {
		this.tlevel = tlevel;
	}
	@Override
	public String toString() {
		return "Topic [tid=" + tid + ", tname=" + tname + ", tlevel=" + tlevel + "]";
	}
	
	

//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "tid",nullable = true)
//	private List<Questions> question;
//
//	public List<Questions> getQuestion()
//	{
//		return question;
//	}
//	public void setQuestion(List<Questions> question)
//	{
//		this.question = question;
//	}
	
	
	
}
