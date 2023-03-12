import java.util.LinkedList;

public class LinkedListDemo {
    public static void  main(String args[]){
        LinkedList<String> obj = new LinkedList<String>();

        obj.add("PM");
        obj.add("PC");
        obj.addFirst("AC");
        obj.addLast("SKS");

        System.out.println("The elements of the list are "+ obj);

        obj.removeFirst();
        obj.removeLast();
        obj.remove("PC");

        System.out.println("The elements of the list are "+ obj);
    }
}
