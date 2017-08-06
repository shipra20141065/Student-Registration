package com.StudentRegistration.fileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import com.StudentRegistration.pojo.Registration;

public class UserDataReadWriteFromFile1 
{
	@SuppressWarnings("unchecked")
	public static ArrayList<Registration> readDataFromFile()
	{
		ArrayList<Registration> list4;
		try
		{
		   FileInputStream fin=new FileInputStream("RegistrationInformation.dat");
		   ObjectInputStream oin=new ObjectInputStream(fin);
		   list4=(ArrayList<Registration>)oin.readObject();
		   
		   oin.close();
		   fin.close();
		}catch(Exception e)
		 {
			 list4=new ArrayList<Registration>();
		 }
		 
		return list4;
	}
	
	public static void writeDatatoFile(ArrayList<Registration> wlist)
	{
		try	
		 {
		       FileOutputStream fout=new FileOutputStream("RegistrationInformation.dat");
		       ObjectOutputStream oout=new ObjectOutputStream(fout);
		       oout.writeObject(wlist);
		       
		       oout.close();
		}catch(Exception e){System.out.println(e);}
	}
}

