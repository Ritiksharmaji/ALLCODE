package creating_frame_way;
import java.*;
import java.awt.Button;
import java.awt.Frame;
public class by_cerating_object {
public by_cerating_object()
{
	Frame f=new Frame("this is by creating object of frame");
	//
	   Button b = new Button("Click Me!!");  
	   //
	   f.setVisible(true);
	   f.setLayout(null);
	   f.setSize(300,400);
	   f.add(b);
	   b.setBounds(50, 50, 50, 50);
	   
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		by_cerating_object object=new by_cerating_object();
	}

}
