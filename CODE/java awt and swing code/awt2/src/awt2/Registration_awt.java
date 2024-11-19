package awt2;

import java.awt.*;
import java.awt.event.*;


// textarea example
class Registration extends Frame implements ActionListener
{
	Label l1,l2,l3,l4;
	TextField tf1,tf2,tf3;
	TextArea ta;
	Button b;
	
	String sid="", sname="",squal="",saddr="";
	
	Registration()
	{
		this.setVisible(true);
		//this.setVisible(true);
		 this.setSize(500,500);
		 this.setTitle("user registration form  frame");
		 this.setBackground(Color.red);
		 this.setLayout(new FlowLayout());
		 
		 // addtion window close method 
		 this.addWindowListener(new WindowAdapter()
				 {
			 public void windowClosing(WindowEvent we)
			 {
				 System.exit(0);
			 }	 
				 } );
		 //preparing the GUI components
		 
		 l1=new Label("student ID");
		 l2=new Label("student name");
		 l3=new Label("student qualification");
		 l4=new Label("student address");
		 
		 tf1=new TextField(20);
		 tf2=new TextField(20);
		 tf3=new TextField(20);
		 ta=new TextArea(5,20);
		 b=new Button("ragistration");
		// addting the addlistener to the button
		 
		 b.addActionListener(this);
		 
		 // setting the font size of each and every components
		 Font f=new Font("arial",Font.BOLD,20);
		 
		 l1.setFont(f);
		 l2.setFont(f);
		 l3.setFont(f);
		 l4.setFont(f);
		 tf1.setFont(f);
		 tf2.setFont(f);
		 tf3.setFont(f);
		 ta.setFont(f);
		 b.setFont(f);
		 
		 // addting all the GUi components to frame
		 
		 this.add(l1);this.add(tf1);
		 this.add(l2);this.add(tf2);
		 this.add(l3);this.add(tf3);
		 this.add(l4);this.add(ta);
		 this.add(b);
		 
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		sid=tf1.getText();
		sname=tf2.getText();
		squal=tf3.getText();
		saddr=ta.getText();
		repaint();
		
	}
	
	public void paint(Graphics g)
	{
		Font f=new Font("arial",Font.BOLD,20);
		
		g.setFont(f);
		g.drawString("student id         :"+sid,50,300);
		g.drawString("studentname        :"+sname,50,350);
		g.drawString("student qualifiaction         :"+squal,50,400);
	//	g.drawString("student id         :"+sid,50,300);
		g.drawString("student addresh        :"+saddr,50,450);
		
	}
	
}
public class Registration_awt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Registration r=new Registration();
	}

}


