package thread_Synchronization2;
import java.util.Scanner;

class Account
{
	int bal;
	public Account(int bal)
	{ this.bal= bal;
	}
	public boolean check_Balence(int amt)
	{
		if(bal>amt)
			return true;
		else 
			return false;
	}
	public void withdarw(int amt)
	{
		bal=bal-amt;
		System.out.println("Successfully debited Rs:"+amt);
		System.out.println("Remaining Balence Rs:"+bal);
	}
}
class customer implements Runnable
{
	Account acc;
	String name;

	customer(Account acc, String n)
	{
		this.acc=acc;
		name=n;
	}
	
	public void run()
	{	
		synchronized(acc)    
		{
			Scanner sc= new Scanner(System.in);
			System.out.println(name+",Enter value to withdaw==>");
			int amt= sc.nextInt();
			
			if(acc.check_Balence(amt))
			{
				acc.withdarw(amt);
			}
			else
				System.out.println("Not Enough Balence!!");
		}
	}
}

public class main_sync {

	public static void main(String[] args) 
	{
		Account a1= new Account(1000);
		customer Moinak = new customer(a1,"Moinak");
		customer Sudipa = new customer(a1,"Sudipa");
			
		Thread t1 = new Thread(Moinak);
		Thread t2 = new Thread(Sudipa); 
		
		t1.start();
		t2.start();
	}

}
