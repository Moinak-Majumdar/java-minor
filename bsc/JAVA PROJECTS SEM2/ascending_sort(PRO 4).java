import java.util.Scanner;

public class ascending_sort {

	public static void main(String args[]) {
		int count=10, temp;
    	
		 int num[] = new int[count];
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter 10 array elements==>");
        for (int i=0;i<count;i++) 
        {
            num[i] = scan.nextInt();
        }
        for (int i = 0; i < count; i++) 
        {
            for (int j = i+1;j<count;j++)
            { 
                if (num[i] > num[j]) 
                {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.println("Array Elements in Ascending Order==> ");
        for (int i=0;i<count-1;i++) 
        {
            System.out.print(num[i]+", ");
        }
        System.out.print(num[count-1]);

	}

}
