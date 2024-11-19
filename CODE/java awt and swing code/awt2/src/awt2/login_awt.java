package awt2;
import java.awt.*;
import java.awt.event.*;

class loginframe extends Frame implements  ActionListener
{
	
	Label l1, l2;
	TextField tf1,tf2;
	Button b;
	String status="";
	
	loginframe ()
	{
		this.setVisible(true);
		//this.setVisible(true);
		 this.setSize(500,500);
		 this.setTitle("user define  login frame");
		 this.setBackground(Color.red);
		 this.setLayout(new FlowLayout());
		 
		 this.addWindowListener(new WindowAdapter()
				 {
			 public void windowClosing(WindowEvent we)
			 {
				 System.exit(0);
			 }
				 });
		 // above are for frame components 
		 // create gul components below
		 l1=new Label("usre name");
		 l2=new Label("password");
		 
		 tf1=new TextField(20);
		 tf2=new TextField(20);
		 tf2.setEchoChar('*');
		 
		 b=new Button("login");
		 // adding actionListener for this button
		 
		 b.addActionListener(this);
		 
		 // define a font for gul font
		 
		 Font f=new Font("arial",Font.BOLD,25);
		 
		 l1.setFont(f);
		 l2.setFont(f);
		 tf1.setFont(f);
		 tf2.setFont(f);
		 b.setFont(f);
		 
		 // to not understand
		 
		 this.add(l1);this.add(tf1);
		 this.add(l2);this.add(tf2);
		 this.add(b);
		 
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String uname=tf1.getText();
		String upwd=tf2.getText();
		
		if(uname.equals("ritik")&& upwd.equals("123"))
		{
			status="successfully registerd";
		}
		else
		{
			status="failed";
		}
	//refer the paint 
		
		repaint();
		
	}
	
	public void paint(Graphics g)
	{
		Font f=new Font("arial",Font.BOLD,50);
		this.setForeground(Color.green);
		g.drawString("login status:"+status,50,300);
	}
	
}




public class login_awt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		loginframe loginf=new loginframe();

	}

}
