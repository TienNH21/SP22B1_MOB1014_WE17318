package buoi3;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        // Nhập vào từ bàn phím 3 số nguyên.
        // Tính tổng 3 số & kiểm tra tổng có chia hết cho 10 hay không?
        // Nếu chia hết cho 10 -> In ra: Bạn đã thắng!
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int tong = a + b + c;
        
        if (tong % 10 == 0) {
            System.out.println("Bạn đã thắng!");
        }

//        if () {
//            //
//        } else if () {
//            //
//        } else {
//            //
//        }
    }
}
