package DemostractionXV_leacture_41;
import java.awt.*;
public class Creating_check_Box_group  extends Frame{
public Creating_check_Box_group()
{
	
	   CheckboxGroup cbg = new CheckboxGroup();  
       Checkbox checkBox1 = new Checkbox("C++", cbg, false);    
       checkBox1.setBounds(100,100, 50,50);    
       Checkbox checkBox2 = new Checkbox("Java", cbg, true);    
       checkBox2.setBounds(100,150, 50,50);    
       // there is compalsare to give those tree argument else it show error.
	Checkbox c3=new Checkbox("c", cbg,false);
	c3.setBounds(200, 300, 50, 50);
	//
	//adding into frame
	this.add(c3); this.add(checkBox1); this.add(checkBox2);
	
this.resize(500,500);
this.show();
this.setBackground(Color.black);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Creating_check_Box_group obj=new Creating_check_Box_group();

	}

}
