package buoi10_arraylist;

import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String[] args) {
        // Tạo 1 ArrayList lưu trữ số nguyên
        // int <==> Integer
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        
        // { 10, 20, 30, 40 }
        //   0   1   2   3
        
        System.out.println( "Phần tử có chỉ số 1: " + list.get(1) );
        list.set(2, 60);
        System.out.println( "Phần tử có chỉ số 1: " + list.get(2) );
        System.out.println( "Kích thước của ArrayList: " + list.size() );
        list.remove(0);
        System.out.println( "Kích thước của ArrayList: " + list.size() );
    }
}
