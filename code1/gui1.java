package gui;
import java.awt.*;
import java.awt.event.*;
class Myclass extends WindowAdapter
{
	public void windowclosing(WindowEvent e)
	{
		System.exit(0);
	}
}
public class Myframe1 extends Frame{
public void paint(Graphics g)
{
	g.setColor(Color.RED);
	g.fillRect(300,100, 200, 200);
	g.setColor(Color.blue);
	g.fillRect(40,40, 200, 200);
	g.setColor(Color.GREEN);
	g.fillOval(50,60,80,80);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Myframe1 f=new Myframe1();
f.setTitle("MYFRAME");
	f.setSize(800,500);
	f.setVisible(true);
	f.setBackground(Color.YELLOW);
	f.addWindowListener(new Myclass());
	}
}
