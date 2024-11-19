package java_Event_handling;
import java.awt.*;  
import java.awt.event.*;  
class by_anonymous_class extends Frame{  
TextField tf;  
by_anonymous_class(){  
tf=new TextField();  
tf.setBounds(60,50,170,20);  
Button b=new Button("click me");  
b.setBounds(50,120,80,30);  
  
b.addActionListener(new ActionListener(){  
public void actionPerformed(){  
tf.setText("hello");  
}


  @Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}  
});  
//additing the window close
this.addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent we)
{
System.exit(0);
}
});
add(b);add(tf);  
setSize(300,300);  
setLayout(null);  
setVisible(true);  
}  
public static void main(String args[]){  
new by_anonymous_class();  
}  
}  
