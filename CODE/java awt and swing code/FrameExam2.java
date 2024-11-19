import java.awt.*;

class myframe extends Frame
{


myframe()
{

this.setVisible(true);
this.setSize(500,500);
this.setTitle("user define frame");
this.setBackground(Color.red);
}
}


class FrameExam2{

public static void main(String[] args)
{
myframe frame=new myframe();


}
}