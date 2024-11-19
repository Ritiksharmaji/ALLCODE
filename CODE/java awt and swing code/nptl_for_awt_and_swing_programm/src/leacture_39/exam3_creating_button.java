package leacture_39;
import java.awt.*;
public class exam3_creating_button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Frame f=new Frame("this is for creating the button ");
		Button b=new Button("submit!");
		f.setVisible(true);
		//f.show();
		
		f.setSize(500,500);
		//f.resize(500,500):
		f.setLayout(null);
		f.setBackground(Color.BLACK);
		f.add(b);
		//setting the size of button
		b.setBounds(30, 30, 30, 50);

	}

}
