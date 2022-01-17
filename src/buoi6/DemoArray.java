package buoi6;

public class DemoArray {
    public static void main(String[] args) {
        int[] a2 = { 1, 2, 4, 5, 7 };
        //           0  1  2  3  4

        // 2. Tính trung bình cộng các phần tử của mảng.
        int tong = 0;
        for (int i = 0; i < a2.length; i++) {
            tong = tong + a2[i];
        }
        
        double tbc = (double) tong / a2.length;
        System.out.println(tbc);
                
        // 3. Nhập 5 phần tử từ bàn phím & in ra các số chẵn trong mảng
    }
}
