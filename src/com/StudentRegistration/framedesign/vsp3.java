package com.StudentRegistration.framedesign;

import java.util.ArrayList;
import com.StudentRegistration.fileHandling.CourseFile;
import com.StudentRegistration.pojo.CoursePojo;

public class vsp3 
{
	public vsp3(CoursePojo rg,int index)
	{
		ArrayList<CoursePojo> list1;
		
		list1=CourseFile.readDataFromFile();
		
		list1.set(index, rg);
		 
		CourseFile.writeDatatoFile(list1);
	}
}

