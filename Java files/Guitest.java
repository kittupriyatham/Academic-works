package test3;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Guitest implements ActionListener
{	
	String[] u = {"kittu","krishna","priyatham","potluri","kittupriyatham"};
	String[] p = {"123","456","789","7382504999@521301","7382504999@Kittu"};
	JTextField t1;
	JTextField t2;
	JLabel l1,l2,l3;
	JButton b1,b2;
	public Guitest()
	{
		JFrame f = new JFrame("test");
		f.setLayout(new FlowLayout());
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		t1 = new JTextField(20);
		t2 = new JTextField(20);
		l1 = new JLabel("Username");
		l2 = new JLabel("Password");
		l3 = new JLabel();
		b1 = new JButton("LOGIN");
		b2 = new JButton("RESET");
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(b1);
		f.add(b2);
		f.add(l3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		f.pack();
	}
	
	public static void main(String[] args) 
	{
		new Guitest();
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		boolean filled=true;
		if(e.getSource()==b1)
		{
			if(t1.getText().equals(""))
			{
				filled = false;
				JOptionPane.showMessageDialog(t1, "ENTER USERNAME", "LOGIN CREDENTIALS", JOptionPane.WARNING_MESSAGE);
			}
			if(t2.getText().equals(""))
			{
				filled = false;
				JOptionPane.showMessageDialog(t2, "ENTER PASSWORD", "LOGIN CREDENTIALS", JOptionPane.WARNING_MESSAGE);
			}
			if(filled)
			{
					if(t1.getText().equals(u[0])&&t2.getText().equals(p[0])||t1.getText().equals(u[1])&&t2.getText().equals(p[1])||t1.getText().equals(u[2])&&t2.getText().equals(p[2])||t1.getText().equals(u[3])&&t2.getText().equals(p[3])||t1.getText().equals(u[4])&&t2.getText().equals(p[4]))
					{
						JOptionPane.showMessageDialog(l3, "LOGIN SUCCESSFUL", "WELCOME", JOptionPane.INFORMATION_MESSAGE);
					}
					 else
			          {
			              JOptionPane.showMessageDialog(l3,"CREDENTIALS MISMATCH","LOGIN CREDENTIALS",JOptionPane.WARNING_MESSAGE);
			          }
			}
		else if(e.getSource()==b2)
		{
			t1.setText("");
			t2.setText("");
			
		}
		
	}
	}
}
