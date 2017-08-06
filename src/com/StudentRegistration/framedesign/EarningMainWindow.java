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
public class EarningMainWindow extends JFrame
{	
	private JLabel l1,l3;
	private JButton total,paricularcourse;
	
	public EarningMainWindow(String title)
	{
		super(title);  
		URL url = BatchChange.class.getResource("/imgsrc/new.jpg");
		setLayout(new BorderLayout());
		setContentPane(new JLabel(new ImageIcon(url)));
		Container c=getContentPane();
		c.setLayout(new GridLayout(4,5));
		c.setBackground(Color.pink);
		
		Font f=new Font("ELEPHANT",Font.BOLD,28);
		l1=new JLabel("    Check");
		l1.setFont(f);
		l1.setForeground(Color.red);
		l3=new JLabel("Earnings");
		l3.setFont(f);
		l3.setForeground(Color.red);
		
		total=new JButton("TOATAL EARNING");
		total.setToolTipText("view the total earnings from all courses");
		total.add(l1);
		total.addActionListener((e)->{new TotalEarning();});
		
		paricularcourse=new JButton("Particular course EARNING");
		paricularcourse.setToolTipText("view earnings from particular course");
		paricularcourse.addActionListener((e)->{new EarningFromParticularCourse();});
		
		c.add(new JLabel(""));c.add(l1);c.add(l3);c.add(new JLabel(""));c.add(new JLabel(""));
		c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));
		c.add(new JLabel(""));c.add(total);c.add(new JLabel(""));c.add(paricularcourse);c.add(new JLabel(""));
		c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));
		
		setSize(750,350);
		setLocation(200,200);
		setResizable(false); 
		setVisible(true);
	
	}
	public static void main(String[] args)
	{
		new EarningMainWindow("Business Window");// TODO Auto-generated method stub

	}

}
