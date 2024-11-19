
import java.awt.*;
import java.awt.event.*;
 class myframe extends Frame
 {


 myframe()
 {

 this.setVisible(true);
 this.setSize(500,500);
 this.setTitle("user define frame");
 this.setBackground(Color.red);
 
 // to join the  to container
 this.addWindowListener(new WindowAdapter()
{

// no neet to extends the windowadapter

public  void windowClosing(WindowEvent we)

	{
		//System.out.println("window closing");
		System.exit(0);
	}

});
}
 }

public class Ananimas_Innerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		myframe f=new myframe();

	}

}
