import java.util.Scanner;
public class matrix 
{
	public int[][] getData(int arg_m[][])
	{
		Scanner in = new Scanner(System.in);
		int r,c;
		r=arg_m.length;
		c=arg_m[0].length;
		int x[][]= new int[r][c];
		x=arg_m;
		
		System.out.print("\n");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print("Enter element for A["+i+"]["+j+"]==> ");
				x[i][j]=in.nextInt();
				System.out.print("\n");
			}
		}
		return x;
	}

	public void display(int arg_m[][])
	{
		int r,c;
		r=arg_m.length;
		c=arg_m[0].length;
		int x[][]= new int[r][c];
		x=arg_m;
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(x[i][j]+"   ");
			}
			System.out.print("\n");
		}
	}
	
	public int[][] transpose(int arg_m[][])
	{
		int r,c;
		r=arg_m.length;
		c=arg_m[0].length;
		//System.out.println("r="+r+"C="+c);
		int t[][]= new int[c][r];
		
		for(int i=0;i<c;i++)
		{
			for(int j=0;j<r;j++)
			{
				t[i][j]=arg_m[j][i];
			}
		}
		
		return t;
	}
}


