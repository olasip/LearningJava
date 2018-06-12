package overriding;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Drawing extends JFrame{
	public static void main(String[] args) {
		new Drawing(); // instance
		
	}
	
	public Drawing() { // constructor
		setSize(500, 500);
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics arg0) {
		// TODO Auto-generated method stub
		// super.paint(arg0);
		
		arg0.drawRect(50, 50, 100, 25);
		arg0.setColor(new Color(0, 0, 255));
		arg0.drawOval(200, 50, 50, 50);
		
		arg0.setColor(Color.GREEN);
		arg0.fillRect(50, 200, 100, 25);
		
		arg0.setColor(Color.BLACK);
		arg0.drawString("My string", 200, 200);
		
	}

}
