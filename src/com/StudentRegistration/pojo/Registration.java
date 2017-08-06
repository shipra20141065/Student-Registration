package com.StudentRegistration.pojo;

import java.io.Serializable;

public class Registration implements Serializable 
{
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String password;
	private String name;
	private String emailid;
	private String mobno;
    private String address;
	private String city;
	private String gender;
	private String dob;
	private String interests;
	private String courseid;
	private String date;
	private String time;
	
	public Registration(String id, String password,String name,String emailid,String mobno, String address,
			String city, String gender, String dob, String interests,String courseid,String date,String time) 
	{
		super();           //parameterized constructor
		this.id = id;
		this.password = password;
		this.name = name;
		this.emailid = emailid;
		this.mobno = mobno;
		this.address = address;
		this.city = city;
		this.gender = gender;
		this.dob = dob;
		this.interests = interests;
		this.courseid=courseid;
		this.date = date;
		this.time = time;
	}
	
	public Registration()
	{
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getMobno() {
		return mobno;
	}

	public void setMobno(String mobno) {
		this.mobno = mobno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getInterests() {
		return interests;
	}

	public void setInterests(String interests) {
		this.interests = interests;
	}
	
	public String getcourseid() {
		return courseid;
	}

	public void setcourseid(String courseid) {
		this.courseid = courseid;
	}
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	
}
