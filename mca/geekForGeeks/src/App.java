import java.util.ArrayList;
import java.util.Collections;

class MaxMin {

    private ArrayList<Integer> arr = new ArrayList<Integer>();
    private ArrayList<Integer> res = new ArrayList<Integer>();
    private int len;

    public void addElm (Integer[] elm, int length) {
        len = length;
        
        for(int i=0; i<len; i++) {
            arr.add(elm[i]);
        }
        System.out.println(arr);
        System.out.println(arr.size());
    }
    public void calc() {
        for(int j=0; j<len/2; j++) {
            int cMax = Collections.max(arr);
            int cMin = Collections.min(arr);
            res.add(cMin);
            res.add(cMax);
            int maxIndex = arr.indexOf(cMax);
            int minIndex = arr.indexOf(cMin);
            System.out.println(maxIndex+":"+cMax+" "+minIndex+":"+cMin);
            arr.remove(maxIndex);
            arr.remove(minIndex);
        }
    }
    public void display() {
        for (int i=0; i<len; i++) {
            System.out.print(res.get(i)+" ");
        }
    }
}
public class App {
    public static void main(String[] args) {
        Integer[] data = {10,20,30,40,50,60,70,80,90,100};
        MaxMin temp = new MaxMin();
        temp.addElm(data,10);
        temp.calc();
        temp.display();
     }
}
