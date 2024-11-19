package java_Event_handling;
import java.awt.*; 
import java.awt.event.*;   

/*class window extends Frame
{
	window()
	{
		this.addWindowListener(new WindowAdapter()
		{
		public void windowClosing(WindowEvent we)
		{
		System.exit(0);
		}
		});
	}
}  */
public class button_exam3 { 
	
	button_exam3()
	{
		//additing the window close
		
	}
public static void main(String[] args) {    
    // create instance of frame with the label 
	new button_exam3();
	
    Frame f = new Frame("Button Example");    
    final TextField tf=new TextField();    
    tf.setBounds(50,50, 150,20);  
    // create instance of button with label  
    Button b=new Button("Click Here");    
    // set the position for the button in frame   
    b.setBounds(50,100,60,30);   
    b.addActionListener(new ActionListener() {    
    public void actionPerformed (ActionEvent e) {  
    	if(tf!=null)
    	{
    	try {
    		
    			
    		String st=tf.getText();
    		 tf.setText("Welcome to "+st);  
    	}catch(Exception ee)
    	{
    		System.out.println(ee);
    	}
    	
    	}
    	else
    	{
    		tf.setText("plz enter some thing");
    	}
        }    
    });  
    
    
// adding button the frame  
    f.add(b);  
// adding textfield the frame  
    f.add(tf);    
// setting size, layout and visibility   
    f.setSize(400,400);    
    f.setLayout(null);    
    f.setVisible(true);     
}  

}    

