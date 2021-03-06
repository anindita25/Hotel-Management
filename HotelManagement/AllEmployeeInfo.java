import javax.swing.*;


import net.proteanit.sql.DbUtils;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class AllEmployeeInfo extends JFrame implements ActionListener
{
	JTable t1;
	JButton b1,b2;
	AllEmployeeInfo()
	{
		t1=new JTable();
		t1.setBounds(0,40,1000,500);
		add(t1);
		
		JLabel l1=new JLabel("Name");
		l1.setBounds(10,10,70,20);
		add(l1);
		
		JLabel l2=new JLabel("Age");
		l2.setBounds(150,10,70,20);
		add(l2);
		
		JLabel l3=new JLabel("Gender");
		l3.setBounds(250,10,70,20);
		add(l3);
		
		JLabel l4=new JLabel("Department");
		l4.setBounds(350,10,70,20);
		add(l4);
		
		JLabel l5=new JLabel("Salary");
		l5.setBounds(470,10,70,20);
		add(l5);
		
		JLabel l6=new JLabel("Phone");
		l6.setBounds(570,10,70,20);
		add(l6);
		
		JLabel l7=new JLabel("Adhar");
		l7.setBounds(690,10,70,20);
		add(l7);
		
		JLabel l8=new JLabel("Email");
		l8.setBounds(810,10,70,20);
		add(l8);
		
		JLabel l9=new JLabel("Address");
		l9.setBounds(910,10,70,20);
		add(l9);
		
		b1=new JButton("Load Data");
		b1.setBounds(350, 560, 120, 30);
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		b1.addActionListener(this);
		add(b1);
		
		b2=new JButton("Back");
		b2.setBounds(530, 560, 120, 30);
		b2.setBackground(Color.black);
		b2.setForeground(Color.white);
		b2.addActionListener(this);
		add(b2);
		
		
		getContentPane().setBackground(Color.lightGray);
		
		setLayout(null);
		setBounds(220,60,1000,650);
		setVisible(true);
		
	}
	public static void main(String[] args) {
	new AllEmployeeInfo().setVisible(true);;
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource()==b1)
		{
			try {
				com c=new com();
				String str="select * from employee";
				ResultSet r=c.s.executeQuery(str);
				t1.setModel(DbUtils.resultSetToTableModel(r));//in order to get the tables from the database
			}
			catch(Exception e)
			{
				
			}
			
		}else if(ae.getSource()==b2) {
			this.setVisible(false);
		}
	}

}
