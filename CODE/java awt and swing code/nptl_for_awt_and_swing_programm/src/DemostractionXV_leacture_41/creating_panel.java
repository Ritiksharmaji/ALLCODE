package DemostractionXV_leacture_41;
import java.awt.*;
public class creating_panel  extends Frame{
	creating_panel()
	{
		// panel do'nt have any    title
		Panel p=new Panel();
		this.setTitle("this is for creating the panel");
		this.show();
		this.setVisible(true);
		this.resize(500, 200);
		p.resize(100, 100);
		this.add(p);
		p.setBackground(Color.PINK);
		this.setBackground(Color.BLUE);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		creating_panel obj=new creating_panel();

	}

}
