import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class App {
    public static void main(String[] args) throws Exception {
        try {
            int a, b;
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter A : ");
            a = sc.nextInt();
            System.out.print("Enter B : ");
            b = Integer.parseInt(in.readLine());
            System.out.println(a + b);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage() + " is not a numeric value");
        }
    }
}