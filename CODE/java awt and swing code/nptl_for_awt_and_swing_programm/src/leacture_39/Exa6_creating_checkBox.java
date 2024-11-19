package leacture_39;
import java.awt.*;
public class Exa6_creating_checkBox  extends Frame{

	public Exa6_creating_checkBox()
	{
		Checkbox cb1=new Checkbox("java");
		Checkbox cb2=new Checkbox("python");
		Checkbox cb3=new Checkbox("c++",true);
		
		add(cb1);
		add(cb2);
		add(cb3);
		cb1.setBounds(100,100,50,50);
		cb2.setBounds(100,150,50,50);
		cb3.setBounds(100,200,50,50);
		setSize(500,500);
		this.setLayout(null);
		show();
		
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Exa6_creating_checkBox object=new Exa6_creating_checkBox();

	}

}
