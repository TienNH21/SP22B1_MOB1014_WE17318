package buoi2;

import java.util.Scanner;

public class Tong3So {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Vui lòng nhập 3 số nguyên:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int tong = a + b + c;
        System.out.println(tong);
    }
}
