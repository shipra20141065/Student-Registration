package com.StudentRegistration.framedesign;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

@SuppressWarnings("serial")

public class AdminLogin extends JFrame
{

	  private JLabel l1,l2,l3;
	  private JTextField userid;
	  private JPasswordField userpass;
	  private JButton submit;
	  
	  public AdminLogin(String title)
	  {
		  super(title);
		  
		  URL url = AdminLogin.class.getResource("/imgsrc/globsyn1.jpg");
		  setLayout(new BorderLayout());
		  setContentPane(new JLabel(new ImageIcon(url)));
		  Container c=getContentPane();
		  c.setLayout(new GridLayout(5,3));
		  c.setBackground(Color.pink);
				
		  userid=new JTextField();
		  userpass=new JPasswordField();
		  submit =new JButton("Submit");
		  submit.addActionListener((e) ->
			                             {
			                            	addinfo();
			                            	
			                              }
			                            );
				
			
			Font f=new Font("ELEPHANT",Font.BOLD,17);
			l1=new JLabel("ADMIN LOGIN");
			l1.setFont(f);
			l1.setForeground(Color.blue);
				
			Font f1=new Font("comic sans ms",Font.BOLD,18);
			l2=new JLabel("Enter User Id");
			l2.setFont(f1);
			l2.setForeground(Color.DARK_GRAY);
				
			l3=new JLabel("Enter Pasword");
			l3.setFont(f1);
			l3.setForeground(Color.darkGray);
			
			
			c.add(l1);c.add(new JLabel(""));
			c.add(l2);c.add(userid);
			c.add(l3);c.add(userpass);
			c.add(new JLabel(""));c.add(submit);
			
		                
		    
			 setSize(400,250);
			 setLocation(200,200);
			 setResizable(false);
			 
			 setVisible(true);	
	   }
	
	   @SuppressWarnings("deprecation")
	public void addinfo()
	   {
		    String id,pass;
			
			id=userid.getText().trim();
			pass=userpass.getText().trim();  	
			if(id.equals("ADMIN")&&pass.equals("ADMIN"))
			{
				this.dispose();
				new AdminWindow("Admin");
			}
			else
			{
				JOptionPane.showMessageDialog(this, "wrong id or password...");
				resetFrame();
			 }
       }
	      
	   
	    
	   
	     public void resetFrame()
	     {
	    	 this.dispose();
	    	 new AdminLogin("AdminLogin");
	     }
	
      }
