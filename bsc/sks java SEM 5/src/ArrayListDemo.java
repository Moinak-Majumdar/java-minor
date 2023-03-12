import java.util.*;

class ArrayListDemo {
    public static void main(String args[]){
        //Creating an array list of String
        ArrayList<String> obj = new ArrayList<String>();

        System.out.println("Size of the the array is " + obj.size());

        obj.add("AC");
        obj.add("PM");
        obj.add("PC");

        System.out.println("Size of the the array is " + obj.size());

        System.out.println("The elements of the array are " + obj);

       obj.remove("PM");
        obj.remove(0);  //remove 0th element.

        System.out.println("Size of the the array is " + obj.size());

        System.out.println("The elements of the array are " + obj);
    }
}
