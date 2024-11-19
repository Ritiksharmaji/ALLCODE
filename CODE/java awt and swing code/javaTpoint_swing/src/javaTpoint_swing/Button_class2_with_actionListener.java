package javaTpoint_swing;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Button_class2_with_actionListener  extends JFrame{
	
	Button_class2_with_actionListener()
	{
		JFrame f=new JFrame("tihs is nie");
		JButton b=new JButton();
		b.setBounds(50,100,95,30);  
		JTextField fd=new JTextField();
	    fd.setBounds(50,50, 150,20);  
		b.addActionListener( new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				fd.setText("welcome ritik");
			}
		}
		);
		
	f.add(b);
	f.add(fd);
	f.setBackground(Color.DARK_GRAY);
	f.setVisible(true);
	f.setSize(450, 450);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Button_class2_with_actionListener();

	}

}
