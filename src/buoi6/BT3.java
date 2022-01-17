package buoi6;

import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        // 3. Nhập 5 phần tử từ bàn phím & in ra các số chẵn trong mảng
        int[] a = new int[5];
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt( sc.nextLine() );
        }
        
        System.out.println("Các số chẵn là:");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i]);
            }
        }
    }
    
    // 4. Nhập điểm thi của 5 SV cho môn MOB1014. Đếm số SV qua môn & in ra màn hình
}
