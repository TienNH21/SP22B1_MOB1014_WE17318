package luyen_tap_1;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLSV qlsv = new QLSV();
        while (true) {
            System.out.println("===============");
            System.out.println("Chọn:");
            System.out.println("\t1. Dừng chương trình");
            System.out.println("\t2. Nhập danh sách SV");
            System.out.println("\t3. Xuất danh sách SV");
            System.out.println("\t4. Sửa SV theo mã");
            System.out.println("\t5. Sắp xếp DSSV theo điểm");
            System.out.println("===============");
            
            int chon = Integer.parseInt( sc.nextLine() );
            
            if (chon == 1) {
                break ;
            }
            
            switch (chon) {
                case 2:
                    qlsv.nhapDS();
                    break;
                case 3:
                    qlsv.xuatDS();
                    break;
                case 4:
                    qlsv.suaTheoMa();
                    break;
                case 5:
                    qlsv.sapXepDS();
                    break;
                default:
                    break;
            }
        }
    }
}
