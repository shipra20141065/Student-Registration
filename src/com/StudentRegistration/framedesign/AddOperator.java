package com.StudentRegistration.framedesign;
import com.StudentRegistration.pojo.OperatorPojo;
import com.StudentRegistration.fileHandling.OperatorFile;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class AddOperator extends JFrame
{
	private static final long serialVersionUID = 1L;
	private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
	  private JTextField operatorname,operatorpass,operatormail,operatormobno,operatorid;	
	  private JButton submit,showalloperator;
	  private JTextArea operartoraddress;
	  @SuppressWarnings("rawtypes")
	private JComboBox dobday,dobmonth,dobyear;
	  private JRadioButton rmale,rfemale;
	  
	  private String JoiningDate;
	  
	  ArrayList<OperatorPojo> operatorlist;
	  ArrayList<OperatorPojo> operatorlist1;
	  OperatorPojo oou;
	  
	  @SuppressWarnings({ "unchecked", "rawtypes" })
	public AddOperator(String title)
	  {
		  super(title);
		  
		  URL url = AddOperator.class.getResource("/imgsrc/new.jpg");
		  
		  setLayout(new BorderLayout());
		  setContentPane(new JLabel(new ImageIcon(url)));
		  Container c=getContentPane();
		  c.setLayout(new GridLayout(12,3));
				
		  operatorid=new JTextField(20);
		  Random r= new Random();
		  int rndmval =r.nextInt(10);
		  String cs="op10";
		  String cs1=cs+rndmval;
		  ArrayList<OperatorPojo> list2;
		  list2=OperatorFile.readDataFromFile();
		  int h=0;
		  while(cs1 ==list2.get(h).getOperatorid())
		  {
			  rndmval =r.nextInt(10);
			  cs1=cs+rndmval;
			  h++;
		  }
		  operatorid.setText(cs1);
		  operatorid.setEditable(false);
		  
		  operatorname = new JTextField(20);
		  operatorpass=new JTextField(20);
		  operatorpass=new JPasswordField(20);
		  Random p= new Random();
		  byte[] nbyte = new byte[30];
		  p.nextBytes(nbyte);
		  operatorpass.setText(""+nbyte);
		  operatorpass.setEditable(false);
		  
		  operatormail= new JTextField(20);
		  operatormobno= new JTextField(20);
		  
		  operartoraddress=new JTextArea(5,20);
		  JScrollPane tapan=new JScrollPane(operartoraddress);
	
		   String dvalue[]=new String[31];
		   for(int i=0;i<=30;i++)
		   {
				dvalue[i]=String.valueOf(i+1);
		   }
		   dobday=new JComboBox(dvalue);
				
		   String mvalue[]=new String[12];
		   for(int i=0;i<=11;i++)
		   {
				mvalue[i]=String.valueOf(i+1);
		   }
		   dobmonth=new JComboBox(mvalue);
				
		   String yvalue[]=new String[40];
		   int cnt=0;
		   for(int i=1961;i<=2000;i++)
		   {
				yvalue[cnt]=String.valueOf(i);
				cnt++;	
		   }
		   dobyear=new JComboBox(yvalue);
		   
		   
		   JPanel cpanel=new JPanel();
		   cpanel.add(dobday);
		   cpanel.add(dobmonth);
		   cpanel.add(dobyear);
		   
		   rmale=new JRadioButton("Male");
		   rfemale=new JRadioButton("Female");
			 
		   ButtonGroup rgroup=new ButtonGroup();
		   rgroup.add(rmale);
		   rgroup.add(rfemale);
			   
		   JPanel gpanel=new JPanel();
		   gpanel.add(rmale);
		   gpanel.add(rfemale);
				
		   submit =new JButton("SUBMIT");
		   submit.setFont(new Font("Serif",Font.BOLD,20));
		   submit.setBackground(Color.darkGray);
		   submit.setForeground(Color.green);
		   submit.addActionListener((e) -> {addOpeartor();});
		   
		   showalloperator=new JButton("SHOW ALL");
		   showalloperator.addActionListener((e) -> {new DisplayAllOperator();});
		   Font f=new Font("Chiller",Font.BOLD,27);
		   l1=new JLabel("ADD A NEW OPERATOR");
		   l1.setFont(f);
		   l1.setForeground(Color.DARK_GRAY);
		   
		   Font f1=new Font("Georgia",Font.BOLD,30);
		   l2=new JLabel("Opeartor Name");
		   l2.setFont(f1);
		   l2.setForeground(Color.blue);
		   
		   l3=new JLabel("OpeartorID");
		   l3.setFont(f1);
		   l3.setForeground(Color.blue);
		   
		   l4=new JLabel("Password");
		   l4.setFont(f1);
		   l4.setForeground(Color.blue);
		   
		   l5=new JLabel("Date Of Birth");
		   l5.setFont(f1);
		   l5.setForeground(Color.blue);
		   
		   
		   l6=new JLabel("Address");
		   l6.setFont(f1);
		   l6.setForeground(Color.blue);
		   
		   l7=new JLabel("E-mail address");
		   l7.setFont(f1);
		   l7.setForeground(Color.blue);
		   
		   l8=new JLabel("Contact No.");
		   l8.setFont(f1);
		   l8.setForeground(Color.blue);
		   
		   LocalDate today = LocalDate.now();
           int day = today.getDayOfMonth();
	       int month = today.getMonthValue();
	  	   int year = today.getYear();	
	       JoiningDate  = day+"/"+month+"/"+year;
		   l9=new JLabel(JoiningDate);
		   l9.setFont(f1);
		   l9.setForeground(Color.blue);
		   
		   
		   l10=new JLabel("Gender");
		   l10.setFont(f1);
		   l10.setForeground(Color.blue);
		   
		   l11=new JLabel("Joining Date");
		   l11.setFont(f1);
		   l11.setForeground(Color.blue);
		   
		   c.add(l1);c.add(new JLabel(""));c.add(new JLabel(""));
		   c.add(l2);c.add(new JLabel(""));c.add(operatorname);
		   c.add(l3);c.add(new JLabel(""));c.add(operatorid);
		   c.add(l4);c.add(new JLabel(""));c.add(operatorpass);
		   c.add(l5);c.add(new JLabel(""));c.add(cpanel);
		   c.add(l10);c.add(new JLabel(""));c.add(gpanel);
		   c.add(l6);c.add(new JLabel(""));c.add(tapan);
		   c.add(l7);c.add(new JLabel(""));c.add(operatormail);
		   c.add(l8);c.add(new JLabel(""));c.add(operatormobno);
		   c.add(l11);c.add(new JLabel(""));c.add(l9);
		   c.add(new JLabel(""));c.add(submit);c.add(new JLabel(""));
		   c.add(new JLabel(""));c.add(showalloperator);c.add(new JLabel(""));
		   
		   setSize(800, 600);
		   setLocation(300,100);
		   setResizable(false);
		   setVisible(true);
	  	}
	  public boolean dataValidation()
	  {
		   boolean namevalidation = nameCheck();
		   boolean mobvalidation = mobCheck();
		   boolean emailvalidation = emilcheck();
		   
		   if (namevalidation && mobvalidation && emailvalidation)
			   return true;
		   
		   return false;
	  }
	  @SuppressWarnings("resource")
	public boolean emilcheck()
	    {
		    boolean emailvalid = true;
	    	String emailpattern = "^(\\w)+@(\\w+\\.)(\\w+\\.)?[A-Za-z]+$";
	    	
	    	Scanner sc2 = new Scanner(operatormail.getText().trim());
	    	
	    	String match1 = sc2.findInLine(emailpattern);
	    	
	    	if (match1 == null)
	    	{
	    	   JOptionPane.showMessageDialog(this, "Invalid EmailId..Please Enter Another Email");
		       operatormail.setText("");
		      // temailid.setBackground(Color.RED);
		       emailvalid = false;
	    	}
	    	
	    	return emailvalid;
	    }
	  @SuppressWarnings("resource")
	public boolean nameCheck()
	   {
		  boolean namevalid = true;
	      String namepattern = "^[a-zA-Z]{1,}$";
	    	
	      Scanner sc1 = new Scanner(operatorname.getText().trim());
	    	
	      String match = sc1.findInLine(namepattern);
	    	
	      if (match == null)
	      {
	    	  JOptionPane.showMessageDialog(this, "..OOPS..WRONG INPUT\nPlease enter the OPERATORNAME in between o-9,A-Z,a-z and should be in betwwen3 to 8 charecter");
	    	  operatorname.setText("");
	    	  operatorname.setBackground(Color.RED);
	       	  namevalid = false;
	      }
	      return namevalid;
	   }
		
	  @SuppressWarnings("resource")
	public boolean mobCheck()
	   {
		  boolean feevalid = true;
	      String feepattern = "^[0-9]{10}$";
	    	
	      Scanner sc1 = new Scanner(operatormobno.getText().trim());
	    	
	      String match = sc1.findInLine(feepattern);
	    	
	      if (match == null)
	      {
	    	  JOptionPane.showMessageDialog(this, "..OOPS..WRONG INPUT\nPlease enter the mob in between o-9 and minimum of 2digit");
	    	  operatormobno.setText("");
	    	  operatormobno.setBackground(Color.RED);
	       	  feevalid = false;
	      }
	      return feevalid;
	   }
	  public void createOperatorObj()
	   {
		    String id,pass,name,emailid,mobno,add,gn,dob;
			
			id=operatorid.getText();
			pass=operatorpass.getText().trim();
			name = operatorname.getText().trim();
			emailid =operatormail.getText().trim();
			mobno = operatormobno.getText().trim();
			add=operartoraddress.getText().trim();
			
			gn="";
			if(rmale.isSelected())
			{
				gn="Male";
			}
			else if(rfemale.isSelected())
			{
				gn="Female";
			}
			
			String d=(String)dobday.getSelectedItem();
			String m=(String)dobmonth.getSelectedItem();
			String y=(String)dobyear.getSelectedItem();
			dob=d + "-" + m + "-" + y;
			
			
			oou=new OperatorPojo(id, pass, name, emailid, mobno, add, gn, dob, JoiningDate);
		 }
	   
	  public void addOpeartor()
	  {
		  boolean isdatavalidate = dataValidation(); 
       		if(isdatavalidate)
       		{
       			createOperatorObj();
       			int idfoundpos = OperatorSearch.searchId(oou);
       			if(idfoundpos >= 0)
       			{
       				JOptionPane.showMessageDialog(this, "ID ALREADY EXIST..PLEASE ENTER ANOTHER ID...");
       			}	  
       			else
       			{
       				int con=JOptionPane.showConfirmDialog(this, "Are You Sure to submit?");
       				if(con==JOptionPane.YES_OPTION)
       				{
       					operatorlist = OperatorFile.readDataFromFile();
       					operatorlist.add(oou);
       					OperatorFile.writeDatatoFile(operatorlist);
       					JOptionPane.showMessageDialog(this, "operator added");
       				}
       			}
       			this.dispose();
   				new AddOperator("Add Operator Form");
       		}
       		
	  }
	  
	  public static void main(String[] args) 
	  {
		  new AddOperator("Add Operator Form");
	  }
}



