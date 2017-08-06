
package com.StudentRegistration.framedesign;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.StudentRegistration.framedesign.UpdateStudentRegistrationForm;
//import com.StudentRegistration.framedesign.Search;
import com.StudentRegistration.framedesign.UpdateInfo;
//import com.StudentRegistration.fileHandling..UserDataReadWriteFromFile1;
import com.StudentRegistration.pojo.Registration;

public class UpdateStudentRegistrationForm extends JFrame
{
	  private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16;
	  private JTextField tid,tname,temailid,tmobno,tcourse,tcourseid;
	  private JPasswordField tpass;
	  private JTextArea tadd;
	  private JComboBox city;//day,month,year;     //  dob
	  //private JCheckBox cmo,cmu,cco; //  interest
	  private JRadioButton rmale,rfemale;
	  private JButton update;
	  private JButton  bupdate;
	  private String sysdate,systime;
	  //private final JMenuItem jmenuupdate;
	  //private final JMenu jmenu;
   	  //private final JMenuBar jmenubar;
      
     // private final JMenuItem jmenuregister,jmenushowall,jmenusearch;//jmenuupdate;
		
	  ArrayList<Registration> userlist;
	  
	  Registration r;  //  reference
	
	  public UpdateStudentRegistrationForm (String title)
	  {
		  super(title);
		  URL url = UpdateStudentRegistrationForm.class.getResource(
	                "/imgsrc/new.jpg");
			setLayout(new BorderLayout());
			setContentPane(new JLabel(new ImageIcon(url)));
		  Container c=getContentPane();
		  c.setLayout(new GridLayout(16,2));
		  c.setBackground(Color.pink);
				
		  
		 /* Container c=getContentPane();
		  c.setLayout(new GridLayout(16,2));
		  c.setBackground(Color.pink);*/
				
		  tid=new JTextField(20);
		  tpass=new JPasswordField(20);
		  tname = new JTextField(20);
		  temailid = new JTextField(20);
		  tmobno = new JTextField(20);
		//  tcourse = new JTextField(20);
		//  tcourseid = new JTextField(20);
		  tadd=new JTextArea(5,20);
		  JScrollPane tapan=new JScrollPane(tadd);
				
		  String ctvalue[]={"Kolkata","Delhi","Mumbai","Chennai","Hydrabad","Pune","Bangalore"};
		  city=new JComboBox(ctvalue);
		 				
		  rmale=new JRadioButton("Male");
		  rfemale=new JRadioButton("Female");
		 
		   ButtonGroup rgroup=new ButtonGroup();
		   rgroup.add(rmale);
		   rgroup.add(rfemale);
		   
		   JPanel gpanel=new JPanel();
		   gpanel.add(rmale);
		   gpanel.add(rfemale);
			
		   /*
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
			cpanel.add(year);*/
				
		/*	cmo=new JCheckBox("Movie");
			cmu=new JCheckBox("Music");
			cco=new JCheckBox("Computer");
			
			JPanel ipanel=new JPanel();
			ipanel.add(cmo);
			ipanel.add(cmu);
			ipanel.add(cco);*/
		  
			update = new JButton("UPDATE");
			/*
			update.addActionListener(e->
				
			                           {
			                            	addInformation();
			                            	
			                              }
			                            );
			*/
			bupdate=new JButton("Update");
			bupdate.addActionListener((e) ->
                                       {
                                    	   updateInformation();
                                    	  // resetFrame();
                                       }
			                        );
			
			
			
		
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
			/*
				
			l7=new JLabel("Select DOB");
			l7.setFont(f1);
			l7.setForeground(Color.DARK_GRAY);
				
			l8=new JLabel("Enter Course");
			l8.setFont(f1);
			l8.setForeground(Color.DARK_GRAY);
			
			l9=new JLabel("Enter Course");
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
				
			l16=new JLabel("Current Time");
			l16.setFont(f1);
			l16.setForeground(Color.darkGray);
			*/

			c.add(l1);c.add(new JLabel(""));
			c.add(l2);c.add(tid);
			c.add(l3);c.add(tpass);
			c.add(l13);c.add(tname);
			c.add(l14);c.add(temailid);
			c.add(l15);c.add(tmobno);
		//	c.add(l8);c.add(tcourse);
			//c.add(l10);c.add(tcourseid);
			c.add(l4);c.add(tapan);
			c.add(l5);c.add(city);
		//	c.add(l6);c.add(gpanel);
		//	c.add(l7);c.add(cpanel);
			c.add(bupdate);
			
		/*	jmenubar = new JMenuBar();
            
		    jmenu = new JMenu("OPTION");
		    jmenu.setMnemonic(KeyEvent.VK_O);
   

			 jmenuupdate = new JMenuItem("Update");
		     jmenuupdate.setMnemonic(KeyEvent.VK_U);
		     jmenuupdate.addActionListener((e) ->
                                           {
                                           	updateInformation();
                                           }
		    		 		    		 );
		     jmenu.add(jmenuupdate);
		     */
		     
			 /*setSize(450, 600);
			 setLocation(200,200);*/
			setSize(450, 600);
			 setLocation(200,200);
			 setResizable(false);
			 setVisible(true);	
	   }
	  
	   
	  
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
			ins=null;
			courseid=null;
			dob=null;
		 //  ins = tcourse.getText().trim();
		//   courseid = tcourseid.getText().trim();
			
			gn="";
			if(rmale.isSelected()) // used for radio button
			{
				gn="Male";
			}
			else if(rfemale.isSelected())
			{
				gn="Female";
			}
			/*
			String d=(String)day.getSelectedItem();
			String m=(String)month.getSelectedItem();
			String y=(String)year.getSelectedItem();
			dob=d + "-" + m + "-" + y;
			*/
			
			r=new Registration(id, pass,name,emailid,mobno, add, ct, gn,dob,ins,courseid,sysdate,systime);
		 
	   }
	   
	   
	   
	/*   public void addInformation()
	     {
	       	int idfoundpos = Search.searchId(tid.getText().trim());
       	
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
				      JOptionPane.showMessageDialog(this, "Registration Successful...");
				    
				      resetFrame();
			       }
       	 }
	      }
	   */
	     public void updateInformation()
	     {
	    	 
           int idfoundpos = StudentSearch.searchId(tid.getText().trim());

           if(idfoundpos >= 0)
           {
          	createRegObj();
          	
          	UpdateInfo.UpdateInfodata(r, idfoundpos);
              JOptionPane.showMessageDialog(this, "Information Updated...");
              new Operator_Operations("Operator Operation");
              
           }
           else
           {
              JOptionPane.showMessageDialog(this, "ID NOT FOUND..PLEASE ENTER ANOTHER ID...");
              new UpdateStudentRegistrationForm("Registration...");
           }
	     }
	   /*  
	          public void resetFrame()
	     {
	    	 this.dispose();
        	 new UpdateStudentRegistrationForm("Registration...");
	     }
	     
           */


	     public static void main(String[] args) 
	     {
	    	 
		  new UpdateStudentRegistrationForm("Registration...");
		  
	     }
	     }
	     

