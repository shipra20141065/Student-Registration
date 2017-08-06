
package com.StudentRegistration.framedesign;
import com.StudentRegistration.pojo.CoursePojo;
import com.StudentRegistration.fileHandling.CourseFile;

import java.awt.BorderLayout;
import java.awt.Container;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
//import com.StudentRegistration.framedesign.Search_Student;
public class vsp2 extends JFrame 
{
	private static final long serialVersionUID = 1L;

	public vsp2(int index)
	{
		super("Search Window");
		String heading[]={"Courseid","CourseName","Studentlimit","fees","discription","startingdate","duration"};
		String data[][] = new String[5][7];;
		ArrayList<CoursePojo> list6;
		try
		{
			list6 = CourseFile.readDataFromFile();
					
			CoursePojo re = list6.get(index);
			
			int r = 0;
			data[r][0]=re.getCourseid();
			//data[r][1]=re.getPassword();
			data[r][1]=re.getCoursename();
			data[r][2]=re.getStudentlimit();
			data[r][3]=re.getFees();
			data[r][4]=re.getDisciption();
			data[r][5]=re.getStartingdate();
			data[r][6]=re.getDuration();
			
			Container con=getContentPane();
			con.setLayout(new BorderLayout());
			
			JTable datatable=new JTable(data, heading);
			JScrollPane jsp=new JScrollPane(datatable);
			
			con.add(new JLabel("Information Details"),BorderLayout.NORTH);
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


