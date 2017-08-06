package com.StudentRegistration.pojo;

import java.io.Serializable;

public class OperatorPojo implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private String operatorid;
	private String operatorpassword;
	private String operatorname;
	private String operatoremailid;
	private String operatormobno;
	private String operatoraddress;
	private String operatorgender;
	private String operatordob;
	private String operatorjoindate;
	public OperatorPojo(String operatorid, String operatorpassword, String operatorname, String operatoremailid,
			String operatormobno, String operatoraddress, String operatorgender, String operatordob,
			String operatorjoindate)
	{
		super();
		this.operatorid = operatorid;
		this.operatorpassword = operatorpassword;
		this.operatorname = operatorname;
		this.operatoremailid = operatoremailid;
		this.operatormobno = operatormobno;
		this.operatoraddress = operatoraddress;
		this.operatorgender = operatorgender;
		this.operatordob = operatordob;
		this.operatorjoindate = operatorjoindate;
	}
	
	public OperatorPojo()
	{
		
	}
	public String getOperatorid() 
	{
		return operatorid;
	}
	public void setOperatorid(String operatorid) 
	{
		this.operatorid = operatorid;
	}
	public String getOperatorpassword() 
	{
		return operatorpassword;
	}
	public void setOperatorpassword(String operatorpassword)
	{
		this.operatorpassword = operatorpassword;
	}
	public String getOperatorname()
	{
		return operatorname;
	}
	public void setOperatorname(String operatorname) 
	{
		this.operatorname = operatorname;
	}
	public String getOperatoremailid() {
		return operatoremailid;
	}
	public void setOperatoremailid(String operatoremailid) 
	{
		this.operatoremailid = operatoremailid;
	}
	public String getOperatormobno() 
	{
		return operatormobno;
	}
	public void setOperatormobno(String operatormobno) 
	{
		this.operatormobno = operatormobno;
	}
	public String getOperatoraddress() 
	{
		return operatoraddress;
	}
	public void setOperatoraddress(String operatoraddress)
	{
		this.operatoraddress = operatoraddress;
	}
	public String getOperatorgender()
	{
		return operatorgender;
	}
	public void setOperatorgender(String operatorgender)
	{
		this.operatorgender = operatorgender;
	}
	public String getOperatordob()
	{
		return operatordob;
	}
	public void setOperatordob(String operatordob) 
	{
		this.operatordob = operatordob;
	}
	public String getOperatorjoindate() 
	{
		return operatorjoindate;
	}
	public void setOperatorjoindate(String operatorjoindate)
	{
		this.operatorjoindate = operatorjoindate;
	}
	
	
}
