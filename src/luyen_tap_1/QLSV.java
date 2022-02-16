package luyen_tap_1;

import java.util.ArrayList;
import java.util.Scanner;

public class QLSV {
    private ArrayList<SinhVien> dssv = new ArrayList<SinhVien>();
    
    public QLSV() {
    }
    
    public void nhapDS() {
        Scanner sc = new Scanner(System.in);
        System.out.println("So sinh vien can nhap: ");
        int n = Integer.parseInt( sc.nextLine() );
        
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap sinh vien thu " + (i+1));
            SinhVien sv = new SinhVien();
            sv.nhap();
            this.dssv.add(sv);
        }
    }
    
    public void xuatDS() {
        for (int i = 0; i < dssv.size(); i++) {
            SinhVien sv = this.dssv.get(i);
            sv.xuat();
        }
    }
    
    public void suaTheoMa() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma SV: ");
        String ma = sc.nextLine();
        
        for (int i = 0; i < dssv.size(); i++) {
            SinhVien sv = this.dssv.get(i);
            
            if (sv.getMaSV().equalsIgnoreCase(ma) == true) {
                System.out.println("Nhap ten sinh vien: ");
                String name = sc.nextLine();
                sv.setHoTen(name);
                
                System.out.println("Nhap diem: ");
                double diem = Double.parseDouble( sc.nextLine() );
                sv.setDiem(diem);
                
                this.dssv.set(i, sv);
            }
        }
    }
    
    public void sapXepDS() {
        //
    }
}
