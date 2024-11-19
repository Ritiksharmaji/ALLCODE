package javaTpoint_swing;
import javax.swing.*;  
public class example_of_Swing_by_inheritance extends JFrame{//inheriting JFrame  
JFrame f;  
example_of_Swing_by_inheritance(){  
JButton b=new JButton("click");//create button  
b.setBounds(130,100,100, 40);  
          
add(b);//adding button on frame  
setSize(400,500);  
setLayout(null);  
setVisible(true);  
}  
public static void main(String[] args) {  
new example_of_Swing_by_inheritance();  
}}  

