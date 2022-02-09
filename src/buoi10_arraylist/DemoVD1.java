package buoi10_arraylist;

import java.util.ArrayList;

public class DemoVD1 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add("Cường");
        a.add("Tuấn");
        a.add("Phương");
        a.add("Hồng");
        a.add(1, "Hạnh");
        
        a.set(0, "Tèo");
        a.remove(3);
        a.remove("Phương");
        
        // Duyệt chỉ số
        for (int i = 0; i < a.size(); i++) {
            String s = a.get(i);
            System.out.println(s);
        }
        
        System.out.println("------------------");
        
        // Duyệt theo giá trị
        for (String s: a) {
            System.out.println(s);
        }
        
        int x = a.size() - a.indexOf("Phương");
        System.out.println(x);
    }
}
