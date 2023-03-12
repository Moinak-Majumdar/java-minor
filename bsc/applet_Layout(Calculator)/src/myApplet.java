import java.applet.Applet;
import java.awt.*;
/* <applet code= "myApplet" width= 500 height= 300> </applet> */
public class myApplet extends Applet
{
	
	Label l1,l2;
	TextField t1,t2;
	Button b1,b2,b3,b4;
	private LayoutManager NULL;
	
	public  void init()
	{
		l1=new Label("Enter First No ==>");
		l2=new Label("Enter Second No ==>");
		t1= new TextField();
		t2= new TextField();
		b1= new Button("Add");
		b2= new Button("Sub");
		b3= new Button("Mul");
		b4= new Button("Div");
		
		setLayout(NULL);
		
		l1.setBounds(50,80,150,20);
		l2.setBounds(50,100,150,20);
		t1.setBounds(180,80,100,20);
		t2.setBounds(180,100,100,20);
		b1.setBounds(40,140,50,20);
		b2.setBounds(110,140,50,20);
		b3.setBounds(180,140,50,20);
		b4.setBounds(250,140,50,20);
		
		add(l1);
		add(l2);
		add(t1);
		add(t2);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
	}

	
}
