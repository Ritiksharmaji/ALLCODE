package DemostractionXV_leacture_41;
import java.awt.*;
public class Creating_scroll_bar {

	Creating_scroll_bar()
	{
		Frame f=new Frame("this is for creating the scroll bar");
		Scrollbar sb=new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,100);
		sb.setBounds(100, 50,300, 50);
		//
		Scrollbar sb2=new Scrollbar(Scrollbar.VERTICAL,0,20,0,100);
		sb2.setBounds(100, 200, 50, 200);
		
		f.add(sb2); f.add(sb);
		f.show();
		f.setSize(600, 600);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Creating_scroll_bar obj=new Creating_scroll_bar();

	}

}
