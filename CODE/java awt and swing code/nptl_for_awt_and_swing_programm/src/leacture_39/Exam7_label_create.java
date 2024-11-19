package leacture_39;
import java.awt.*;
public class Exam7_label_create  {

	public Exam7_label_create()
	{
		
		
		Frame f=new Frame("this is label creating example");
		
		Label l=new Label("ritik sharma");
		Label l2=new Label("bca");
		
		f.add(l2); f.add(l);
		f.resize(500,500);
		f.show();
		f.setLayout(null);
		l.setBounds(200, 100, 100, 30);
		l2.setBounds(200, 150, 100, 30);

		
		
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Exam7_label_create obj=new Exam7_label_create();
	}

}
