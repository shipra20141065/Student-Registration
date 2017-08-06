package com.StudentRegistration.pojo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class EarningPojo implements Serializable
{
	private String courseid;
	private String coursename;
	private String numofstudent;
	private String fees;
	private String earning;
	public EarningPojo(String courseid, String coursename, String numofstudent, String fees, String earning)
	{
		super();
		this.courseid = courseid;
		this.coursename = coursename;
		this.numofstudent = numofstudent;
		this.fees = fees;
		this.earning = earning;
	}
	public EarningPojo(){}
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
	public String getNumofstudent()
	{
		return numofstudent;
	}
	public void setNumofstudent(String numofstudent)
	{
		this.numofstudent = numofstudent;
	}
	public String getFees() 
	{
		return fees;
	}
	public void setFees(String fees)
	{
		this.fees = fees;
	}
	public String getEarning() 
	{
		return earning;
	}
	public void setEarning(String earning)
	{
		this.earning = earning;
	}
	
	
}
