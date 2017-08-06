package com.StudentRegistration.fileHandling;

import com.StudentRegistration.pojo.OperatorPojo;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class OperatorFile 
{
	@SuppressWarnings("unchecked")
	public static ArrayList<OperatorPojo> readDataFromFile()
	{
		ArrayList<OperatorPojo> list4;
		try
		{
		   FileInputStream fin=new FileInputStream("Operator.txt");
		   ObjectInputStream oin=new ObjectInputStream(fin);
		   list4=(ArrayList<OperatorPojo>)oin.readObject();
		   
		   oin.close();
		   fin.close();
		}catch(Exception e)
		 {
			 list4=new ArrayList<OperatorPojo>();
		 }
		 
		return list4;
	}
	
	public static void writeDatatoFile(ArrayList<OperatorPojo> wlist)
	{
		try	
		 {
		       FileOutputStream fout=new FileOutputStream("Operator.txt");
		       ObjectOutputStream oout=new ObjectOutputStream(fout);
		       oout.writeObject(wlist);
		       
		       oout.close();
		}catch(Exception e){System.out.println(e);}
	}
}