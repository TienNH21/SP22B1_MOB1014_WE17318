package buoi10_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class QLSVPoly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SvPoly> dssv = new ArrayList<>();

        while (true) {
            menu();
            
            int chon = Integer.parseInt( sc.nextLine() );
            
            if (chon == 7) {
                break;
            }
            
            switch(chon) {
                case 1:
                    nhapDssv(dssv);
                    break;
                case 2:
                    xuatDs(dssv);
                    break;
                case 3:
                    xuatDSTheoDiem(dssv);
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    break;
            }
        }
    }
    
    public static void menu() {
        System.out.println("---------------------");
        System.out.println("1. Nhập danh sách SV");
        System.out.println("2. Xuất danh sách SV");
        System.out.println("3. Xuất danh sách SV theo khoảng điểm");
        System.out.println("4. Tìm SV theo họ tên");
        System.out.println("5. Sửa SV theo họ tên");
        System.out.println("6. Xóa SV theo họ tên");
        System.out.println("7. Dừng chương trình");
        System.out.println("---------------------");
    }
    
    public static void nhapDssv(ArrayList<SvPoly> dssv) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng SV: ");
        int n = Integer.parseInt( sc.nextLine() );
        
        for (int i = 0; i < n; i++) {
            SvPoly sv = new SvPoly();
            sv.nhap();
        }
    }
    
    public static void xuatDs(ArrayList<SvPoly> dssv) {
        for (SvPoly sv: dssv) {
            sv.xuat();
        }
    }
    
    public static void xuatDSTheoDiem(ArrayList<SvPoly> dssv) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập khoảng điểm dưới: ");
        double min = Double.parseDouble( sc.nextLine() );
        System.out.println("Nhập khoảng điểm trên: ");
        double max = Double.parseDouble( sc.nextLine() );
        
        for (SvPoly sv: dssv) {
            if (sv.getDiemTB() >= min && sv.getDiemTB() <= max) {
                sv.xuat();
            }
        }
    }
}
