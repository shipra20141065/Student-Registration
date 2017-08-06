package com.StudentRegistration.framedesign;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import com.StudentRegistration.fileHandling.CourseFile;
import com.StudentRegistration.fileHandling.UserDataReadWriteFromFile1;
import com.StudentRegistration.pojo.CoursePojo;
import com.StudentRegistration.pojo.Registration;

@SuppressWarnings("serial")
public class StudentRegistrationForm extends JFrame
{
	  @SuppressWarnings("unused")
	private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l11,l10,l12,l13,l14,l15;
	  private JTextField tid,tname,temailid,tmobno,tcourse;
	  private JPasswordField tpass;
	  private JTextArea tadd;
	  @SuppressWarnings("rawtypes")
	private JComboBox city,day,month,year,tcourseid;
	  private JRadioButton rmale,rfemale;
	  private JButton submit;
	  private String sysdate,systime;
	  
	  ArrayList<Registration> userlist;
	  Registration r;
	  
	  @SuppressWarnings({ "unused", "rawtypes", "unchecked" })
	public StudentRegistrationForm (String title)
	  {
		  super(title);
		  
		  URL url = StudentRegistrationForm.class.getResource(
	                "/imgsrc/new.jpg");
			setLayout(new BorderLayout());
			setContentPane(new JLabel(new ImageIcon(url)));
		  Container c=getContentPane();
		  c.setLayout(new GridLayout(16,3));
		  c.setBackground(Color.pink);
				
		  tid=new JTextField(20);
		  Random r= new Random();
		  int rndmval =r.nextInt(9000);
		  String cs="st";
		  String cs1=cs+rndmval;
		  ArrayList<Registration> list2;
		  list2=UserDataReadWriteFromFile1.readDataFromFile();
		  int h=0;
		  while(cs1 ==list2.get(h).getId())
		  {
			  rndmval =r.nextInt(9000);
			  cs1=cs+rndmval;
			  h++;
		  }
		  tid.setText(cs1);
		  tid.setEditable(false);
		  
		  tpass=new JPasswordField(20);
		  Random p= new Random();
		  byte[] rndmpval = new byte[30];
		  String csp="pa";
		  String cs1p=csp+rndmpval;
		  ArrayList<Registration> list4;
		  list4=UserDataReadWriteFromFile1.readDataFromFile();
		  int s=0;
		  while(cs1p ==list4.get(s).getId())
		  {
			  rndmpval =new byte[30];
			  cs1p=csp+rndmpval;
			  s++;
		  }
		  tpass.setText(cs1p);
		  tpass.setEditable(false);
		  
		  tname = new JTextField(20);
		  temailid = new JTextField(20);
		  tmobno = new JTextField(20);
		  tcourse = new JTextField(20);
		  
		  
		  ArrayList<CoursePojo> list3;
		  list3=CourseFile.readDataFromFile();
		  tcourseid = new JComboBox();
		  for(int q=0; q<list3.size(); q++)
		  {
		    tcourseid.addItem(list3.get(q).getCourseid());
		  }
		  tadd=new JTextArea(5,20);
		  JScrollPane tapan=new JScrollPane(tadd);
		  
		  String ctvalue[] = {"KOLKATA","DELHI","MUMBAI","PUNE"}; 
		  city=new JComboBox(ctvalue);
		 				
		  rmale=new JRadioButton("Male");
		  rfemale=new JRadioButton("Female");
		 
		  ButtonGroup rgroup=new ButtonGroup();
		  rgroup.add(rmale);
		  rgroup.add(rfemale);
		   
		  JPanel gpanel=new JPanel();
		  gpanel.add(rmale);
		  gpanel.add(rfemale);
				
		  String dvalue[]=new String[31];
		  for(int i=0;i<=30;i++)
		  {
			dvalue[i]=String.valueOf(i+1);
		  }
		  day=new JComboBox(dvalue);
		
		  String mvalue[]=new String[12];
		  for(int i=0;i<=11;i++)
		  {
			mvalue[i]=String.valueOf(i+1);
		  }
		  month=new JComboBox(mvalue);
			
		  String yvalue[]=new String[40];
		  int cnt=0;
		  for(int i=1980;i<=2017;i++)
		  {
			yvalue[cnt]=String.valueOf(i);
			cnt++;	
		  }
		  year=new JComboBox(yvalue);
			
		  JPanel cpanel=new JPanel();
		  cpanel.add(day);
		  cpanel.add(month);
		  cpanel.add(year);

		  submit = new JButton("SUBMIT");
		  submit.addActionListener(e->{addInformation();});
				
		Font f=new Font("ELEPHANT",Font.BOLD,12);
		l1=new JLabel("STUDENT REGISTRATION");
		l1.setFont(f);
		l1.setForeground(Color.BLUE);
			
		Font f1=new Font("comic sans ms",Font.BOLD,14);
		l2=new JLabel("Enter Student Id");
		l2.setFont(f1);
		l2.setForeground(Color.DARK_GRAY);
			
		l3=new JLabel("Enter Student Password");
		l3.setFont(f1);
		l3.setForeground(Color.DARK_GRAY);
		
		l13=new JLabel("Enter Student Name");
		l13.setFont(f1);
		l13.setForeground(Color.DARK_GRAY);
		
		l14=new JLabel("Enter EmailId");
		l14.setFont(f1);
		l14.setForeground(Color.DARK_GRAY);
		
		l15=new JLabel("Enter Mob No");
		l15.setFont(f1);
		l15.setForeground(Color.DARK_GRAY);
		
		l4=new JLabel("Enter Address");
		l4.setFont(f1);
		l4.setForeground(Color.DARK_GRAY);
		
		l5=new JLabel("Select City");
		l5.setFont(f1);
		l5.setForeground(Color.DARK_GRAY);
			
		l6=new JLabel("Select Gender");
		l6.setFont(f1);
		l6.setForeground(Color.DARK_GRAY);
			
		l7=new JLabel("Select DOB");
		l7.setFont(f1);
		l7.setForeground(Color.DARK_GRAY);
			
		l8=new JLabel("Enter Course");
		l8.setFont(f1);
		l8.setForeground(Color.DARK_GRAY);
			
		l9=new JLabel("Enter Courseid");
		l9.setFont(f1);
		l9.setForeground(Color.DARK_GRAY);
			
		l10=new JLabel("Current Date");
		l10.setFont(f1);
		l10.setForeground(Color.DARK_GRAY);
		
			//Java 8 new class
		LocalDate today = LocalDate.now();
		int day = today.getDayOfMonth();
		int month = today.getMonthValue();
  		int year = today.getYear();
				
		sysdate = day+"/"+month+"/"+year;
		l11=new JLabel(sysdate);		
						//Java 8 new class
		LocalTime time = LocalTime.now();
		int hr = time.getHour();
	 	int min = time.getMinute();
	 	int sec = time.getSecond();
		
	 	systime = hr+":"+min+":"+sec;
		l12=new JLabel(systime);			
		l12=new JLabel("Current Time");
		l12.setFont(f1);
		l12.setForeground(Color.darkGray);
		
		c.add(l1);c.add(new JLabel(""));c.add(new JLabel(""));
		c.add(l2);c.add(new JLabel(""));c.add(tid);
		c.add(l3);c.add(new JLabel(""));c.add(tpass);
		c.add(l13);c.add(new JLabel(""));c.add(tname);
		c.add(l14);c.add(new JLabel(""));c.add(temailid);
		c.add(l15);c.add(new JLabel(""));c.add(tmobno);
		c.add(l8);c.add(new JLabel(""));c.add(tcourse);
		c.add(l9);c.add(new JLabel(""));c.add(tcourseid);
		c.add(l4);c.add(new JLabel(""));c.add(tapan);
		c.add(l5);c.add(new JLabel(""));c.add(city);
		c.add(l6);c.add(new JLabel(""));c.add(gpanel);
		c.add(l7);c.add(new JLabel(""));c.add(cpanel);
		c.add(new JLabel(""));c.add(submit);c.add(new JLabel(""));
  
		     
			 setSize(650, 600);
			 setLocation(200,200);
			 setResizable(false);
			 setVisible(true);	
	   }
	  
	   
	  
	   @SuppressWarnings("deprecation")
	public void createRegObj()
	   {
		   
		    String id,pass,name,emailid,mobno,add,ct,gn,dob,ins,courseid;
			
			id=tid.getText().trim();// trim remove space
			pass=tpass.getText().trim();
			name = tname.getText().trim();
			emailid = temailid.getText().trim();
			mobno = tmobno.getText().trim();
			add=tadd.getText().trim();
			ct=(String)city.getSelectedItem();
		   ins = tcourse.getText().trim();
		   courseid = (String)tcourseid.getSelectedItem();
			
			gn="";
			if(rmale.isSelected()) // used for radio button
			{
				gn="Male";
			}
			else if(rfemale.isSelected())
			{
				gn="Female";
			}
			
			String d=(String)day.getSelectedItem();
			String m=(String)month.getSelectedItem();
			String y=(String)year.getSelectedItem();
			dob=d + "-" + m + "-" + y;
			
			
			r=new Registration(id, pass,name,emailid,mobno, add, ct, gn, dob,ins,courseid,sysdate,systime);
		 
	   }
	   public boolean dataValidation()
	   {
		   boolean namevalidation = nameCheck();
		   boolean emailvalidation = emilcheck();
		   boolean mobnovalidation = mobnocheck();
		   
		   if (namevalidation && emailvalidation & mobnovalidation)
			   return true;
		   
		   return false;
	   }
	   
	   @SuppressWarnings("resource")
	public boolean nameCheck()
	   {
		  boolean namevalid = true;
	      String namepattern = "^[a-zA-Z]{3,8}$";
	    	
	      Scanner sc1 = new Scanner(tname.getText().trim());
	    	
	      String match = sc1.findInLine(namepattern);
	    	
	      if (match == null)
	      {
	    	  JOptionPane.showMessageDialog(this, "Invalid Name..Please use\"A-z,\"a-z");
	    	  tname.setText("");
	    	  tname.setBackground(Color.gray);
	       	  namevalid = false;
	      }
	      return namevalid;
	   }
	   
	   @SuppressWarnings("resource")
	public boolean emilcheck()
	    {
		    boolean emailvalid = true;
	    	String emailpattern = "^(\\w)+@(\\w+\\.)(\\w+\\.)?[A-Za-z]+$";
	    	
	    	Scanner sc2 = new Scanner(temailid.getText().trim());
	    	
	    	String match1 = sc2.findInLine(emailpattern);
	    	
	    	if (match1 == null)
	    	{
	    	   JOptionPane.showMessageDialog(this, "Invalid EmailId..Please Enter Another Email");
		       temailid.setText("");
		       temailid.setBackground(Color.gray);
		       emailvalid = false;
	    	}
	    	
	    	return emailvalid;
	    }
	
	   @SuppressWarnings("resource")
	public boolean mobnocheck()
	   {
		   boolean mobilenovalid = true;
		   
		   String mobnopattern = "^[0-9]{10}$";
	    	
	       Scanner sc3 = new Scanner(tmobno.getText().trim());
	    	
	       String match2 = sc3.findInLine(mobnopattern);
	    	
	    	if (match2 == null)
	    	{
	    		 JOptionPane.showMessageDialog(this, "Invalid Mobno..Please Enter Another MobNo");
			     tmobno.setText("");
			     tmobno.setBackground(Color.gray);
			     mobilenovalid = false;
	    	}
		   	return mobilenovalid;
	    }
	   
	   
	   
	     public void addInformation()
	     {
	    	 boolean isdatavalidate = dataValidation(); 
	         if(isdatavalidate)
	         {
	        	 int idfoundpos = StudentSearch.searchId(tid.getText().trim());
	        	 if(idfoundpos >= 0)
	        	 {
	        		 JOptionPane.showMessageDialog(this, "ID ALREADY EXIST..PLEASE ENTER ANOTHER ID...");
	        	 }
	        	 else
	        	 {
	        		 createRegObj();
	        		 int con=JOptionPane.showConfirmDialog(this, "Are You Sure to Register?");
	        		 if(con==JOptionPane.YES_OPTION)
	        		 {
	        			 userlist = UserDataReadWriteFromFile1.readDataFromFile();
	        			 userlist.add(r);
	        			 UserDataReadWriteFromFile1.writeDatatoFile(userlist);
	        			 JOptionPane.showMessageDialog(this, "Registration Successful");
	        			 this.dispose();
	        			 new StudentRegistrationForm("Registration Form");
	        		 }
	        	 }// resetFrame();
  			       
	         }
	     }
	   



	     public static void main(String[] args) 
	     {
	    	 
		  new StudentRegistrationForm("Registration Form");
		  
	     }
}
	     

