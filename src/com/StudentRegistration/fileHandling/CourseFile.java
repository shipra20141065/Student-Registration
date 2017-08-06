package com.StudentRegistration.fileHandling;

import com.StudentRegistration.pojo.CoursePojo;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class CourseFile 
{
	@SuppressWarnings("unchecked")
	public static ArrayList<CoursePojo> readDataFromFile()
	{
		ArrayList<CoursePojo> list4;
		try
		{
		   FileInputStream fin=new FileInputStream("Course.txt");
		   ObjectInputStream oin=new ObjectInputStream(fin);
		   list4=(ArrayList<CoursePojo>)oin.readObject();
		   
		   oin.close();
		   fin.close();
		}catch(Exception e)
		 {
			 list4=new ArrayList<CoursePojo>();
		 }
		 
		return list4;
	}
	
	public static void writeDatatoFile(ArrayList<CoursePojo> wlist)
	{
		try	
		 {
		       FileOutputStream fout=new FileOutputStream("Course.txt");
		       ObjectOutputStream oout=new ObjectOutputStream(fout);
		       oout.writeObject(wlist);
		       
		       oout.close();
		}catch(Exception e){System.out.println(e);}
	}
}