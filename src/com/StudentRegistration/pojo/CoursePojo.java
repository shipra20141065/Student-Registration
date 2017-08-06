package com.StudentRegistration.pojo;

import java.io.Serializable;

public class CoursePojo implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private String courseid;
	private String coursename;
	private String studentlimit;
	private String fees;
	private String disciption;
	private String startingdate;
	private String duration;
	public CoursePojo(String courseid, String coursename, String studentlimit, String fees, String disciption,
			String startingdate, String duration) 
	{
		super();
		this.courseid = courseid;
		this.coursename = coursename;
		this.studentlimit = studentlimit;
		this.fees = fees;
		this.disciption = disciption;
		this.startingdate = startingdate;
		this.duration = duration;
	}
	
	public CoursePojo(){}
	public String getCourseid()
	{
		return courseid;
	}
	public void setCourseid(String courseid) 
	{
		this.courseid = courseid;
	}
	public String getCoursename() 
	{
		return coursename;
	}
	public void setCoursename(String coursename) 
	{
		this.coursename = coursename;
	}
	public String getStudentlimit()
	{
		return studentlimit;
	}
	public void setStudentlimit(String studentlimit) 
	{
		this.studentlimit = studentlimit;
	}
	public String getFees() 
	{
		return fees;
	}
	public void setFees(String fees)
	{
		this.fees = fees;
	}
	public String getDisciption() 
	{
		return disciption;
	}
	public void setDisciption(String disciption) 
	{
		this.disciption = disciption;
	}
	public String getStartingdate() 
	{
		return startingdate;
	}
	public void setStartingdate(String startingdate) 
	{
		this.startingdate = startingdate;
	}
	public String getDuration() 
	{
		return duration;
	}
	public void setDuration(String duration) 
	{
		this.duration = duration;
	}
	



}
