package com.StudentRegistration.framedesign;

import java.util.ArrayList;
import com.StudentRegistration.fileHandling.UserDataReadWriteFromFile1;
import com.StudentRegistration.pojo.Registration;

public class ViewStOfACourse3
{
	public ViewStOfACourse3(Registration rg,int index)
	{
		ArrayList<Registration> list1;
		
		list1=UserDataReadWriteFromFile1.readDataFromFile();
		
		list1.set(index, rg);
		 
		UserDataReadWriteFromFile1.writeDatatoFile(list1);
	}
}

