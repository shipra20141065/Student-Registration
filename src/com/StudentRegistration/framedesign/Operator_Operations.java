package com.StudentRegistration.framedesign;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
@SuppressWarnings("serial")
public class Operator_Operations extends JFrame
{
	private JLabel l1,l2;
	private JButton as,us,ss,sc,vas,changebatch;
	private final JMenuBar jmenubar;
	private final JMenu jmenu;
	private final JMenuItem jmenuas,jmenuus,jmenuss,jmenusc,jmenuvas,jmenuchangebactch;
	public  Operator_Operations(String title)
	{
		super(title);
		URL url = Operator_Operations.class.getResource(
                "/imgsrc/im2.jpg");
		setLayout(new BorderLayout());
		setContentPane(new JLabel(new ImageIcon(url)));
		Container c=getContentPane();
		c.setLayout(new GridLayout(9,5));
		      
		as =new JButton("Add New Student");
		as.addActionListener((e)->{new StudentRegistrationForm("Student Registration...");});
				
		us =new JButton("Update Student");
		us.addActionListener((e) ->{new UpdateStudentRegistrationForm("update student");});
					
		ss=new JButton("Search Student");
		ss.addActionListener((e) ->{new Search_Student("student search");});
					
		sc=new JButton("Search Course");
		sc.addActionListener((e) ->{new vsp1("Search COURSE..");});	
		
		vas=new JButton("View all student");
		vas.addActionListener((e) ->{new va_student();});
		
		changebatch=new JButton("Change Batch");
		changebatch.addActionListener((e)->{new BatchChange("BATCH CHANGE");});
				
		Font f=new Font("algerian",Font.BOLD,30);
		l1=new JLabel("WELCOME");
		l1.setFont(f);
		l1.setForeground(Color.BLACK);

		l2=new JLabel("OPERATOR");
		l2.setFont(f);
		l2.setForeground(Color.BLACK);
		
		c.add(as);c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));
		c.add(us);c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));
		c.add(ss);c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));
		c.add(sc);c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));
		c.add(vas);c.add(new JLabel(""));c.add(l1);c.add(l2);c.add(new JLabel(""));
		c.add(changebatch);c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));	
		c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));
		c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));
		c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));
		
		
		
		jmenubar = new JMenuBar();
	    jmenu = new JMenu("OPTION");
	    jmenu.setMnemonic(KeyEvent.VK_O);
			                
	    jmenuas = new JMenuItem("Add New Student");
	    jmenuas.setMnemonic(KeyEvent.VK_A);
	    jmenuas.addActionListener((e) ->
	                                              {
	                                            	  new StudentRegistrationForm("Student Registration..");
	                                              }
	                                            );
			     jmenuus = new JMenuItem("Update Student");
			     jmenuus.setMnemonic(KeyEvent.VK_A);
			     jmenuus.addActionListener((e) ->
	                                              {
	                                            	  new UpdateStudentRegistrationForm("update student");
	                                              }
	                                            );
			                
			     jmenuss = new JMenuItem("Search Student");
			     jmenuss.setMnemonic(KeyEvent.VK_A);
			    
			     jmenuss.addActionListener((e) ->
	                                             {
	                                            	new Search_Student("student search");
	                                             }
	                                           );
			     jmenuchangebactch=new JMenuItem("Change Batch");
			     jmenuchangebactch.setMnemonic(KeyEvent.VK_C);
			     jmenuchangebactch.addActionListener((e) ->
                 {
                	new BatchChange("BATCH CHANGE");
                 }
               );
			     
			     
			     
			     jmenusc = new JMenuItem("search course");
			     jmenusc.setMnemonic(KeyEvent.VK_A);
			    
			     jmenusc.addActionListener((e) ->
	                                             {
	                                            	new vsp1(" search");
	                                             }
	                                           );
			     
			     jmenuvas = new JMenuItem("View All Student");
			     jmenuvas.setMnemonic(KeyEvent.VK_R);
			    
			     jmenuvas.addActionListener((e) ->
	                                           {
	                                        	   new va_student();
	                                           }
			    		                      );
			                
			     			     
			     
			     jmenu.add(jmenuas);
			     jmenu.add(jmenuus);
			     jmenu.add(jmenuss);
			     jmenu.add(jmenusc);
			     jmenu.add(jmenuvas);
			     jmenu.add(jmenuchangebactch);
			     
			                
			     jmenubar.add(jmenu);
			     setJMenuBar(jmenubar);
				 
			     setSize(900,500);
				    setLocation(50,100);
				    setResizable(false);
				    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					setVisible(true);	
		   }
		     public static void main(String[] args) 
		     {
			  new Operator_Operations("Operator Operations...");
		     }
				
				

}

