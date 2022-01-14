package buoi3;

import java.util.Scanner;

public class DemoMenuPT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Chọn:");
        System.out.println("\t1. Tính phương trình bậc 1");
        System.out.println("\t2. Tính phương trình bậc 2");
        
        int chon = Integer.parseInt( sc.nextLine() );
        switch (chon) {
            case 1:
                // a * x + b = 0
                int a, b;
                a = Integer.parseInt( sc.nextLine() );
                b = Integer.parseInt( sc.nextLine() );
                
                if (a == 0) {
                    if (b == 0) {
                        System.out.println("Phương trình có vô số nghiệm");
                    } else {
                        System.out.println("Phương trình vô nghiệm");
                    }
                } else {
                    float x = (float) -b / a;
                    System.out.printf("Nghiệm x = %f\n", x);
                }
                
                break;
            case 2:
                // a * x * x + b * x + c = 0
                int a1 = Integer.parseInt( sc.nextLine() ),
                b1 = Integer.parseInt( sc.nextLine() ),
                c1 = Integer.parseInt( sc.nextLine() );
                
                float delta = (b1 * b1) - 4 * a1 * c1;
                
                if (delta < 0) {
                    System.out.println("Phương trình vô nghiệm");
                } else if (delta == 0) {
                    float x = (float) -b1 / (2 * a1);
                    System.out.printf("Nghiệm kép x = %f\n", x);
                } else {
                    float sqrtDelta = (float) Math.sqrt(delta);
                    
                    float x1 = (-b1 - sqrtDelta) / (2 * a1);
                    float x2 = (-b1 + sqrtDelta) / (2 * a1);
                    
                    System.out.printf("x1 = %f\n", x1);
                    System.out.printf("x2 = %f\n", x2);
                }
                
                break;
            default:
                System.out.println("Giá trị không hợp lệ!");
                break;
        }
    }
}
