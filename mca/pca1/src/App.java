import java.util.Scanner;

//Name : Moinak Majumdar, roll no : 24

public class App {
    public static void main(String[] args) {
        int start = 2, end;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nEnter your Roll number : ");
        end = sc.nextInt();

        System.out.println("\nPrime numbers between "+start+" to "+end+" are :\n");

        while (start < end) {
            boolean flag = false;

            for(int i = 2; i <= start/2; ++i) {
                //If current no is divisible by any other no instead of itself, then it's not a prime no.
                if(start % i == 0) {
                    flag = true;
                    break;
                }
            } //end for

            if (!flag)
                System.out.print(start + ", ");

            ++start;
        } //end while
        sc.close();
    } //end main ()
} // end class