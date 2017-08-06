package com.StudentRegistration.framedesign;

import java.awt.BorderLayout;
import java.awt.Container;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import com.StudentRegistration.fileHandling.*;
import com.StudentRegistration.pojo.*;

@SuppressWarnings("serial")
public class EarningFromParticularCourse extends JFrame
{
	ArrayList<EarningPojo>list10=new ArrayList<EarningPojo>();
	ArrayList<CoursePojo>list11=CourseFile.readDataFromFile();
	ArrayList<Registration> list6=UserDataReadWriteFromFile1.readDataFromFile();
	
	public EarningFromParticularCourse() 
	{
		super("View Earning From Particular Course");
		String headings[]={"COURSE ID","COURSE NAME","No. of STUDENT","FEES","EARNING"};
		String data[][];
		for(int i=0;i<list11.size();i++)
		{	
			int stdno=0;
			EarningPojo e;
			String couid=list11.get(i).getCourseid();
			String couname=list11.get(i).getCoursename();
			try{
			for(int j=0;j<list6.size();j++)
			{	
			
				if(couid.equals(list6.get(j).getcourseid()))
				{
					stdno++;
				}
				
				
			}
			String fees =list11.get(i).getFees();
			double ear=Double.parseDouble(fees);
			int earn = (int) (ear*stdno);
			String studentno=String.valueOf(stdno);
			String earning =String.valueOf(earn);
			
			e=new EarningPojo(couid, couname, studentno, fees, earning);
			
			list10.add(e);
			
		
		data =new String[list10.size()][5];
		int r=0;
		for(EarningPojo en:list10)
		{
			data[r][0]=en.getCourseid();
			data[r][1]=en.getCoursename();
			data[r][2]=en.getNumofstudent();
			data[r][3]=en.getFees();
			data[r][4]=en.getEarning();
			r++;
		}
		setLayout(new BorderLayout());
		setContentPane(new JLabel(new ImageIcon("imgsrc\\new.jpg")));
		Container con=getContentPane();
		con.setLayout(new BorderLayout());
		
		JTable datatable=new JTable(data, headings);
		JScrollPane jsp=new JScrollPane(datatable);
		
		con.add(new JLabel("Earning from the particular courses"),BorderLayout.NORTH);
		con.add(jsp,BorderLayout.CENTER);
		
		setSize(850, 300);
		
		setLocation(200, 200);
		setVisible(true);
			}	catch(Exception l){l.printStackTrace();}}
		
	}
	public static void main(String args[])
	{
		new EarningFromParticularCourse();
	}
	
}
