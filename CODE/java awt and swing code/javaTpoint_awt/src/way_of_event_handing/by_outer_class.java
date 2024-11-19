package way_of_event_handing;
import java.awt.*;  
import java.awt.event.*; 

// outer class for actionListener
class Outer implements ActionListener{  
	by_outer_class obj;  
Outer(by_outer_class obj){  
this.obj=obj;  
}  
public void actionPerformed(ActionEvent e){  
obj.tf.setText("welcome");  
}  
}  
class by_outer_class  extends Frame{  
TextField tf;  
by_outer_class (){  
//create components  
tf=new TextField();  
tf.setBounds(60,50,170,20);  
Button b=new Button("click me");  
b.setBounds(100,120,80,30);  
//register listener  
Outer o=new Outer(this);  
b.addActionListener(o);//passing outer class instance  
//add components and set size, layout and visibility  
add(b);add(tf);  
setSize(300,300);  
setLayout(null);  
setVisible(true);  
}  
public static void main(String args[]){  
new by_outer_class ();  
}  
}  
