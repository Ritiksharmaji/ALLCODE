package java_Event_handling;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener; 
public class button_ex1 extends Frame  { 
	
	button_ex1()
	{
		
		// create instance of frame with the label   
	    Frame f = new Frame("Button Example");  
	    
	 // create instance of button with label  
	    Button b = new Button("Click Here");   
	  
	    // set the position for the button in frame   
	    b.setBounds(50,100,80,30);    
	  
	    // add button to the frame  
	    f.add(b);    
	    // set size, layout and visibility of frame  
	    f.setSize(400,400);    
	    f.setLayout(null);    
	    f.setVisible(true); 
		 // and using the windowClosing() method of WindowAdapter class  
	    this.addWindowListener(new WindowAdapter()
	    {
	    public void windowClosing(WindowEvent we)
	    {
	    System.exit(0);
	    }
	    });
	    }
	
//private void addWindowListener(WindowAdapter windowAdapter) {
		// TODO Auto-generated method stub
		
	//}
public static void main (String[] args) {   
  
    
    
    new button_ex1();
  
     
    

}    
}    
