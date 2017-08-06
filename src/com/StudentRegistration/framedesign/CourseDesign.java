package com.StudentRegistration.framedesign;

import com.StudentRegistration.pojo.CoursePojo;
import com.StudentRegistration.fileHandling.CourseFile;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class CourseDesign extends JFrame
{

	private static final long serialVersionUID = 1L;
	private JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	private JTextField courseid,coursename,studentlimit,fees;
	private JTextArea descipition;
	@SuppressWarnings("rawtypes")
	private JComboBox duration,startday,startmonth,startyear;	
	private JButton submit,showallcourses;
	  
	  ArrayList<CoursePojo> courselist;
	  CoursePojo cou;
	  ArrayList<CoursePojo> operatorlist1;
	  @SuppressWarnings({ "unchecked", "rawtypes" })
	public CourseDesign(String title)
	  {
		  super(title);
		  
		  URL url = CourseDesign.class.getResource("/imgsrc/new.jpg");
		  setLayout(new BorderLayout());
		  setContentPane(new JLabel(new ImageIcon(url)));
		  Container c=getContentPane();
		  c.setLayout(new GridLayout(10,3));
				
		  courseid=new JTextField(20);
		  Random r= new Random();
		  int rndmval =r.nextInt(10);
		  String cs="cs10";
		  String cs1=cs+rndmval;
		  ArrayList<CoursePojo> list2;
		  list2=CourseFile.readDataFromFile();
		  int h=0;
		  while(cs1 ==list2.get(h).getCourseid())
		  {
			  rndmval =r.nextInt(10);
			  cs1=cs+String.valueOf(r);
			  h++;
		  }
		
		  courseid.setText(cs1);
		  courseid.setEditable(false);
		  
		  coursename = new JTextField(20);
		  studentlimit=new JTextField(20);
		  fees= new JTextField(20);
		  
		  descipition=new JTextArea(5,20);
		  JScrollPane tapan=new JScrollPane(descipition);
				
		  String ctvalue[]={"4Week","6Week","8Week"};
		  duration=new JComboBox(ctvalue);
		  
		   String dvalue[]=new String[31];
		   for(int i=0;i<=30;i++)
		   {
				dvalue[i]=String.valueOf(i+1);
		   }
		   startday=new JComboBox(dvalue);
				
		   String mvalue[]=new String[12];
		   for(int i=0;i<=11;i++)
		   {
				mvalue[i]=String.valueOf(i+1);
		   }
		   startmonth=new JComboBox(mvalue);
				
		   String yvalue[]=new String[12];
		   int cnt=0;
		   for(int i=2017;i<=2020;i++)
		   {
				yvalue[cnt]=String.valueOf(i);
				cnt++;	
		   }
		   startyear=new JComboBox(yvalue);
		   
		   
		   JPanel cpanel=new JPanel();
		   cpanel.add(startday);
		   cpanel.add(startmonth);
		   cpanel.add(startyear);
			
				
		   submit =new JButton("SUBMIT");
		   submit.setFont(new Font("Serif",Font.BOLD,20));
		   submit.setBackground(Color.darkGray);
		   submit.setForeground(Color.green);
		   submit.addActionListener((e) -> {addCourse();});
		   showallcourses=new JButton("SHOW ALL");
		   showallcourses.addActionListener((e) -> {new DisplayAllCourses();});
		   Font f=new Font("Chiller",Font.BOLD,27);
		   l1=new JLabel("ADD A NEW COURSE");
		   l1.setFont(f);
		   l1.setForeground(Color.DARK_GRAY);
		   
		   Font f1=new Font("Georgia",Font.BOLD,30);
		   l2=new JLabel("Course Id");
		   l2.setFont(f1);
		   l2.setForeground(Color.blue);
		   
		   l3=new JLabel("Course Name");
		   l3.setFont(f1);
		   l3.setForeground(Color.blue);
		   
		   l4=new JLabel("Starting Date");
		   l4.setFont(f1);
		   l4.setForeground(Color.blue);
		   
		   l5=new JLabel("CourseDuration");
		   l5.setFont(f1);
		   l5.setForeground(Color.blue);
		   
		   l6=new JLabel("Fees");
		   l6.setFont(f1);
		   l6.setForeground(Color.blue);
		   
		   l7=new JLabel("Student Limit");
		   l7.setFont(f1);
		   l7.setForeground(Color.blue);
		   
		   l8=new JLabel("Discription");
		   l8.setFont(f1);
		   l8.setForeground(Color.blue);
		   
		   c.add(l1);c.add(new JLabel(""));c.add(new JLabel(""));
		   c.add(l2);c.add(new JLabel(""));c.add(courseid);
		   c.add(l3);c.add(new JLabel(""));c.add(coursename);
		   c.add(l4);c.add(new JLabel(""));c.add(cpanel);
		   c.add(l5);c.add(new JLabel(""));c.add(duration);
		   c.add(l6);c.add(new JLabel(""));c.add(fees);
		   c.add(l7);c.add(new JLabel(""));c.add(studentlimit);
		   c.add(l8);c.add(new JLabel(""));c.add(tapan);
		   c.add(new JLabel(""));c.add(submit);c.add(new JLabel(""));
		   c.add(new JLabel(""));c.add(showallcourses);c.add(new JLabel(""));
		   
		   setSize(800, 600);
		   setLocation(300,100);
		   setResizable(false);
		   setVisible(true);
	  	}
	  public boolean dataValidation()
	  {
		   boolean namevalidation = nameCheck();
		   boolean feevalidation = feeCheck();
		   boolean studentlimitvalidation = limitCheck();
		   
		   if (namevalidation && feevalidation && studentlimitvalidation)
			   return true;
		   
		   return false;
	  }
	  
	  @SuppressWarnings("resource")
	public boolean nameCheck()
	   {
		  boolean namevalid = true;
	      String namepattern = "^[a-zA-Z\\+#@!$%^&*]{1,}$";
	    	
	      Scanner sc1 = new Scanner(coursename.getText().trim());
	    	
	      String match = sc1.findInLine(namepattern);
	    	
	      if (match == null)
	      {
	    	  JOptionPane.showMessageDialog(this, "..OOPS..WRONG INPUT\nPlease enter the COURSENAME in between o-9,A-Z,a-z and should be in betwwen3 to 8 charecter");
	    	  coursename.setText("");
	    	  coursename.setBackground(Color.RED);
	       	  namevalid = false;
	      }
	      return namevalid;
	   }
		
	  @SuppressWarnings("resource")
	public boolean feeCheck()
	   {
		  boolean feevalid = true;
	      String feepattern = "^[0-9.]{2,}$";
	    	
	      Scanner sc1 = new Scanner(fees.getText().trim());
	    	
	      String match = sc1.findInLine(feepattern);
	    	
	      if (match == null)
	      {
	    	  JOptionPane.showMessageDialog(this, "..OOPS..WRONG INPUT\nPlease enter the FEE in between o-9 and minimum of 2digit");
	    	  fees.setText("");
	    	  fees.setBackground(Color.RED);
	       	  feevalid = false;
	      }
	      return feevalid;
	   }
	  @SuppressWarnings("resource")
	public boolean limitCheck()
	   {
		  boolean limitvalid = true;
	      String limitpattern = "^[0-9]{1,3}$";
	    	
	      Scanner sc1 = new Scanner(studentlimit.getText().trim());
	    	
	      String match = sc1.findInLine(limitpattern);
	    	
	      if (match == null)
	      {
	    	  JOptionPane.showMessageDialog(this, "..OOPS..WRONG INPUT\nPlease enter the limit in between o-9 and minimum of 2digit");
	    	  studentlimit.setText("");
	    	  studentlimit.setBackground(Color.RED);
	       	  limitvalid = false;
	      }
	      return limitvalid;
	   }
	  public void createCourseObj()
	  {
		  String id,name,fee,limit,durtn,sdate,desc;
			
		  id=courseid.getText().trim();
		  name = coursename.getText().trim();
		  fee = fees.getText().trim();
		  limit = studentlimit.getText().trim();
		  durtn=(String)duration.getSelectedItem();
		  desc=(String)descipition.getText();
		  String d=(String)startday.getSelectedItem();
		  String m=(String)startmonth.getSelectedItem();
		  String y=(String)startyear.getSelectedItem();
		  sdate=d + "-" + m + "-" + y;
		  
		  cou = new CoursePojo(id, name, limit, fee, desc, sdate, durtn);
	  }
	  public void addCourse()
	  {
		  boolean isdatavalidate = dataValidation(); 
       		if(isdatavalidate)
       		{
       			createCourseObj();
       			int idfoundpos = CourseSearch.searchId(cou);
       			if(idfoundpos >= 0)
       			{
       				JOptionPane.showMessageDialog(this, "ID ALREADY EXIST..PLEASE ENTER ANOTHER ID...");
       			}	  
       			else
       			{
       				int con=JOptionPane.showConfirmDialog(this, "Are You Sure to submit?");
       				if(con==JOptionPane.YES_OPTION)
       				{
       					courselist = CourseFile.readDataFromFile();
       					courselist.add(cou);
       					CourseFile.writeDatatoFile(courselist);
       					JOptionPane.showMessageDialog(this, "course added");
       				}
       				resetFrame();
       			}
       		}
	  }
	  public void resetFrame()
	     {
	    	 this.dispose();
	    	 new CourseDesign("COURSE DESIGN");
	     }
	  
	  public static void main(String[] args) 
	  {
		  new CourseDesign("COURSE DESIGN");
	  }
}



