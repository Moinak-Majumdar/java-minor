import java.io.*;
import java.util.Scanner;

class factorial
{	
	int fact(int i)
	{	
		int res=1;
		for(int j=1;j<=i;j++)
		{
			res=res*j;
		}
		return res;
	}
}	
public class input_fact {

	public static void main(String[] args) throws Exception
	{
		factorial f = new factorial();
			
			System.out.println("//Taking input using SCANNER Class//");
			System.out.println("Enter a positive no to calculate factorial==>");
			Scanner sc =new Scanner(System.in);
			int no1 = sc.nextInt();
			
			System.out.println("Result is==>"+f.fact(no1));
		
			System.out.println("//Taking input using Buffered_Reader//");
			System.out.println("Enter a positive no to calculate factorial==>");                                                   
			InputStreamReader is =new InputStreamReader(System.in);
			BufferedReader inp = new BufferedReader (is);
			int no2= Integer.parseInt(inp.readLine()); 
			
			System.out.println("Result is==>"+f.fact(no2));
			
			System.out.println("//Taking input using Data_Input_Stream //");
			System.out.println("Enter a positive no to calculate factorial==>");
			DataInputStream di = new DataInputStream(System.in);
			int no3= Integer.parseInt(di.readLine());
			
			System.out.println("Result is==>"+f.fact(no3)); 
	}
}
