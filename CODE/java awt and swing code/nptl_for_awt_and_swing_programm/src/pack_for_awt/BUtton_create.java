package pack_for_awt;
import java.awt.*;
public class BUtton_create {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f=new Frame("frame for panel");
		Button b=new Button();
		b.setBackground(Color.blue);
		b.setVisible(true);
		f.show();
		//b.setSize(100);
		f.resize(300,300);
		//b.setSize(50,20);
		f.add(b);
		f.setLayout(null);
		

	}

}
