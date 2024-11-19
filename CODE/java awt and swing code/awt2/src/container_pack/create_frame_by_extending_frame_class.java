package container_pack;
import java.awt.*;
public class create_frame_by_extending_frame_class  extends Frame{
	
	create_frame_by_extending_frame_class()
	{
		//creating the lable
				TextField l=new TextField("this is a label");
				// adding the label into frame
				this.add(l);
				// seting 
				this.setVisible(true);
				this.setSize(3000, 300);
				this.setLayout(null);
				l.setSize(100, 103);
	}

	public static void main(String[] args) {
		
		new create_frame_by_extending_frame_class();
	

	}

}
