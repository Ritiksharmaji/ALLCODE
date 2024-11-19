package awt2;
import java.awt.*;
//import java.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class colorFrame extends Frame implements ActionListener
{
	Button b1,b2,b3;
	
	colorFrame()
	{
		this.setVisible(true);
		//this.setVisible(true);
		 this.setSize(500,500);
		 this.setTitle("user define frame");
		// this.setBackground(Color.red);
		 this.setLayout(new FlowLayout());
		 
		 b1=new Button("Red");
		 b2=new Button("green");
		 b3=new Button("blue");
		 
		 b1.setBackground(Color.red);
		 b2.setBackground(Color.green);
		 b3.setBackground(Color.blue);
		 
		 // addingg Actionlistener to those button
		 
		 b1.addActionListener(this);
		 b2.addActionListener(this);
		 b3.addActionListener(this);
		 // addting three button to frame
		 
		 this.add(b1);
		 this.add(b2);
		 this.add(b3);
		 
	}
// implementation fro Action performed method

public void actionPerfromed(ActionEvent ae)
{
	String button_lable1=ae.getActionCommand();
	if(button_lable1.equals("Red"));
	{
		this.setBackground(Color.red);
	}
	if(button_lable1.equals("green"));
	{
		this.setBackground(Color.green);
	}
	if(button_lable1.equals("blue"));
	{
		this.setBackground(Color.blue);
	}
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}
public class Layout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		colorFrame f=new colorFrame();

	}

}
