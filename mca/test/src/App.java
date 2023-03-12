import java.util.*;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        System.out.print("\nEnter 1st no : ");
        int no1 = sc.nextInt();
        System.out.print("\nEnter 2nd no : ");
        int no2 = sc.nextInt();
        int no3 = no1 +no2;
        sc.close();
        System.out.println("\n"+no1+" + "+no2+" = "+no3);
    }
}