package AWT_Programming_II;
import java.awt.*;
public class exm_Border_layout {
	exm_Border_layout()
	{
		Frame f=new Frame("this is for Border Layout example");
		
		// creating the buttons
				Button b1=new Button ("red");
				Button  b2=new Button ("black");
				Button  b3=new Button ("blue");
				Button  b4=new Button ("sky");
				Button  b5=new Button ("white");
				Button  b6=new Button ("yellow");
				f.setBackground(Color.green);
				//
				f.add(b1,BorderLayout.NORTH);
				f.add(b2,BorderLayout.WEST);
				f.add(b3,BorderLayout.SOUTH);
				f.add(b4,BorderLayout.EAST);
				f.add(b5,BorderLayout.CENTER);
				//
				f.setSize(300,300);
				f.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new exm_Border_layout();

	}

}
