package buoi2;

import java.util.Scanner;

public class DemoMath {
    public static void main(String[] args) {
        // Nhập 2 số thực a và b từ bàn phím
        // Tính và xuất a lũy b, giá trị nhỏ nhất của 2 số

//        double d = Math.random() * 100;
//        int i = (int) Math.ceil(d);
//        int a = i % 8;
//        // a: 0 -> 7
//        int b = a + 5;
//        // b = a + 5 -> b: 5 -> 12
//
//        System.out.println(b);

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 2 số thực:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double kq = Math.pow(a, b);
        double min = Math.min(a, b);
        
        System.out.printf("a^b = %f\n", kq);
        System.out.printf("Min = %f\n", min);
    }
}
