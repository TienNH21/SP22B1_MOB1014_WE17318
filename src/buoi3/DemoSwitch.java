package buoi3;

import java.util.Scanner;

public class DemoSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Chọn:");
        System.out.println("\t1. Qua môn Java 1");
        System.out.println("\t2. Trượt môn Java 1");

        int chon = Integer.parseInt( sc.nextLine() );
        
        switch (chon) {
            case 1:
                // do something ...
                System.out.println("Bạn đã qua môn Java 1");
                break;
                
            case 2: 
                System.out.println("Bạn chưa qua môn Java 1");
                break;
                
            default:
                System.out.println("Vui lòng chọn 1 hoặc 2");
                break;
        }
    }
}
