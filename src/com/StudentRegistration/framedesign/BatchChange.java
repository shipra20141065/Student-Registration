package com.StudentRegistration.framedesign;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.net.URL;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import com.StudentRegistration.fileHandling.UserDataReadWriteFromFile1;
import com.StudentRegistration.fileHandling.CourseFile;
import com.StudentRegistration.pojo.CoursePojo;
import com.StudentRegistration.pojo.Registration;

@SuppressWarnings("serial")
public class BatchChange extends JFrame 
{	
	private JLabel l1,l2,l3,l4,l5;
	private JTextField sid;
	@SuppressWarnings("rawtypes")
	private JComboBox newcourseid,oldcourseid;
	
	private JButton change,search;
	
	@SuppressWarnings({ "rawtypes", "unused", "unchecked" })
	public BatchChange(String title)
	{
		super(title);  
		URL url = BatchChange.class.getResource("/imgsrc/globsyn1.jpg");
		setLayout(new BorderLayout());
		setContentPane(new JLabel(new ImageIcon(url)));
		Container c=getContentPane();
		c.setLayout(new GridLayout(8,3));
		c.setBackground(Color.pink);
		
		sid=new JTextField(15);
		
		ArrayList<CoursePojo> list3;
		list3=CourseFile.readDataFromFile();
		
		oldcourseid = new JComboBox();
		newcourseid = new JComboBox();
		for(int q=0; q<list3.size(); q++)
		{	
			String s1 =list3.get(q).getCourseid();
			String s2 =list3.get(q).getCoursename();
			String s3 =s2+"-"+s1;
			oldcourseid.addItem(s1);
			newcourseid.addItem(s1);
		}
	
		
		change = new JButton("Change");
		change.addActionListener(e->{updatecourse();});
		
		search=new JButton("Search");
		search.addActionListener(e->{searchstudent();});
		
		Font f=new Font("ELEPHANT",Font.BOLD,18);
		l1=new JLabel("    CHANGE");
		l1.setFont(f);
		l1.setForeground(Color.red);
		l2=new JLabel("BATCH");
		l2.setFont(f);
		l2.setForeground(Color.red);
		
		Font f1=new Font("comic sans ms",Font.BOLD,18);
		l4=new JLabel("Old Courseid");
		l4.setFont(f1);
		l4.setForeground(Color.DARK_GRAY);
		l5=new JLabel("Student ID");
		l5.setFont(f1);
		l5.setForeground(Color.DARK_GRAY);
		l3=new JLabel("New Courseid");
		l3.setFont(f1);
		l3.setForeground(Color.DARK_GRAY);
		
		c.add(l1);c.add(l2);c.add(new JLabel(""));
		c.add(l5);c.add(new JLabel(""));c.add(sid);
		c.add(new JLabel(""));c.add(search);c.add(new JLabel(""));
		c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));
		c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));
		c.add(l4);c.add(new JLabel(""));c.add(oldcourseid);
		c.add(l3);c.add(new JLabel(""));c.add(newcourseid);
		c.add(new JLabel(""));c.add(change);c.add(new JLabel(""));
		
		setSize(400,250);
		setLocation(200,200);
		setResizable(false); 
		setVisible(true);
	
	}
	
	@SuppressWarnings("unused")
	public void searchstudent()
	{	
		ArrayList<Registration> list2;
		list2=UserDataReadWriteFromFile1.readDataFromFile();
		int idfoundpos = StudentSearch.searchId(sid.getText().trim());
		if (idfoundpos>=0)
		{
			JOptionPane.showMessageDialog(this,"ID FOUND");
		}
		else
		{
			JOptionPane.showMessageDialog(this,"STUDENT ID not found please enter a valid id");
		}
	}
	
	@SuppressWarnings("unused")
	public void updatecourse()
	{	
		String id=sid.getText().trim();
		String oldc=(String)oldcourseid.getSelectedItem();
		
		ArrayList<Registration> list3;
		list3=UserDataReadWriteFromFile1.readDataFromFile();
		int index = StudentSearch.searchId(sid.getText().trim());
		
		int cid = vsp4.searchId((String)newcourseid.getSelectedItem());
		ArrayList<CoursePojo> list4=CourseFile.readDataFromFile();
		String s1= list4.get(cid).getCoursename();
		
		if(oldc.equals(list3.get(index).getcourseid()))
			{
				list3.get(index).setcourseid((String)newcourseid.getSelectedItem());
				list3.get(index).setInterests(s1);
				
				UserDataReadWriteFromFile1.writeDatatoFile(list3);
				JOptionPane.showMessageDialog(this,"updated");
				this.dispose();
				new BatchChange("BATCH CHANGE");
			}
		else
		{
			JOptionPane.showMessageDialog(this,"STUDENT ID and course mismatched");
		}
	}
	
	
	
	public static void main(String args[])
	{
		new BatchChange("Batch Change");
	}
}
