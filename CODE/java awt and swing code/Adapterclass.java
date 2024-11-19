
import java.awt.*;
import java.awt.event.*;

 class Adapterclass1  extends WindowAdapter
{
	
	public void windowClosing(WindowEvent we)
	{
		System.out.println("window closing");
		System.exit(0);
	}
	
}
 
 class myframe extends Frame
 {


 myframe()
 {

 this.setVisible(true);
 this.setSize(500,500);
 this.setTitle("user define frame");
 this.setBackground(Color.red);
 
 // to join the  to container
 this.addWindowListener(new Adapterclass1());
 }
 }

public class Adapterclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		myframe f=new myframe();

	}

}
