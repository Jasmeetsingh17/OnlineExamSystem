package com.lti.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "csvfiles")
public class Files
{
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	String filename;

	public String getFilename()
	{
		return filename;
	}

	public void setFilename(String filename)
	{
		this.filename = filename;
	}
}
