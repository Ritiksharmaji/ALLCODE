package container_pack;

import java.awt.Frame;
import java.awt.TextField;

public class create_frame_by_creating_object {

	create_frame_by_creating_object()
	{
		Frame f=new Frame("creating frame by extending the frame class");
		//creating the lable
		TextField l=new TextField("this is a label");
		// adding the label into frame
		f.add(l);
		// seting 
		f.setVisible(true);
		f.setSize(3000, 300);
		f.setLayout(null);
		l.setSize(303, 203);
	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
new create_frame_by_creating_object();
	}

}
