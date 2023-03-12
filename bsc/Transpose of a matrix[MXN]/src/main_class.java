import java.util.Scanner;

public class main_class {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int r,c;
		System.out.print("Enter number of row for [A]==>");
		r=in.nextInt();
		System.out.print("Enter number of column for [A]==>");
		c=in.nextInt();
		
		int a[][] =new int[r][c];
		
		matrix obj =new matrix();
		
		a=obj.getData(a);
		System.out.print("\nThe matrix A is.... \n\n");
		obj.display(a);
		
		int a_t[][] =new int[c][r];
		
		a_t=obj.transpose(a);
		System.out.print("\nThe transpose of matrix A is.... \n\n");
		obj.display(a_t);
		

	}

}
