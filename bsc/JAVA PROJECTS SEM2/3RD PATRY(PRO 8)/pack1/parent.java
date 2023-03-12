package pack1;
import java.util.Scanner;
public class parent 
{	
	public int i;
	protected int res;
	public void add()
	{
		System.out.printf("\nWe are going to add a number with 5");
		System.out.printf("\nEnter a number==>");
		Scanner sc = new Scanner(System.in);
		i=sc.nextInt();
		res=i+5;
		
	}
}
