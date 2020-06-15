package test2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Gui extends JFrame implements ActionListener
{  
    JTextField tf1,tf2,tf3;  
    JButton b1,b2;  
    public Gui()
    {  
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
        tf1=new JTextField();  
        tf1.setBounds(50,50,150,25);
        add(tf1);
        tf2=new JTextField();  
        tf2.setBounds(50,100,150,25);
        add(tf2);
        
        b1=new JButton("+");  
        b1.setBounds(50,150,50,50);
        b1.addActionListener(this); 
        add(b1);
        
        b2=new JButton("-");  
        b2.setBounds(120,150,50,50);  
        b2.addActionListener(this);  
        add(b2);  
        
        tf3=new JTextField();  
        tf3.setBounds(50,225,150,25);  
        tf3.setEditable(false);
        add(tf3);
        setSize(300,300);  
        setLayout(null);  
        setVisible(true);  
    }         
    public void actionPerformed(ActionEvent e) {  
        String s1=tf1.getText();  
        String s2=tf2.getText();  
        int a=Integer.parseInt(s1);  
        int b=Integer.parseInt(s2);  
        int c=0;  
        if(e.getSource()==b1){  
            c=a+b;  
        }else if(e.getSource()==b2){  
            c=a-b;  
        }  
        String result=String.valueOf(c);  
        tf3.setText(result);  
    }  
public static void main(String[] args) {  
    new Gui();  
} }  