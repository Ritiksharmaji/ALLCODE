package way_of_event_handing;
import java.awt.*;  
import java.awt.event.*;  
class  By_anonymus_class extends Frame{  
TextField tf;  
By_anonymus_class(){  
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
add(b);add(tf);  
setSize(300,300);  
setLayout(null);  
setVisible(true);  
}  
public static void main(String args[]){  
new  By_anonymus_class();  
}  
}  

