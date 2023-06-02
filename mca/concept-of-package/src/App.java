import fib.Fibonacci;
import java.util.Scanner;

public class App {
    public static void main (String args[]) {
        Fibonacci f = new Fibonacci();
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter limit : ");
        int no = sc.nextInt();
        f.printNo(no);
        sc.close();
    }
}
