package javaTpoint_swing;
import java.awt.Color;

import javax.swing.*;
public class Button_class1 {
	Button_class1()
	{
		JFrame f=new JFrame("this is swing frame for button");
		//
		JButton b=new JButton("click here");
		b.setBounds(150, 200, 20, 15);
		f.setBackground(Color.PINK);
		f.setVisible(true);
		f.add(b);
		f.setSize(250, 200);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Button_class1();

	}

}
