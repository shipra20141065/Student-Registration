package com.StudentRegistration.framedesign;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.StudentRegistration.fileHandling.*;
import com.StudentRegistration.pojo.*;

@SuppressWarnings("serial")
public class TotalEarning extends JFrame
{
	ArrayList<EarningPojo>list10=new ArrayList<EarningPojo>();
	ArrayList<CoursePojo>list11=CourseFile.readDataFromFile();
	ArrayList<Registration> list6=UserDataReadWriteFromFile1.readDataFromFile();
	private JLabel l1,l2;
	public TotalEarning() 
	{
		super("View Earning From Particular Course");
		for(int i=0;i<list11.size();i++)
		{	
			int stdno=0;
			EarningPojo e;
			String couid=list11.get(i).getCourseid();
			String couname=list11.get(i).getCoursename();
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
		}
		int totalearn=0;
		for(int d=0;d<list10.size();d++)
		{
			totalearn=totalearn+Integer.parseInt(list10.get(d).getEarning());
		}
		Container con=getContentPane();
		con.setLayout(new GridLayout(4,1));
		con.setBackground(Color.WHITE);
		
		Font f=new Font("Chiller",Font.BOLD,30);
		l1=new JLabel("       TOTAL EARNING");
		l1.setFont(f);
		l1.setForeground(Color.RED);
		
		Font f1=new Font("Georgia",Font.BOLD,30);
		l2=new JLabel("  "+String.valueOf(totalearn));
		l2.setFont(f1);
		l2.setForeground(Color.blue);
		l2.setAlignmentY(CENTER_ALIGNMENT);
		
		con.add(l1);
		con.add(new JLabel(""));
		con.add(l2);
		con.add(new JLabel(""));
		
		setSize(350, 200);
		setLocation(200, 200);
		setVisible(true);
		
	}
	public static void main(String args[])
	{
		new TotalEarning();
	}
	
}
