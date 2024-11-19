package AWT_Programming_II;
import java.applet.*;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
public class exam_Gride_layout {

	exam_Gride_layout()
	{
		Frame f=new Frame("this is for flow layout");
		// creating the buttons
		Button b1=new Button ("red");
		Button  b2=new Button ("black");
		Button  b3=new Button ("blue");
		Button  b4=new Button ("sky");
		Button  b5=new Button ("white");
		Button  b6=new Button ("yellow");
		f.setBackground(Color.DARK_GRAY);
		// adding the Button to frame
		f.add(b1); f.add(b2); f.add(b3);f.add(b4);f.add(b5);f.add(b6);
		//setting flow layout of right alignment.
		f.setLayout(new GridLayout(2,3));
		
	//f.setLayout(new FlowLayout(FlowLayout.TRAILING));
		f.setSize(300,300);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new exam_Gride_layout ();

	}

}
