package com.StudentRegistration.framedesign;
import com.StudentRegistration.pojo.OperatorPojo;

import com.StudentRegistration.fileHandling.OperatorFile;

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

public class DeleteOperator extends JFrame
{
	private static final long serialVersionUID = 1L;
	
	private JLabel l1,l2;
	private JTextField operatorid;
	private JButton delete;
	
	  
	 public DeleteOperator(String title)
	  {
		  super(title);
		  
		  URL url = DeleteOperator.class.getResource(
	                "/imgsrc/globsyn1.jpg");
			setLayout(new BorderLayout());
			setContentPane(new JLabel(new ImageIcon(url)));
		  Container c=getContentPane();
		  c.setLayout(new GridLayout(5,3));
		  c.setBackground(Color.pink);
				
		  operatorid=new JTextField();
		  delete=new JButton("DELETE");
		  delete.addActionListener((e) ->{deleteOpera();});
		  
		  Font f=new Font("Chiller",Font.BOLD,18);
		  l1=new JLabel("DELETE OPERATOR");
		  l1.setFont(f);
		  l1.setForeground(Color.DARK_GRAY);
		  
		  Font f1=new Font("Georgia",Font.BOLD,20);
		  l2=new JLabel("Opeartor ID");
		  l2.setFont(f1);
		  l2.setForeground(Color.blue);
		  
		  c.add(l1);c.add(new JLabel(""));c.add(new JLabel(""));
		  c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));
		  c.add(l2);c.add(new JLabel(""));c.add(operatorid);
		  c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));
		  c.add(new JLabel(""));c.add(delete);c.add(new JLabel(""));
		  
		  setSize(400, 200);
		  setLocation(300,100);
		  setResizable(false);
		  setVisible(true);
		  
	  }
	 public void deleteOpera()
	 {
		 int idfoundpos =searchId();

         if(idfoundpos >= 0)
         {
        	ArrayList<OperatorPojo> list1;
    		list1=OperatorFile.readDataFromFile();
    		list1.remove(idfoundpos);
    		OperatorFile.writeDatatoFile(list1);	
            JOptionPane.showMessageDialog(this, "Operator Deleted...");
            this.dispose();
            new DeleteOperator("DELETE OPERATOR");
         }
         else
         {
            JOptionPane.showMessageDialog(this, "ID NOT FOUND..PLEASE ENTER ANOTHER ID...");
         }
	 }
	 public int searchId()
     {
		 String id=operatorid.getText().trim();
		 ArrayList<OperatorPojo> list2;
			int f = -1;
			try
			{
				list2=OperatorFile.readDataFromFile();
				
				for(int p=0; p<list2.size(); p++)
				{
					if(id.equals(list2.get(p).getOperatorid()))
					{
					   f = p;
					   break;
					}	
				}
				 
				return(f);
			}catch(Exception e)
			{
				System.out.println(e);
				return(-2);
			} 
     }
}