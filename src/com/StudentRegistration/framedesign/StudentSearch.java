package com.StudentRegistration.framedesign;

import java.util.ArrayList;

import com.StudentRegistration.pojo.Registration;
import com.StudentRegistration.fileHandling.UserDataReadWriteFromFile1;

public class StudentSearch 
{
	public static int searchId(String id)
	{
		ArrayList<Registration> list2;
		int f = -1;
		try
		{
			list2=UserDataReadWriteFromFile1.readDataFromFile();
			
			for(int p=0; p<list2.size(); p++)
			{
				if(id.equals(list2.get(p).getId()))
				{
				   f = p;
				   break;
				}	
			}
			 
			return(f);
		}catch(Exception e)
		{
			System.out.println(e);
			return(-2);
		}
 	}
}
