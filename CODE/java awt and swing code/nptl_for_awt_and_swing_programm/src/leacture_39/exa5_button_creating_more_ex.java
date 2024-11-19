package leacture_39;
import java.awt.*;
public class exa5_button_creating_more_ex  extends Frame{

	exa5_button_creating_more_ex()
	{
Button b=new Button("click here");
		
		b.setBounds(200,100,30,500);
		b.setBackground(Color.BLUE);
		add(b);
		this.setSize(500,500);
		this.setLayout(null);
		this.setBackground(Color.GRAY);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		exa5_button_creating_more_ex nn=new exa5_button_creating_more_ex();

	}

}
