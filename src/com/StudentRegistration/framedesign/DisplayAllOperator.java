package com.StudentRegistration.framedesign;

import com.StudentRegistration.pojo.OperatorPojo;
import com.StudentRegistration.fileHandling.OperatorFile;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.BorderLayout;
import java.awt.Container;
import java.util.ArrayList;



public class DisplayAllOperator extends JFrame 
{
	private static final long serialVersionUID = 1L;

	public DisplayAllOperator()
	{
		super("Display All");
		String heading[]={"OPERATORID","OPERATORNAME","PASSWORD","DATE OF BIRTH","GENDER","ADDRESS","EMAIL","CONTACT","JOINING DATE"};
		String data[][];
		ArrayList<OperatorPojo> list;
		try
		{
			list = OperatorFile.readDataFromFile();
			
			data = new String[list.size()][9];
			
			int r=0;
			for(OperatorPojo re : list)
			{
				data[r][0]=re.getOperatorid();
				data[r][1]=re.getOperatorname();
				data[r][2]=re.getOperatorpassword();
				data[r][3]=re.getOperatordob();
				data[r][4]=re.getOperatorgender();
				data[r][5]=re.getOperatoraddress();
				data[r][6]=re.getOperatoremailid();
				data[r][7]=re.getOperatormobno();
				data[r][8]=re.getOperatorjoindate();
				r++;
			}
			
			Container con=getContentPane();
			con.setLayout(new BorderLayout());
			
			JTable datatable=new JTable(data, heading);
			JScrollPane jsp=new JScrollPane(datatable);
			
			con.add(new JLabel("All Registration Details"),BorderLayout.NORTH);
			con.add(jsp,BorderLayout.CENTER);
			
			setSize(850, 300);
			
			setLocation(200, 200);
			setVisible(true);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}