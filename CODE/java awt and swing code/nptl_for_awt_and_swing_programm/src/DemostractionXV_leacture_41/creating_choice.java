package DemostractionXV_leacture_41;
import java.awt.*;
public class creating_choice {
	creating_choice()
	{
		Frame f=new Frame("this is for choice class");
		//
		Choice c=new Choice();
		c.setBounds(100, 100, 80, 80);
		c.add("choice 1");
		c.add("choice 2");
		c.add("choice 3");
		c.add("choice 4");
		c.add("choice 5");
		c.add("choice 6");
		f.add(c);

f.show();
f.setSize(500, 500);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		creating_choice obj=new creating_choice();

	}

}
