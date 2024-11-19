
import java.awt.*;

import java.awt.event.*;
  class mouseclass implements MouseListener
{
	public void mouseClicked(MouseEvent me)
	{
		System.out.println("mouse clicked["+me.getX()+","+me.getY()+"]");
	}
	
	public void mousePressed(MouseEvent me)
	{
		System.out.println("mouse pressed["+me.getX()+","+me.getY()+"]");
	}
	public void mouseReleased(MouseEvent me)
	{
		System.out.println("mouse Released["+me.getX()+","+me.getY()+"]");
	}
	public void mouseEntered(MouseEvent me)
	{
		System.out.println("mouse Entered["+me.getX()+","+me.getY()+"]");
	}
	public void mouseExited(MouseEvent me)
	{
		System.out.println("mouse Exited["+me.getX()+","+me.getY()+"]");
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
  this.addMouseListener(new mouseclass());
  }
  }









// it is for mouseEvent  pro first
public class mauselistener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myframe f=new myframe();

	}

}
