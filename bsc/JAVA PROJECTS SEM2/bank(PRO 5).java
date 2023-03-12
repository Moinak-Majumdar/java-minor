import java.util.Scanner;

class info
{
	String name[] = new String[10];
	int acc_no[]=new int[10];
	int bal[]=new int[10];
	int count=10;
	void getData()
	{
		for(int i=1;i<=count;i++)
			{
				System.out.println("Enter details for use ("+i+")...");
				System.out.println("Enter name==>");
				Scanner scan = new Scanner(System.in);
				name[i]=scan.nextLine();
				System.out.println("Enter Account Number ==>");
				acc_no[i]= scan.nextInt();
				System.out.println("Enter Balance==>");
				bal[i]=scan.nextInt();
			}
	}
	void show()
	{
		int j=1;
		System.out.println("Member with lass than 1000 balane are....");
		while(j<=count)
		{
			if(bal[j]<1000)
			{
				System.out.println("Name          -->"+name[j]);
				System.out.println("Account Number-->"+acc_no[j]);
				System.out.println("Balance       -->"+bal[j]);
			}
			j++;
		}
	}	
}
public class bank
{
	public static void main(String[] args) 
	{
		info obj= new info();
		obj.getData();
		obj.show();
	}
}