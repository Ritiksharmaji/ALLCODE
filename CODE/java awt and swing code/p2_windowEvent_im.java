
import java.awt.*;
import java.awt.event.*;
// to handle the events there are three steps 

// step-2 create the listener and implements all the methods for selected listener.
 class Windolistener  implements WindowListener
{
	public void windowOpened(WindowEvent we)
	{
		System.out.println("window opened");
	}
	public void windowClosed(WindowEvent we)
	{
		System.out.println("window closed");
	}
	public void windowClosing(WindowEvent we)
	{
		System.out.println("window closing");
		System.exit(0);
	}
	public void windowIconified(WindowEvent we)
	{
		
		System.out.println("window Iconified");
	}
	public void windowDeiconified(WindowEvent we)
	{
		
		System.out.println("window DeIconified");
	}
	public void windowActivated(WindowEvent we)
	{
		System.out.println("window Activated");
	}
	public void windowDeactivated(WindowEvent we)
	{
		System.out.println("window DeIconified");
	}
}
 // step--1 create the frame and declare all components for frame container
 class myframe extends Frame
 {


 myframe()
 {

 this.setVisible(true);
 this.setSize(500,500);
 this.setTitle("user define frame");
 this.setBackground(Color.red);
 
 //  strp --3 to join the  to container to listener
 this.addWindowListener(new Windolistener());
 }
 }

public class p2_windowEvent_im {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		myframe f=new myframe();

	}

}
