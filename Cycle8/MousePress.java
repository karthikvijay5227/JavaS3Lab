import java.awt.*;
import java.awt.event.*;
import javax.swing.*;  
public class MousePress extends MouseAdapter{  
	static JLabel l; 
	public void mouseClicked(MouseEvent e) {  
		l.setText("Mouse Clicked");  
	}  
	public void mouseEntered(MouseEvent e) {  
		l.setText("Mouse Entered");  
	}  
	public void mouseExited(MouseEvent e) {  
		l.setText("Mouse Exited");  
	}  
	public void mousePressed(MouseEvent e) {  
		l.setText("Mouse Pressed");  
	}  
	public void mouseReleased(MouseEvent e) {  
		l.setText("Mouse Released");  
	}  
	public static void main(String[] args) {  
		JFrame f = new JFrame("Mouse Status");
		f.setSize(300,300);  
		MousePress m = new MousePress();
		f.addMouseListener(m);
		JPanel p = new JPanel();
		l = new JLabel();
		p.add(l);
		f.add(p);
		f.setVisible(true); 
	}  
}  
