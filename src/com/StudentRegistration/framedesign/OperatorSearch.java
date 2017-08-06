package com.StudentRegistration.framedesign;
import com.StudentRegistration.pojo.OperatorPojo;
import com.StudentRegistration.fileHandling.OperatorFile;

import java.util.ArrayList;

public class OperatorSearch 
{
	public static int searchId(OperatorPojo robj)
	{
		ArrayList<OperatorPojo> list2;
		int f = -1;
		try
		{
			list2=OperatorFile.readDataFromFile();
			
			for(int p=0; p<list2.size(); p++)
			{
				if((robj.getOperatorid()).equals(list2.get(p).getOperatorid()))
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