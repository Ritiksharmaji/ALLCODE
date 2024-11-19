package window_closing;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;    
import java.awt.event.WindowListener;    
  
// class which inherits the Frame class  
public class By_implementing_WindowListener_interface extends Frame {    
// class constructor  
	By_implementing_WindowListener_interface() {    
// adding WindowListener to the Frame  
// and using the windowClosing() method of WindowAdapter class  
        addWindowListener (new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                dispose();    
            }    
        });    
// setting the size, layout and visibility of frame  
        setSize (400, 400);    
        setLayout (null);    
        setVisible (true);    
    }    
// main method  
public static void main (String[] args) {    
    new By_implementing_WindowListener_interface();    
}    
}
