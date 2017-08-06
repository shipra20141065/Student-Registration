
package com.StudentRegistration.framedesign;
import com.StudentRegistration.pojo.Registration;
import com.StudentRegistration.fileHandling.UserDataReadWriteFromFile1;

import java.awt.BorderLayout;
import java.awt.Container;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
//import com.StudentRegistration.framedesign.Search_Student;
public class ViewStOfACourse2 extends JFrame 
{
	private static final long serialVersionUID = 1L;

	public ViewStOfACourse2 (String index)
	{
		super("Search Window");
		String heading[]={"ID","Password","Name","EmailId","MobNo","Address","City","Gender","DOB","Course","courseid","Reg Date","Reg Time"};
		ArrayList<Registration> list6;
		list6 = UserDataReadWriteFromFile1.readDataFromFile();
		ArrayList<Registration> list7=new ArrayList<Registration>() ;
		
		int p=0;
		for(int j=0;j<list6.size();j++)
		{	
			Registration rp;
			if(index.equals(list6.get(j).getcourseid()))
			{
				rp = list6.get(j);
				list7.add(p,rp);
				p++;
			}	
		}
			
		try
		{	
			String data[][] = new String[list7.size()][13];
			int r=0;
			for(int i=0;i<list7.size();i++)
			//{	if(index.equals(list7.get(i).getcourseid()))
				{
				
				Registration re=list7.get(i);
				
				data[r][0]=re.getId();
				data[r][1]=re.getPassword();
				data[r][2]=re.getName();
				data[r][3]=re.getEmailid();
				data[r][4]=re.getMobno();
				data[r][5]=re.getAddress();
				data[r][6]=re.getCity();
				data[r][7]=re.getGender();
				data[r][8]=re.getDob();
				data[r][9]=re.getInterests();
				data[r][10]=re.getcourseid();
				data[r][11]=re.getDate();
				data[r][12]=re.getTime();
			
				r++;
			}
			Container con=getContentPane();
			con.setLayout(new BorderLayout());
			
			JTable datatable=new JTable(data, heading);
			JScrollPane jsp=new JScrollPane(datatable);
			
			con.add(new JLabel("Information Details"),BorderLayout.NORTH);
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



