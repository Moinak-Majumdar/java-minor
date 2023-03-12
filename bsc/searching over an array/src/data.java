import java.util.*;
public class data 
{
	
	public static int arr[] = new int[10];
	
	Scanner sc =new Scanner(System.in);
	
	public void data_in()
	{
		System.out.println("Enter 10 numbers");
		for(int i=0;i<10;i++)
		{
			System.out.print("Enter data for arr["+i+"]==>");
			arr[i]=sc.nextInt();
		}
	}
	public void print()
	{
		System.out.println("Array elements are........");
		for(int i=0;i<10;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
	}
	
	public int L_scr(int e)
	{
		int i=0;
		while(i<10)
		{
			if(arr[i]==e)
				return i;
			else
				i++;
		}
		return-1;
		
	}
	
	public int B_scr(int a[],int l,int r,int e)
	{
		if(r>=1)
		{
			int mid = (l+(r-1))/2;
			
			if(a[mid]==e)
				return mid;
			if(a[mid]>e)  //left sub arr
				return B_scr(a,l,mid-1,e);
			if(a[mid]<e) //right sub arr
				return B_scr(a,mid+1,r,e);		
		}
		return -1;
	}
	
}

class main_class
{
	public static void main(String args[])
	{
		data obj= new data();
		obj.data_in();
		obj.print();
		
		int ch,no;
		Scanner in = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("\n\nPRESS 1 for Leniar_Scarch. \nPRESS 2 for Binary_Scarch. \nPRESS 3 to exit.");
			System.out.print("Enter Choice : ");
			ch=in.nextInt();
		
			switch(ch)
			{
				case 1 :
					System.out.println("\nEnter number to be Leniar_Scarch from array ==>");
					no=in.nextInt();
					int pos=obj.L_scr(no);
					if(pos==-1)
						System.out.println("Element "+no+" is not present in the array");
					else
						System.out.println("Element "+no+" found at position "+pos);
					break;
				
				case 2 :
					System.out.print("\nEnter number to be Binary_Scarch from array ==>");
					no=in.nextInt();
					int m=data.arr.length;
					int pos2=obj.B_scr(data.arr,0,m-1,no);
					if(pos2==-1)
						System.out.println("Element "+no+" is not present in the array");
					else
						System.out.println("Element "+no+" found at position "+pos2);
					break;
					
				case 3:
					System.exit(0);
				default :
					System.out.println("\nInvalid choice.. TRY AGAIN!");
					
			}
		}
	}
}