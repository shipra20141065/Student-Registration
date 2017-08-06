package com.StudentRegistration.framedesign;
import com.StudentRegistration.pojo.CoursePojo;
import com.StudentRegistration.fileHandling.CourseFile;

import java.util.ArrayList;

public class CourseSearch 
{
	public static int searchId(CoursePojo robj)
	{
		ArrayList<CoursePojo> list2;
		int f = -1;
		try
		{
			list2=CourseFile.readDataFromFile();
			
			for(int p=0; p<list2.size(); p++)
			{
				if((robj.getCourseid()).equals(list2.get(p).getCourseid()))
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