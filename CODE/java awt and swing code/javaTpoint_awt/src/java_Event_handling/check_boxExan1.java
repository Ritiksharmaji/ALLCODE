package java_Event_handling;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;    
public class check_boxExan1 
{    
// constructor to initialize  
	check_boxExan1() {    
// creating the frame with the title  
       Frame f = new Frame("Checkbox Example");    
// creating the checkboxes  
        Checkbox checkbox1 = new Checkbox("C++");    
        checkbox1.setBounds(100, 100,  50, 50);    
        Checkbox checkbox2 = new Checkbox("Java", true);    
// setting location of checkbox in frame          
checkbox2.setBounds(100, 150,  50, 50);    
// adding checkboxes to frame  
        f.add(checkbox1);    
        f.add(checkbox2);    
  
// setting size, layout and visibility of frame  
        f.setSize(400,400);    
        f.setLayout(null);    
        f.setVisible(true);  
       
     }    
// main method  
public static void main (String args[])    
{    
    new check_boxExan1();    
}    
}    
