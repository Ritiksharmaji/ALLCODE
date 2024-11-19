package java_Event_handling;
//importing AWT class  
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;    
public class TextAreaExam1  extends Frame     //we exteding frame fo window closing
{    
//constructor to initialize  
	TextAreaExam1 () {    
//creating a frame  
      Frame f = new Frame();    
//creating a text area  
          TextArea area = new TextArea("Welcome to javatpoint");    
//setting location of text area in frame  
      area.setBounds(10, 30, 300, 300);    
//adding text area to frame  
      f.add(area);  
//setting size, layout and visibility of frame    
      f.setSize(400, 400);    
      f.setLayout(null);    
      f.setVisible(true);
      
      addWindowListener(new WindowAdapter()
 	 {
 	public void windowClosing(WindowEvent we)
 	{
 	 System.exit(0);
 	}
 	 });
   }  
	
	
	 
//main method  
public static void main(String args[])    
{    
 new TextAreaExam1 ();    
}    
}  

