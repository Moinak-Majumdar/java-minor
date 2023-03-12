import java.awt.*;
import java.awt.event.*;

public class myCalculator
{
public static void main(String args[])
	{
		Frame f= new Frame("Calculator [*_*]");
		Label t1= new Label("Message :");
		Label l1= new Label("Enter Input data here :");
		Label l2=new Label();
		Label l3=new Label();
		TextField ip= new TextField();
		
		Button add= new Button("ADD (+)"); 	Button sub= new Button("SUB (-)");
		Button mul= new Button("MUL (*)");	Button div= new Button("DIV (/)");
		Button res= new Button("Calculate (=)");	Button pre=new Button("Previous Result");
		Button clr= new Button("Cleare");
		Button no7= new Button("7");	Button no8= new Button("8");	Button no9= new Button("9");
		Button no4= new Button("4");	Button no5= new Button("5");	Button no6= new Button("6");
		Button no1= new Button("1");	Button no2= new Button("2");	Button no3= new Button("3");
		Button no0= new Button("0");									Button nop= new Button(".");
		Button enter= new Button("Enter Value:");
		
		f.setSize(500,800);
		
		f.setBackground(Color.LIGHT_GRAY);
		f.setLayout(null);
		f.setVisible(true);
		t1.setBounds(50,50,100,30);		l2.setBounds(160, 50, 400, 30);
		
		l1.setBounds(50,100,130,20);	ip.setBounds(200,100,140,50); 	clr.setBounds(400,100,50,50);
		add.setBounds(20,200,100,40); 	sub.setBounds(130,200,100,40); 
		mul.setBounds(240,200,100,40);	div.setBounds(350,200,100,40);
		no7.setBounds(50,300,40,40);	no8.setBounds(100,300,40,40);	no9.setBounds(150,300,40,40);
		no4.setBounds(50,350,40,40);	no5.setBounds(100,350,40,40);	no6.setBounds(150,350,40,40);
		no1.setBounds(50,400,40,40);	no2.setBounds(100,400,40,40);	no3.setBounds(150,400,40,40);
		no0.setBounds(50,450,90,40);									nop.setBounds(150,450,40,40);
		res.setBounds(280,300,120,80);	pre.setBounds(280,400,120,80);
		enter.setBounds(50,510,190,50); l3.setBounds(250,510,250,30);
		
		f.add(t1);	f.add(l2);
		f.add(l1);	f.add(ip);	f.add(clr);
		f.add(add);	f.add(sub); f.add(mul);	f.add(div);								
		f.add(no7); f.add(no8); f.add(no9);		f.add(res);
		f.add(no4); f.add(no5); f.add(no6);
		f.add(no1); f.add(no2); f.add(no3);		f.add(pre);
		f.add(no0);				f.add(nop);
		f.add(enter);			f.add(l3);
		
		t1.setFont(new Font("Algerian", Font.ROMAN_BASELINE, 18));
		l1.setFont(new Font("Dialog", Font.BOLD, 12));
		l2.setFont(new Font("Dialog", Font.BOLD+Font.ITALIC, 15));	l2.setForeground(Color.blue);
		l3.setFont(new Font("Algerian", Font.BOLD, 15));			l3.setForeground(Color.ORANGE);
		ip.setFont(new Font("Algerian", Font.BOLD, 12));			ip.setForeground(Color.red);
		
		
		
		
		
		class enterData implements ActionListener
			{
				public int d1,d2;
				public void actionPerformed(ActionEvent e) 
					{	
						if(d1==0)
							{
								d1=Integer.parseInt(ip.getText());
								l3.setText("Sucessfully enterded :"+d1);
							}
						else
							{
								d2=Integer.parseInt(ip.getText());
								l3.setText("Sucessfully enterded :"+d2);
							}
							l2.setText("Values are :"+d1+", "+d2);
					}
				}	
			enter.addActionListener(new enterData());  	//enter_button
		
		class clrData extends enterData
		{
			d1=0;
			d2=0;
		}

	
			
	}
}
