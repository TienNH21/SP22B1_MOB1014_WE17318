package buoi3;

import java.util.Scanner;

public class PtBac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = Integer.parseInt( sc.nextLine() );
        int b = Integer.parseInt( sc.nextLine() );
        
        // a * x + b = 0
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            float x = (float) -b / a;
            System.out.printf("Phương trình có nghiệm: x = %f\n", x);
        }
    }
}
