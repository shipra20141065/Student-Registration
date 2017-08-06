package com.StudentRegistration.framedesign;
import com.StudentRegistration.pojo.CoursePojo;
import com.StudentRegistration.fileHandling.CourseFile;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.BorderLayout;
import java.awt.Container;
import java.util.ArrayList;



public class DisplayAllCourses extends JFrame 
{
	private static final long serialVersionUID = 1L;

	public DisplayAllCourses()
	{
		super("Display All");
		String heading[]={"COURSEID","COURSENAME","DURATION","FEES","START_DATE","STUDENT_LIMIT","ABOUT_COURSE"};
		String data[][];
		ArrayList<CoursePojo> list;
		try
		{
			list = CourseFile.readDataFromFile();
			
			data = new String[list.size()][7];
			
			int r=0;
			for(CoursePojo re : list)
			{
				data[r][0]=re.getCourseid();
				data[r][1]=re.getCoursename();
				data[r][2]=re.getDuration();
				data[r][3]=re.getFees();
				data[r][4]=re.getStartingdate();
				data[r][5]=re.getStudentlimit();
				data[r][6]=re.getDisciption();
				r++;
			}
			setLayout(new BorderLayout());
			setContentPane(new JLabel(new ImageIcon("imgsrc\\new.jpg")));
			Container con=getContentPane();
			con.setLayout(new BorderLayout());
			
			JTable datatable=new JTable(data, heading);
			JScrollPane jsp=new JScrollPane(datatable);
			
			con.add(new JLabel("All Available COURSES"),BorderLayout.NORTH);
			con.add(jsp,BorderLayout.CENTER);
			
			setSize(850, 300);
			
			setLocation(200, 200);
			setVisible(true);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}