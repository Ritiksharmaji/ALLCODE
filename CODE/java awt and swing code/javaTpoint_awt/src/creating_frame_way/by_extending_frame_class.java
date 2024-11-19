package creating_frame_way;
import java.awt.*;

public class by_extending_frame_class  extends Frame{
public by_extending_frame_class ()
{
	 // creating a button   
	   Button b = new Button("Click Me!!");  

	   // setting button position on screen  
	   b.setBounds(30,100,80,30);   //The setBounds(int x-axis, int y-axis, int width, int height) 

	   // adding button into frame    
	  this. add(b);  

	   // frame size 300 width and 300 height    
	  this. setSize(300,300);  

	   // setting the title of Frame  
	   setTitle("This is our basic AWT example");   
	       
	   // no layout manager   
	   setLayout(null);   

	   // now frame will be visible, by default it is not visible    
	   setVisible(true);  
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		by_extending_frame_class fp=new by_extending_frame_class();

	}

}
