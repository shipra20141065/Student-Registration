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

public class AdminWindow extends JFrame
{
	private static final long serialVersionUID = 1L;

	private JLabel l1;
	private JButton addopbutton,delopbutton,viewallopbutton,addcoursbutton,viewallcoursebutton,delcoursbutton,viewstdntcoursebutton,earnbutton ;
	private final JMenuBar jmenubar;
	private final JMenu coursemenu,studentmenu,operatormenu;
	private final JMenuItem jaddoperator,jdeloperator,jviewalloperator,jaddcourse,jviewallcourse,jdelcourse,jviewstdntincourse;
	public AdminWindow(String title)
	{
		super(title);
		URL url = AdminWindow.class.getResource("/imgsrc/globsyn1.jpg");
		
		setLayout(new BorderLayout());
		setContentPane(new JLabel(new ImageIcon(url)));
		Container c=getContentPane();
		c.setLayout(new GridLayout(9,5));
		      
		addopbutton =new JButton("Add New Operator");
		addopbutton.addActionListener((e) ->{new AddOperator("Add Operator Form");});
				
		delopbutton =new JButton("Delete Operator");
		delopbutton.addActionListener((e) ->{new DeleteOperator("DELETE OPERATOR");});
					
		viewallopbutton=new JButton("View All Operator");
		viewallopbutton.addActionListener((e) ->{new DisplayAllOperator();});
					
		addcoursbutton=new JButton("Add Course");
		addcoursbutton.addActionListener((e) ->{new CourseDesign("ADD COURSE");});
		
		viewallcoursebutton=new JButton("View Courses");
		viewallcoursebutton.addActionListener((e)->{new DisplayAllCourses();});
					
		delcoursbutton=new JButton("Delete Course");
		delcoursbutton.addActionListener((e) ->{ new DeleteCourse("DELETE COURSE");});
		
		viewstdntcoursebutton=new JButton("View students of particular course");
		viewstdntcoursebutton.addActionListener((e) ->{new ViewStOfACourse1("VIEW STUDENT OF A PARTICULAR COURSE");});
		
		earnbutton=new JButton("Business");
		earnbutton.addActionListener((e) ->{new EarningMainWindow("Business Window");});
		
				
		Font f=new Font("Chiller",Font.BOLD,30);
		l1=new JLabel("WELCOME ADMIN");
		l1.setFont(f);
		l1.setForeground(Color.RED);
	
		c.add(addopbutton);c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));
		c.add(viewallopbutton);c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));
		c.add(delopbutton);c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));
		c.add(addcoursbutton);c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));
		c.add(viewallcoursebutton);c.add(new JLabel(""));c.add(l1);c.add(new JLabel(""));c.add(new JLabel(""));
		c.add(delcoursbutton);c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));
		c.add(viewstdntcoursebutton);c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));
		c.add(earnbutton);c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));
		c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));		
		jmenubar = new JMenuBar();
				
			    operatormenu = new JMenu("Operator");
			    operatormenu.setMnemonic(KeyEvent.VK_O);
			    
			    jaddoperator = new JMenuItem("Add New Operator");
			    jaddoperator.setMnemonic(KeyEvent.VK_A);
			    jaddoperator.addActionListener((e) ->
	                                              {
	                                            	  new AddOperator("Add Operator Form");
	                                              }
	                                            );
			    jdeloperator = new JMenuItem("Delete Operator");
			    jdeloperator.setMnemonic(KeyEvent.VK_A);
			    jdeloperator.addActionListener((e) ->
	                                              {
	                                            	  new DeleteOperator("DELETE OPERATOR");   
	                                              }
	                                            );
			                
			     jviewalloperator = new JMenuItem("View All Operator");
			     jviewalloperator.setMnemonic(KeyEvent.VK_A);
			     jviewalloperator.addActionListener((e) ->
	                                             {
	                                            	 new DisplayAllOperator();
	                                             }
	                                           );
			     studentmenu = new JMenu("Student");
			     studentmenu.setMnemonic(KeyEvent.VK_O);
			     
			     jviewstdntincourse = new JMenuItem("View students of particular course");
			     jviewstdntincourse.setMnemonic(KeyEvent.VK_A);
			     jviewstdntincourse.addActionListener((e) ->
	                                             {
	                                            	new ViewStOfACourse1("VIEW STUDENT OF A PARTICULAR COURSE");
	                                             }
	                                           );
			     
			     coursemenu = new JMenu("Course");
			     coursemenu.setMnemonic(KeyEvent.VK_O);
			     
			     jaddcourse = new JMenuItem("Add Course");
			     jaddcourse.setMnemonic(KeyEvent.VK_R);
			     jaddcourse.addActionListener((e) ->
	                                           {
	                                        	 new CourseDesign("ADD COURSE");
	                                           }
			    		                      );
			     
			     jviewallcourse = new JMenuItem("View Courses");
			     jviewallcourse.setMnemonic(KeyEvent.VK_R);
			     jviewallcourse.addActionListener((e) ->
	                                           {
	                                        	 new DisplayAllCourses();
	                                           }
			    		                      );
			     
			     jdelcourse = new JMenuItem("Delete Course");
			     jdelcourse.setMnemonic(KeyEvent.VK_D);
			     jdelcourse.addActionListener((e) ->
	                                            {
	                                            	new DeleteCourse("DELETE COURSE");
	                                            }
			    		 		    		 );
			     
			     
			     operatormenu.add(jaddoperator);
			     operatormenu.add(jdeloperator);
			     operatormenu.add(jviewalloperator);
			     studentmenu.add(jviewstdntincourse);
			     coursemenu.add(jaddcourse);
			     coursemenu.add(jdelcourse);
			     coursemenu.add(jviewallcourse);
			     
			     jmenubar.add(operatormenu);jmenubar.add(studentmenu);jmenubar.add(coursemenu);
			     setJMenuBar(jmenubar);
				 
				setSize(1200,600);
			    setLocation(50,100);
			    setResizable(false);
			    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setVisible(true);	
		   }
	

	public static void main(String[] args)
	{
		new AdminWindow("AdminWindow");
	}
				
				

}
