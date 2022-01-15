package buoi3;

import java.util.Scanner;

public class LT1B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = Integer.parseInt( sc.nextLine() );
        int b = Integer.parseInt( sc.nextLine() );
        int c = Integer.parseInt( sc.nextLine() );
        
        System.out.println("Chọn:");
        System.out.println("\t1. Tính tổng 3 số");
        System.out.println("\t2. Tính trung bình cộng của 3 số");
        System.out.println("\t3. Tìm giá trị nhỏ nhất trong 3 số");
        
        int chon = Integer.parseInt( sc.nextLine() );
        
        switch (chon) {
            case 1:
                int tong = a + b + c;
                System.out.println(tong);
                break;
            
            case 2:
                double tbc = (a + b + c) / 3;
                System.out.println(tbc);
                break;
                
            case 3:
                int min = a;
                
                if (min > b) {
                    min = b;
                }
                
                if (min > c) {
                    min = c;
                }
                
                System.out.println(min);
                
                break;
        }

    }
}
