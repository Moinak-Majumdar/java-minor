package applet;
import java.awt.*;
import java.applet.*;
/*
<applet code="test1.class"width=500 hight=500>
<param name="Age" value="20">
<param name="Name" value="Moinak">
</applet>
</html>
*/ 
public class test extends Applet
{
	String Name;
	String Age;	
	
	public void display(Graphics g)
	{
		Age=getParameter("Age");
		Name=getParameter("Name");

		g.drawString("the Age is==>"+Age,50,50);
		g.drawString("the Name is==>"+Name,50,70);
	}
} 


