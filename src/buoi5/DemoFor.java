package buoi5;

public class DemoFor {
    public static void main(String[] args) {
//        int i1 = 1;
//        while (i1 <= 10) {
//            System.out.println(i1);
//            i1++;
//        }
        
        
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//        }
        
        // BT: Tính tổng số lẻ trong khoảng 0 -> 20
        int tong = 0;
        for (int i = 0; i <= 20; i++) {
            if ( i % 2 == 1 ) {
                tong = tong + i;
            }
        }
        
        System.out.println(tong);
    }
}
