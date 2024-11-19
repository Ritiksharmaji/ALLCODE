package pack_for_awt;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class panel_class  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Frame f=new Frame("frame for panel");
		Panel p=new Panel();
		//
		f.resize(200,200);
		// we can also use size() methos here.
		f.setBackground(Color.blue);
		f.setLayout(null);
		//
		p.resize(100,100);
		p.setBackground(Color.green);
		// adding the panel into frame
		f.add(p);
		
		f.show();
		
	/* public void windowClosing(WindowEvent we)
	 {
		 System.exit(0);
	 }
		 */

	}

}
