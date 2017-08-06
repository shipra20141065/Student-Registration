

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
import com.StudentRegistration.pojo.Registration;


@SuppressWarnings("serial")
public class ViewStOfACourse1 extends JFrame
{
	 
	private JButton search;
	private JLabel l1,l2;
	  private JTextField student;
	  ArrayList<Registration> userlist;
	  
	   Registration r;
	  public ViewStOfACourse1(String title)
	  {
		  super(title);
		  
		  URL url = ViewStOfACourse1.class.getResource(
	                "/imgsrc/new.jpg");
			setLayout(new BorderLayout());
			setContentPane(new JLabel(new ImageIcon(url)));
		  Container c=getContentPane();
		  c.setLayout(new GridLayout(5,3));
		  student=new JTextField();
		  
		  search =new JButton("SEARCH STUDENT");
		  
			search.addActionListener((e) ->
			                             {
			                            	 searchInformation();
			                            	
			                              }
			                            );
			Font f=new Font("ELEPHANT",Font.BOLD,14);
			l1=new JLabel("SEARCH STUDENT");
			l1.setFont(f);
			l1.setForeground(Color.BLUE);
				
			Font f1=new Font("comic sans ms",Font.BOLD,14);
			l2=new JLabel("Enter Course Id");
			l2.setFont(f1);
			l2.setForeground(Color.RED);
		    c.add(l1);c.add(new JLabel(""));
		    c.add(l2);c.add(student);
		    c.add(new JLabel(""));c.add(search);
			
			 setSize(400,300);
			 setLocation(300,300);
			 setResizable(false);
			 setVisible(true);	
	  }
	  
	  public void searchInformation()
	     {
	    	 int idfoundpos = ViewStOfACourse4.searchId(student.getText().trim());

          if(idfoundpos >= 0)
          {
        	  String id =student.getText().trim();
             new ViewStOfACourse2(id);
             
          }
          else
          {	
        	  
             JOptionPane.showMessageDialog(this, "Course Id NOT FOUND.....");
             this.dispose();
             new ViewStOfACourse1("View Stdent of Particular course");
          }
	     }
	  
	 

	  
	  public static void main(String[] args) 
		{
			new ViewStOfACourse1("Search Course...");

		}
}



