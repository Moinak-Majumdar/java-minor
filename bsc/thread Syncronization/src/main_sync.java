class ans 
{  
	synchronized void printAns(int n)
	{
	for(int i=1;i<=5;i++)
		{
		System.out.println(n*i);
		}
	}
}
class table5 extends Thread
{
	ans obj;
	table5(ans obj_a)
	{
		obj=obj_a;
	}
	public void run()
	{
		obj.printAns(5);
	}
}
class table10 extends Thread
{
	ans obj;
	table10(ans obj_a)
	{
		obj=obj_a;	
	}
	public void run()
	{
		obj.printAns(100);
	}
}

public class main_sync
{
	public static void main(String[] args) 
	{
		ans obj= new ans();
		table5 t1= new table5(obj);
		table10 t2 = new table10(obj); 
		System.out.println("Priority of t2="+t2.getPriority());
		System.out.println("Priority of t1="+t1.getPriority());
		t2.start();
		t1.start();
	}
}
