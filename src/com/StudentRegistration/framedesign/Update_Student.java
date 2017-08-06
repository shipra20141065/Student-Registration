
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

import com.StudentRegistration.fileHandling.UserDataReadWriteFromFile1;

import com.StudentRegistration.pojo.Registration;;


@SuppressWarnings("serial")
public class Update_Student extends JFrame
{
	 
	private JButton update;
	private JLabel l1,l2;
	  private JTextField student;
	  private JTextField tid;
	  ArrayList<Registration> userlist;
	  
	  Registration r;
	  public Update_Student(String title)
	  {
		  super(title);
		  URL url = Update_Student.class.getResource(
	                "/imgsrc/new.jpg");
			setLayout(new BorderLayout());
			setContentPane(new JLabel(new ImageIcon(url)));
		  Container c=getContentPane();
		  c.setLayout(new GridLayout(5,3));
		  student=new JTextField();
		  
		  update =new JButton("UPDATE STUDENT");
		  
			update.addActionListener((e) ->
			                             {
			                            	 updateInformation();
			                            	
			                              }
			                            );
			Font f=new Font("ELEPHANT",Font.BOLD,14);
			l1=new JLabel("UPDATE STUDENT");
			l1.setFont(f);
			l1.setForeground(Color.BLUE);
				
			Font f1=new Font("comic sans ms",Font.BOLD,14);
			l2=new JLabel("Enter Student Id");
			l2.setFont(f1);
			l2.setForeground(Color.RED);
		    c.add(l1);c.add(new JLabel(""));
		    c.add(l2);c.add(student);
		    c.add(new JLabel(""));c.add(update);
			
			 setSize(400,300);
			 setLocation(300,300);
			 setResizable(false);
			 setVisible(true);	
	  }
	  
	  public void updateInformation()
	     {
	    	 int idfoundpos = StudentSearch.searchId(student.getText().trim());

          if(idfoundpos >= 0)
          {
        	 // OperatorDeletion.updateInfoData(idfoundpos);
             JOptionPane.showMessageDialog(this, "Operator will be updated...");
             new UpdateStudentRegistrationForm("Student RegistrationForm..");
             
          }
          else
          {
             JOptionPane.showMessageDialog(this, "OPERATOR NOT FOUND..PLEASE ENTER ANOTHER OPERATOR...");
          }
	     }
	  
	  public  void updateInfoData() 
	  {
		  int idfoundpos3 = StudentSearch.searchId(tid.getText().trim());
	     	
	     	if(idfoundpos3 >= 0)
	     	{
	     	   JOptionPane.showMessageDialog(this, "ID ALREADY  EXIST..PLEASE ENTER ANOTHER ID...");
	     	}
	     	else
	     	{
	     		   //createRegObj();
	     	       
	     		   int con=JOptionPane.showConfirmDialog(this, "Are You Sure to Update?");
				       if(con==JOptionPane.YES_OPTION)
				       {
					      userlist = UserDataReadWriteFromFile1.readDataFromFile();
					      userlist.add(r);
					      UserDataReadWriteFromFile1.writeDatatoFile(userlist);
					      JOptionPane.showMessageDialog(this, "Update Successful...");
					      new UpdateStudentRegistrationForm("Student RegistrationForm..");
				       }
	     	}
	}
	  
	  public static void main(String[] args) 
		{
			new Update_Student("Delete Operator...");

		}
}


