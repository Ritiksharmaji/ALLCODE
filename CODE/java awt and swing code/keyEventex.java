import java.awt.*;

import java.awt.event.*;
  class keylistener implements KeyListener
{
	public void keyPressed(KeyEvent ke)
	{
		System.out.println("key pressed:"+ke.getKeyChar());
	}
	
	public void keyReleased(KeyEvent ke)
	{
		System.out.println("key Released:"+ke.getKeyChar());
	}
	public void keyTyped(KeyEvent ke)
	{
		System.out.println("key Typed:"+ke.getKeyChar());
	}
	
// the keyEvants having only three methods.
	
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
  this.addKeyListener(new keylistener());
  }
  }



// it is for keywordevents  pro first
public class keyEventex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myframe f=new myframe();

	}

}

