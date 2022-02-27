import java.awt.*;
import java.awt.event.*;
import javax.swing.*;  
public class keypress extends KeyAdapter
{  
	static JLabel l;
	static JFrame f; 
	public void keyPressed(KeyEvent e) 
	{  
		l.setText("User has pressed a key");  
	}  
	public void keyReleased(KeyEvent e) 
	{  
		l.setText("User has released the Key");  
	}  
	public void keyTyped(KeyEvent e) 
	{  
		l.setText("User is Typing");  
	}  
	public static void main(String[] args) 
	{  
		f = new JFrame("KeyPress Status");
		keypress k = new keypress();
		f.addKeyListener(k);
		l = new JLabel();
        JPanel p=new JPanel();
        p.add(l);
		f.add(p);
		f.setSize(300,300);  
		f.setVisible(true); 
	}  
}  
