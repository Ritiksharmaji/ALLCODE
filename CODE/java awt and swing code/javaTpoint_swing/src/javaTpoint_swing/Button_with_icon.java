package javaTpoint_swing;
import javax.swing.*;
public class Button_with_icon {    
	Button_with_icon (){    
JFrame f=new JFrame("Button Example");            
JButton b=new JButton(new ImageIcon("C:\\Users\\RITIK SHARMA\\OneDrive\\Pictures\\2.jpg"));    
b.setBounds(100,100,100, 40);    
f.add(b);    
f.setSize(300,400);    
f.setLayout(null);    
f.setVisible(true);    
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }         
public static void main(String[] args) {    
    new Button_with_icon ();    
}    
}    
