import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String args[]){
        //Creating an array list of String
        ArrayList<Integer> obj = new ArrayList<Integer>();

        System.out.println("Size of the the array is " + obj.size());

        obj.add(12);
        obj.add(22);
        obj.add(32);

        System.out.println("Size of the the array is " + obj.size());

        System.out.println("The elements of the array are " + obj);

        obj.remove("32");
        obj.remove(1);

        System.out.println("Size of the the array is " + obj.size());

        System.out.println("The elements of the array are " + obj);
    }
}
