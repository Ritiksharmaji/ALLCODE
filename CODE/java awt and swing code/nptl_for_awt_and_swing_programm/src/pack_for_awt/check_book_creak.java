package pack_for_awt;
import java.awt.*;
public class check_book_creak {
	
	check_book_creak()
	{
		Frame f=new Frame("frame for checkbox");
		Checkbox cb=new Checkbox("c");
		cb.setBounds(100,100,50,50);
		//
		Checkbox cb2=new Checkbox("c++",true);
		cb.setBounds(150,150,60,60);
		
		f.add(cb);
		f.add(cb2);
		
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new check_book_creak();
		

	}

}
