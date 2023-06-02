package fib;

public class Fibonacci {
    public void  printNo(int no) {
        int elm1= 0, elm2 =1, next;
        System.out.println("First " + no+" Fibonacci numbers : ");
        for(int i=0; i<no; i++) {
            System.out.print(elm1+", ");
            next = elm1 + elm2;
            elm1 = elm2;
            elm2 = next;
        }
    }
}
