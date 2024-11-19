import java.awt.*;

class displaycontaint extends Frame
{


displaycontaint()
{

this.setVisible(true);
this.setSize(500,500);
this.setTitle("user define frame");
this.setBackground(Color.red);
}

public void paint(Graphics g)
{
Font font=new Font("arial",Font.ITALIC+Font.BOLD,36);
this.setForeground(Color.blue);
g.setFont(font);
g.drawString("ritik sharma RKJ",100,100);

}
}


class FrameExam3{

public static void main(String[] args)
{
displaycontaint frame=new displaycontaint();


}
}