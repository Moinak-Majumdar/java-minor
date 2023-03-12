
import java.util.*;

class ArrayListDemo2 {
    public static void main(String args[]){
        ArrayList<Integer> obj = new ArrayList<Integer>();

        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);

        System.out.println("Elements of the array list are " + obj);

        //Get the array from the array list
        Integer obj2[] = new Integer[obj.size()];
        obj2 = obj.toArray(obj2);

        //GEt the sum of elements of the array
        int sum = 0;
        for(int i = 0; i <obj.size(); i++){
            sum = sum + obj2[i];
        }

        //Using for-each loop
        int sum1 = 0;
        for(int x : obj2)
            sum1 = sum1 + x;

        System.out.println("The sum of elements is " + sum);
        System.out.println("The sum of elements is " + sum1);
    }
}