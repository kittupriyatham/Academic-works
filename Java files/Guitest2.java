package test3;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Guitest2 implements ActionListener
{
	JFrame f;
	JLabel l1,l2,l3,l4,l5;
	JTextField t1,t2;
	JButton b1,b2;
	JRadioButton r1,r2;
	ButtonGroup bg;
	@SuppressWarnings("rawtypes")
	JComboBox cb;
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Guitest2()
	{
	f=new JFrame("Student Registration");
	l1=new JLabel("ID");
	l2=new JLabel("Name");
	l3=new JLabel("Gender");
	l4=new JLabel("Department");
	l5=new JLabel();
	t1=new JTextField(10);
	t2=new JTextField(20);
	r1=new JRadioButton("Male");
	r2=new JRadioButton("Female");
	bg=new ButtonGroup();
	bg.add(r1);
	bg.add(r2);
	cb=new JComboBox();
	cb.addItem("Select");
	cb.addItem("CSE");
	cb.addItem("ECE");
	cb.addItem("ECSE");
	cb.addItem("EEE");
	b1=new JButton("Submit");
	b2=new JButton("Reset");
	f.setLayout(new FlowLayout());
	f.setVisible(true);
	f.add(l1);
	f.add(t1);
	f.add(l2);
	f.add(t2);
	f.add(l3);
	f.add(r1);
	f.add(r2);
	f.add(l4);
	f.add(cb);
	f.add(b1);
	f.add(b2);
	f.add(l5);
	b1.addActionListener(this);
	b2.addActionListener(this);
	f.pack();
	}
	public static void main(String args[])
	{
	 new Guitest2();
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			boolean filled=true;
			String id=t1.getText();
			
			if(id.trim().equals(""))
			{
				filled=false;
				JOptionPane.showMessageDialog(t1,"Enter your ID");
			}
			
			String name=t2.getText();
		
			if(name.trim().equals(""))
			{
				filled=false;
				JOptionPane.showMessageDialog(t2,"Enter Your Name");
			}
		
			int a=cb.getSelectedIndex();
		
			if(a==0)
			{
				filled=false;
				JOptionPane.showMessageDialog(cb,"Select your department");
			}
			if(filled) 
			{
				JOptionPane.showMessageDialog(l5, "LOGIN SUCCESSFUL", "WELCOME", JOptionPane.INFORMATION_MESSAGE);
				System.out.println(t1.getText());
				System.out.println(t2.getText());
				System.out.println(cb.getSelectedItem().toString());
				if(r1.isSelected())
					System.out.println("Male");
				if(r2.isSelected())
					System.out.println("Female");
			}
		}
		else if(e.getSource()==b2)
		{
			t1.setText("");
			t2.setText("");
			cb.setSelectedIndex(0);
			r1.setSelected(true);
		}
	}
}