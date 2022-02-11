package buoi10_arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class DemoCollectionsUtil {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        Collections.shuffle(list);
        
        for (Integer i: list) {
            System.out.println(i);
        }
        
        System.out.println("---------------");
        
        Collections.sort(list);
        
        for (Integer i: list) {
            System.out.println(i);
        }
        
        System.out.println("---------------");
        
        Collections.reverse(list);
        
        for (Integer i: list) {
            System.out.println(i);
        }
    }
}
