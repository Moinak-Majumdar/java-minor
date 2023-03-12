import java.awt.*;
import java.applet.*;

public class test extends Applet 
{
	String sizeParam="";
	String colorParam="";
	
	public void set()
	{
		sizeParam=getParameter("size");
		colorParam=getParameter("Black");
	}
	public void display(Graphics g)
	{
		g.drawString("the size is==>"+sizeParam,50,50);
		g.drawString("the colour is==>"+colorParam,50,70);
	}
}
