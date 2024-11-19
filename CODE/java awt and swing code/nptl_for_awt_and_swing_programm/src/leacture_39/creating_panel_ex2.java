package leacture_39;
import java.awt.*;
public class creating_panel_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f=new Frame("this is for panel example");
		//seting the size for the frame.
		f.resize(500,500);
		// to display the frame
		f.show();
		f.setLayout(null);
		//object creating the Panel
		Panel p=new Panel();
		//adding the Panel into frame
		f.add(p);
		//setting the size of Panel
		p.resize(100,50);
		f.setBackground(Color.green);
		p.setBackground(Color.BLUE);

	}

}
