package com.lti.app.service;

import java.util.List;

import com.lti.app.entity.Reportcard;
import com.lti.app.entity.Users;

public interface ReportCardService
{
	public List<Users> getReportcard(String rid);
	public boolean addReportCard(Reportcard rep);
	public List<Users> getSingleReport(String userid);
}
