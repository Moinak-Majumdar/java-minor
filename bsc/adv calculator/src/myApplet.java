import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/* <applet code= "myApplet" width= 500 height= 300> /applet> */
public class myApplet extends Applet
{
	
	
	Label l1,l2,ans;
	TextField t1,t2;
	Button b1,b2,b3,b4;
	

	Frame f= new Frame("new frame");
	{
	
			l1=new Label("Enter First no==>");
			l2=new Label("Enter Second No ==>");
			ans= new Label();
			t1= new TextField();
			t2= new TextField();
			b1= new Button("Add");
			b2= new Button("Sub");
			b3= new Button("Mul");
			b4= new Button("Div");
			
			
			f.setLayout(null);
			
			l1.setBounds(50,80,150,20);
			l2.setBounds(50,100,150,20);
			t1.setBounds(180,80,100,20);
			t2.setBounds(180,100,100,20);
			b1.setBounds(40,140,50,20);
			b2.setBounds(110,140,50,20);
			b3.setBounds(180,140,50,20);
			b4.setBounds(250,140,50,20);
			ans.setBounds(150,180,100,20);
			
			
			int no1=Integer.parseInt(t1.getText());
			int no2=Integer.parseInt(t2.getText());
			
			class add implements ActionListener
			{	
				public void actionPerformed(ActionEvent e) 
				{
					int no1=Integer.parseInt(t1.getText());
					int no2=Integer.parseInt(t2.getText());
					int res;
					res= no1+no2;
					ans.setText("The Result of Additon is :"+res);
				}
			} 
			
			f.add(l1);
			f.add(l2);
			f.add(t1);
			f.add(t2);
			f.add(b1);
			f.add(b2);
			f.add(b3);
			f.add(b4);
			f.add(ans);
		
			b1.addActionListener(new add());
			}		 

}