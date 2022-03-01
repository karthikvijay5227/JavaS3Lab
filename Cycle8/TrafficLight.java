import java.awt.*;
import java.awt.event.*;
class TrafficLight extends Frame implements ItemListener
{
	String clr="";
	TrafficLight()
	{
		Checkbox c1,c2,c3;
		CheckboxGroup cbg=new CheckboxGroup();
		c1=new Checkbox("Red",true,cbg);
		c2=new Checkbox("Yellow",true,cbg);
		c3=new Checkbox("Green",true,cbg);
		setSize(500,500);
		setTitle("Traffic Signal");
		setVisible(true);
		setLayout(new FlowLayout(FlowLayout.CENTER));
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
	    add(c1);
		add(c2);
		add(c3);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}
	public static void main(String[] args)
	{
		new TrafficLight();
	}
	
	public void itemStateChanged(ItemEvent e)
	{
		clr=(e.getItem()).toString();
		repaint();
	}
	
	public void paint(Graphics g)
	{
		g.drawString("Traffic signals",200,250);
		g.drawRect(200,80,100,250);
		g.setColor(Color.black);
		g.fillRect(200,80,100,250);
		if(clr.equals("Red"))
		{
			g.setColor(Color.red);
			g.fillOval(225,125,50,50);
		}
		if(clr.equals("Yellow"))
		{
			g.setColor(Color.yellow);
			g.fillOval(225,175,50,50);
		}
		if(clr.equals("Green"))
		{
			g.setColor(Color.green);
			g.fillOval(225,225,50,50);
		}
		
	}
}
