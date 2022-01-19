package buoi8_lab3;

import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) { //Mở hàm main
        Lab3 bt = new Lab3();
        Scanner sc = new Scanner(System.in);
        while (true) {
            bt.menu();
            
            /*
             * sc.nextLine(): đọc cả 1 dòng -> String (chuỗi)
             * Integer.parseInt(String): ép 1 chuỗi về kiểu int
             */
            int chon = Integer.parseInt( sc.nextLine() );
            
            if (chon == 0) {
                // Nếu người dùng chọn 0 -> Thoát vòng lặp & dừng c/trình
                break;
            }
            
            switch (chon) { // Mở switch
                case 1:
                    bt.bai1();
                    break;
                    
                case 2:
                    bt.bai2();
                    break;
                    
                case 3:
                    bt.bai3();
                    break;
                    
                case 4:
                    bt.bai4();
                    break;
            } // Đóng switch
            
        }
    } // Đóng hàm main
    
    public void menu() { // Mở hàm menu
        System.out.println("Chọn:");
        System.out.println("\t1. Bài 1: Kiểm tra nguyên tố");
        System.out.println("\t2. Bài 2: Bảng cửu chương");
        System.out.println("\t3. Bài 3: Xử lý mảng");
        System.out.println("\t4. Bài 4: Xử lý mảng sinh viên");
        System.out.println("\t0. Dừng chương trình");
    } // Đóng hàm menu
    
    public void bai1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập 1 số nguyên: ");
        int n = Integer.parseInt( sc.nextLine() );
        
        boolean ktraNgTo = true;
        for (int i = 2; i < n; i++) { // Mở for
            if (n % i == 0) {
                ktraNgTo = false;
                break;
            }
        } // Đóng for
        
        if (ktraNgTo == true) {
            System.out.println("Số vừa nhập là số nguyên tố");
        } else {
            System.out.println("Số vừa nhập không là số nguyên tố");
        }
    }
    
    public void bai2() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d\n", i, j, i * j);
            }
            
            System.out.println("----------------------");
        }
    }
    
    public void bai3() {
        
    }
    
    public void bai4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng sinh viên: ");
        int n = Integer.parseInt( sc.nextLine() );
        
        String[] listTen = new String[n];
        double[] listDiem = new double[n];
        
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập họ tên sinh viên %d", i + 1);
            listTen[i] = sc.nextLine();
            System.out.printf("Nhập điểm sinh viên %d", i + 1);
            listDiem[i] = Double.parseDouble( sc.nextLine() );
        }
        
        for (int i = 0; i < n; i++) {
            String hocLuc = "";
            
            if (listDiem[i] < 5) {
                hocLuc = "Yeu";
            } else if (listDiem[i] < 6.5) {
                hocLuc = "Trung binh";
            } else if (listDiem[i] < 7.5) {
                hocLuc = "Kha";
            } else if (listDiem[i] < 9) {
                hocLuc = "Gioi";
            } else {
                hocLuc = "Xuat sac";
            }
            
            System.out.printf("%s - %f - %s\n", listTen[i], listDiem[i], hocLuc);
        }
    }
} // Đóng class Lab3
