package java_Event_handling;
//importing AWT class  
import java.awt.*;
import java.awt.Window;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter; 


class Windolistener1  extends WindowAdapter
{
	
	
	
	
}
public class Text_fieldExam1 extends WindowAdapter  implements ActionListener{  
 // main method  
	
	
 public static void main(String args[]) {    
 // creating a frame  
 Frame f = new Frame("TextField Example");    

 // creating objects of textfield  
 TextField t1, t2;    
 // instantiating the textfield objects  
 // setting the location of those objects in the frame  
 t1 = new TextField("Welcome to Javatpoint.");    
 t1.setBounds(50, 100, 200, 30);    
 t2 = new TextField("AWT Tutorial");    
 t2.setBounds(50, 150, 200, 30);    
 // adding the components to frame  
 f.add(t1);  
 f.add(t2);   
 // setting size, layout and visibility of frame   
 f.setSize(400,400);    
 f.setLayout(null);    
 f.setVisible(true);   
 
 
 
}



@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}



 
}    

