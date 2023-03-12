import java.awt.event.*;
import java.awt.*;

public class myButton 
{

	public static void main(String[] args)
	{
		Frame f= new Frame("MF Button");
		Label l = new Label("Welcome MF!");
		TextField t= new TextField();
		Button b=  new Button("CLICK");
		
		t.setBounds(50, 200, 200, 20);
		b.setBounds(50 , 80, 150, 50);
		l.setBounds(50,50, 100, 10);
		b.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
						{
							t.setText("The Fucking button is WORKING!!!");
						}
				});
		
		f.add(b);
		f.add(t);
		f.add(l);
		f.setSize(400,400);
		
		f.setLayout(null);
		f.setVisible(true);
	}

}
