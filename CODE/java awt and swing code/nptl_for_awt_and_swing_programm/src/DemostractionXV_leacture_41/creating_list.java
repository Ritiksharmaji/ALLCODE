package DemostractionXV_leacture_41;
import java.awt.*;
public class creating_list{
 public creating_list()
 {
	 Frame f=new Frame("for creating the list");
	 List l=new List();
	 f.add(l);
	l.setBounds(100, 100, 75, 75); 
	 l.add("item 1");
	 l.add("item 2");
	 l.add("item 3");
	 f.show();
	 f.resize(500, 500);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		creating_list obj=new creating_list();

	}

}
