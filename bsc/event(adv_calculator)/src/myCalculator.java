import java.awt.*;
import java.awt.event.*;

public class myCalculator 
{
	static float pre_result=0.0f;
	public static void main(String[] args) 
	{
		Frame f= new Frame("Calculator [*_*]");
		Label t1= new Label("Message :");
		Label l_ip1= new Label("Enter Input 1st data here :");
		Label l_ip2= new Label("Enter Input 2nd data here :");
		Label l2=new Label("W_E_L_C_O_M_E");
		Label l3=new Label();
		Label l4=new Label();
		TextField ip1= new TextField();
		TextField ip2= new TextField();
		Label f_ans = new Label("ANSWER Window..");
		Label l_ans= new Label();
		
		Button add= new Button("ADD (+)"); 	Button sub= new Button("SUB (-)");
		Button mul= new Button("MUL (*)");	Button div= new Button("DIV (/)");
		Button clr= new Button("Clear all :");	Button pre=new Button("Previous Result");
	
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
		
		l_ip1.setBounds(50,100,150,20);	ip1.setBounds(210,100,100,20); 	
		l_ip2.setBounds(50,140,150,20);	ip2.setBounds(210,140,100,20); 		
		add.setBounds(20,200,100,40); 	sub.setBounds(130,200,100,40); 
		mul.setBounds(240,200,100,40);	div.setBounds(350,200,100,40);
		no7.setBounds(50,300,40,40);	no8.setBounds(100,300,40,40);	no9.setBounds(150,300,40,40);
		no4.setBounds(50,350,40,40);	no5.setBounds(100,350,40,40);	no6.setBounds(150,350,40,40);
		no1.setBounds(50,400,40,40);	no2.setBounds(100,400,40,40);	no3.setBounds(150,400,40,40);
		no0.setBounds(50,450,90,40);									nop.setBounds(150,450,40,40);
		clr.setBounds(280,300,120,80);	pre.setBounds(280,400,120,80);
		enter.setBounds(50,510,190,50); l3.setBounds(250,510,200,20);
										l4.setBounds(250,540,200,20);
		f_ans.setBounds(50,620,200,25);
		l_ans.setBounds(50,660,450,30);
		
		f.add(t1);	f.add(l2);
		f.add(l_ip1);	f.add(ip1);	
		f.add(l_ip2);	f.add(ip2);
		f.add(add);	f.add(sub); f.add(mul);	f.add(div);								
		f.add(no7); f.add(no8); f.add(no9);		f.add(clr);
		f.add(no4); f.add(no5); f.add(no6);
		f.add(no1); f.add(no2); f.add(no3);		f.add(pre);
		f.add(no0);				f.add(nop);
		f.add(enter);			f.add(l3);
								f.add(l4);
		f.add(f_ans);
		f.add(l_ans);
		
		t1.setFont(new Font("Algerian", Font.ROMAN_BASELINE, 18));
		l_ip1.setFont(new Font("Dialog", Font.BOLD, 12));
		l_ip2.setFont(new Font("Dialog", Font.BOLD, 12));
		l2.setFont(new Font("Dialog", Font.BOLD+Font.ITALIC, 15));		l2.setForeground(Color.blue);
		l3.setFont(new Font("Algerian", Font.BOLD, 15));				l3.setForeground(Color.ORANGE);
		l4.setFont(new Font("Algerian", Font.BOLD, 15));				l4.setForeground(Color.ORANGE);
		ip1.setFont(new Font("Algerian", Font.BOLD, 12));				ip1.setForeground(Color.red);
		ip2.setFont(new Font("Algerian", Font.BOLD, 12));				ip2.setForeground(Color.red);
		enter.setFont(new Font("Algerian", Font.BOLD, 15));				enter.setForeground(Color.CYAN);
		clr.setFont(new Font("Algerian", Font.BOLD, 15));				clr.setForeground(Color.red);
		f_ans.setFont(new Font("Algerian", Font.BOLD, 20));				f_ans.setForeground(Color.black);
		l_ans.setFont(new Font("Dialog", Font.BOLD+Font.ITALIC, 15));	l_ans.setForeground(Color.blue);
		pre.setFont(new Font("Algerian", Font.HANGING_BASELINE, 15));				pre.setForeground(Color.red);
		
		class enterData implements ActionListener
			{
				private int d1,d2;
				public void actionPerformed(ActionEvent e) 
					{	
								d1=Integer.parseInt(ip1.getText());
								l3.setText("Sucessfully enterded :"+d1);
								d2=Integer.parseInt(ip2.getText());
								l4.setText("Sucessfully enterded :"+d2);
							
							l2.setText("Values are :" +d1+","+d2);
					}
				}	
			enter.addActionListener(new enterData());  	//enter_button
			
			
			class Addition implements ActionListener
			{
				private float d1,d2,res;
				 public  void actionPerformed(ActionEvent e) 
				 	{
					 d1=Float.parseFloat(ip1.getText());
					 d2=Float.parseFloat(ip2.getText());
					 res=d2+d1;
					 pre_result=res;
					 l2.setText("Addition Successful");
					 l_ans.setText("The Result of Addition is ="+res);
				 	}	
			}
			add.addActionListener(new Addition());			//addition button
			
			class subtraction implements ActionListener
			{
				private float d1,d2,res;
				 public void actionPerformed(ActionEvent e) 
				 	{
					 d1=Float.parseFloat(ip1.getText());
					 d2=Float.parseFloat(ip2.getText());
					 res=d1-d2;
					 pre_result=res;
					 l2.setText("substraction Successful");
					 l_ans.setText("The Result of Substraction is ="+res);
				 	}	
			}
			sub.addActionListener(new subtraction());			// Subtraction button
			
			
			class Multiplication implements ActionListener
			{
				private float d1,d2,res;
				 public void actionPerformed(ActionEvent e) 
				 	{
					 d1=Float.parseFloat(ip1.getText());
					 d2=Float.parseFloat(ip2.getText());
					 res=d1*d2;
					 pre_result=res;
					 l2.setText("Multiplication Successful");
					 l_ans.setText("The Result of Multiplication is ="+res);
				 	}	
			}
			mul.addActionListener(new Multiplication());		//multiplication Button		
			
			
			class division implements ActionListener
			{
				private float d1,d2,res;
				
				 public void actionPerformed(ActionEvent e) 
				 {
					 d1=Float.parseFloat(ip1.getText());
					 d2=Float.parseFloat(ip2.getText());
					 res=d1/d2;
					 pre_result=res;
					 l2.setText("Division Successful");
					 l_ans.setText("The Result of Division is ="+res);
				 	}	
			}
			div.addActionListener(new division());		//division button		
			
			class clear implements ActionListener
			{
				public void actionPerformed(ActionEvent e) 
				{
					ip1.setText(null);
					ip2.setText(null);
					l2.setText("Input values are cleared");
					l3.setText("Data1 cleare");
					l4.setText("Data2 cleare");
					l_ans.setText("Answer erased");
					pre_result=Float.parseFloat(null);
				}
				
			}
			clr.addActionListener(new clear());	//Clear all button
			
			class previous implements ActionListener
			{
				public void actionPerformed(ActionEvent e)
				{
					if(pre_result==0.0f)
					{
						l_ans.setText("No Previous result");
					}
					if(pre_result==Float.parseFloat(null))
					{
						l_ans.setText("Previous result is already erased");
					}
					else {
							l_ans.setText("Previous result is :"+pre_result);
							l2.setText("Previous result is printed..");
						 }	
				}
				
			}
			pre.addActionListener(new previous());		//previous button
	} //main method end
			
} //class end
			
				


