import java.awt.Color;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import java.awt.event.*;
import net.proteanit.sql.DbUtils;

public class CustomerInfo extends JFrame implements ActionListener
{
	JTable t1;
	JButton b1,b2;
	CustomerInfo()
	{
		t1=new JTable();
		t1.setBounds(0,40,1000,500);
		add(t1);
		
		JLabel l1=new JLabel("ID");
		l1.setBounds(45,10,70,20);
		add(l1);
		
		JLabel l2=new JLabel("Number");
		l2.setBounds(160,10,70,20);
		add(l2);
		
		JLabel l3=new JLabel("Gender");
		l3.setBounds(280,10,70,20);
		add(l3);
		
		JLabel l4=new JLabel("Name");
		l4.setBounds(415,10,70,20);
		add(l4);
		
		JLabel l5=new JLabel("Country");
		l5.setBounds(545,10,70,20);
		add(l5);
		
		JLabel l6=new JLabel("Allocated Room");
		l6.setBounds(640,10,150,20);
		add(l6);
		
		JLabel l7=new JLabel("Status");
		l7.setBounds(780,10,70,20);
		add(l7);
		
		JLabel l8=new JLabel("Deposit");
		l8.setBounds(900,10,70,20);
		add(l8);
		
		
		
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
	new CustomerInfo().setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource()==b1)
		{
			try {
				com c=new com();
				String str="select * from hotel_addcustomer";
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



