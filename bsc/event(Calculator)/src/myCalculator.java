import java.awt.*;
import java.awt.event.*;

public class myCalculator 
{
	public static void main(String[] args)
	{
		Frame f= new Frame("Calulator [*_*]") ;
		
		
		
		TextField t1= new TextField();
	
		Button add =new Button("Addition(+)");
		Button sub =new Button("Substruction(-)");
		Button mul =new Button("Multipliction(*)");
		Button div =new Button("Devision(/)");
		
		f.setSize(550,800);
		
		f.setBackground(Color.CYAN);
		f.setLayout(null);
		f.setVisible(true);
		
		t1.setBounds(10, 50, 450, 100);
		add.setBounds(20,180, 100, 40);
		sub.setBounds(130,180,100,40);
		mul.setBounds(240,180,100, 40);
		div.setBounds(350,180, 100, 40);
		
	
		f.add(t1);
	
		f.add(add);
		f.add(sub);
		f.add(mul);
		f.add(div);
	
		
		add.addActionListener(new ActionListener()
								{
									public void actionPerformed(ActionEvent e) 
										{	
											try
											{
												int no1=Integer.parseInt(t1.getText());
												int no2=Integer.parseInt(t1.getText());
												int ans= no1+no2;
												t1.setText("Addition Result (a+b): "+ans);
											}
											catch(Exception ex)
											{
												System.out.println("Exception :"+ex.getMessage());
											}
										}
								});
	
		
		sub.addActionListener(new ActionListener()
								{
									public void actionPerformed(ActionEvent e) 
										{	
											try
											{
												int no1=Integer.parseInt(t1.getText());
												int no2=Integer.parseInt(t1.getText());
												int ans= no1-no2;
												t1.setText("Substraction Result (a-b): "+ans);
											}
											catch(Exception ex)
											{
												System.out.println("Exception :"+ex.getMessage());
											}
										}
								});
	
		mul.addActionListener(new ActionListener()
								{
									public void actionPerformed(ActionEvent e) 
										{	
											try
											{
												int no1=Integer.parseInt(t1.getText());
												int no2=Integer.parseInt(t1.getText());
												int ans= no1*no2;
												t1.setText("Multipliction Result (a*b): "+ans);
											}
											catch(Exception ex)
											{
												System.out.println("Exception :"+ex.getMessage());
											}
										}
								});
		
		div.addActionListener(new ActionListener()
								{
									public void actionPerformed(ActionEvent e) 
										{	
											try
											{
												int no1=Integer.parseInt(t1.getText());
												int no2=Integer.parseInt(t1.getText());
												int ans= no1/no2;
												int rem= no1%no2;
												t1.setText("Devision Result (a/b): "+ans +"	Remainder (a%b):" +rem);
											
											}
											catch(Exception ex)
											{
												System.out.println("Exception :"+ex.getMessage());
											}
										}
								});
	
	}

}
