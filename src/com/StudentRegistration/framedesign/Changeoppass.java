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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.StudentRegistration.fileHandling.OperatorFile;
import com.StudentRegistration.pojo.OperatorPojo;

@SuppressWarnings("serial")
public class Changeoppass extends JFrame
{
	private JLabel l1,l2,l3;
	private JTextField newpass,newpass1;
	private JButton change;
	
	public Changeoppass(String title,int j) 
	{
		super(title);  
		  
		URL url = Changeoppass.class.getResource(
	                "/imgsrc/globsyn1.jpg");
		setLayout(new BorderLayout());
		setContentPane(new JLabel(new ImageIcon(url)));;
		Container c=getContentPane();
		c.setLayout(new GridLayout(5,3));
		c.setBackground(Color.pink);
		
		
		
		newpass=new JTextField();
		newpass1=new JTextField();
		change=new JButton("CHANGE PASSWORD");
		change.addActionListener((e) ->{
			
			 changepassword(j);});
		  
		Font f=new Font("Chiller",Font.BOLD,30);
		l1=new JLabel("Change Password");
		l1.setFont(f);
		l1.setForeground(Color.DARK_GRAY);
		  
		Font f1=new Font("Georgia",Font.BOLD,15);
		l2=new JLabel("Enter New PASSWORD");
		l2.setFont(f1);
		l2.setForeground(Color.blue);
		 
		l3=new JLabel("Confirm New PASSWORD");
		l3.setFont(f1);
		l3.setForeground(Color.blue);
		
		c.add(l1);c.add(new JLabel(""));c.add(new JLabel(""));
		c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));
		c.add(l2);c.add(new JLabel(""));c.add(newpass);
		c.add(l3);c.add(new JLabel(""));c.add(newpass1);
		c.add(new JLabel(""));c.add(change);c.add(new JLabel(""));
		  
		setSize(650, 200);
		setLocation(300,100);
		setResizable(false);
		setVisible(true);
	}
	int changepassword(int j)
	{
		ArrayList<OperatorPojo>op2=OperatorFile.readDataFromFile();
		if(newpass.getText().equals(newpass1.getText()))
		{
			OperatorPojo opobj = op2.get(j);
			System.out.println(newpass.getText());
			opobj.setOperatorpassword(newpass.getText());
			op2.set(j, opobj);
			OperatorFile.writeDatatoFile(op2);
			JOptionPane.showMessageDialog(this, "PASSWORD CHANGED");
		}
		else
		{
			JOptionPane.showMessageDialog(this, "password does not match");
		}
		return 0;
	}
	

}
