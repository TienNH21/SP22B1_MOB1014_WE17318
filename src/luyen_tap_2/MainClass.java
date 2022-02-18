package luyen_tap_2;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        QLPhongHoc ql = new QLPhongHoc();
        
        while (true) {
            System.out.println("=========================");
            System.out.println("Chọn: ");
            System.out.println("1. Dừng chương trình");
            System.out.println("2. Nhập danh sách phòng");
            System.out.println("3. Xuất danh sách phòng");
            System.out.println("4. Sửa phòng theo tên");
            System.out.println("5. Sắp xếp theo diện tích");
            System.out.println("6. Phòng Lab");
            System.out.println("=========================");
            
            Scanner sc = new Scanner(System.in);
            int chon = Integer.parseInt( sc.nextLine() );
            
            if (chon == 1) {
                break;
            }
            
            switch (chon) {
                case 2:
                    ql.nhapDS();
                    break;
                case 3:
                    ql.xuatDS();
                    break;
                case 4:
                    ql.suaTheoTen();
                    break;
                case 5:
                    ql.sapXepDienTich();
                    break;
                case 6:
                    ql.phongLab();
                    break;
                default:
                    break;
            }
        }
    }
}
