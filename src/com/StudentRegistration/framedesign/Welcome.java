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

@SuppressWarnings("serial")
class WelcomeWindow extends JFrame
{
	public WelcomeWindow(String title )
	{
		super(title);
		final JButton admin,operator;
		URL url = WelcomeWindow.class.getResource(
                "/imgsrc/download.jpg");
		setLayout(new BorderLayout());
		setContentPane(new JLabel(new ImageIcon(url)));
		Container c=getContentPane();
		c.setLayout(new GridLayout(17,5));
		c.setBackground(Color.white);

		
		
		Font f=new Font("comic sans ms",Font.BOLD,20);
		admin =new JButton("Admin");
		admin.setFont(f);
		admin.addActionListener((e) ->
        							{
        								loginAdmin();
        							}
								);
		
		operator=new JButton("Operator");
		operator.setFont(f);
		operator.addActionListener((e) ->
									{
										loginOperater();
									}
									);	
		
		
		c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));
		c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));
		c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));
		c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));
		c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));
		c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));
		c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));
		c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));
		c.add(new JLabel(""));c.add(admin);c.add(new JLabel(""));c.add(operator);c.add(new JLabel(""));
		c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));
		c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));
		c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));
		c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));
		c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));
		c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));
		c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));
		c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel("Globsyn@copyright"));c.add(new JLabel(""));c.add(new JLabel(""));
		
	
		setSize(700,500);
		setLocation(300, 100);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void loginAdmin()
	{
		new AdminLogin("Adminlogin");
	}
	public void loginOperater()
	{
		new OperatorLogin("Oprator login");
	}

}
public class Welcome
{

	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		WelcomeWindow obj = new WelcomeWindow("Welcome");

	}

}


