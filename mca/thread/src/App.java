import java.lang.Runnable;

class A implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

class B implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

public class App {

    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(new A());
        Thread t2 = new Thread(new B());

        System.out.println("thread1 priority : " + t1.getPriority());
        System.out.println("thread2 priority : " + t2.getPriority());
        t1.setPriority(3);
        t2.setPriority(Thread.NORM_PRIORITY);
        System.out.println("thread1 priority : " + t1.getPriority());
        System.out.println("thread2 priority : " + t2.getPriority());
    }
}
