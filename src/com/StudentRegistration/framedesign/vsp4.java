package com.StudentRegistration.framedesign;

import java.util.ArrayList;

import com.StudentRegistration.pojo.CoursePojo;
import com.StudentRegistration.fileHandling.CourseFile;

public class vsp4
{
	public static int searchId(String id)
	{
		ArrayList<CoursePojo> list2;
		int f = -1;
		try
		{
			list2=CourseFile.readDataFromFile();
			
			for(int p=0; p<list2.size(); p++)
			{
				if(id.equals(list2.get(p).getCourseid()))
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

