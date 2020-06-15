package test3;
import java.awt.Image;

import javax.swing.*;
@SuppressWarnings("serial")
public class Backgui extends JFrame
{
	public Backgui()
	{
		//frame
		setSize(1320,720);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		//background
		String filename = "img.jpg";
		ImageIcon bgi = new ImageIcon(filename);
		Image img = bgi.getImage();
		Image timg = img.getScaledInstance(1320, 720, Image.SCALE_SMOOTH);
		bgi = new ImageIcon(timg);
		JLabel bg = new JLabel("",bgi,JLabel.CENTER);
		bg.setBounds(0, 0, 1320, 720);
		add(bg); 
	}
	public static void main(String[] args) 
	{
		new Backgui();
	}

}
