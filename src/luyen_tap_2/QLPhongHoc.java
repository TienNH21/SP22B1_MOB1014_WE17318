package luyen_tap_2;

import java.util.ArrayList;
import java.util.Scanner;

public class QLPhongHoc {
    private ArrayList<PhongHoc> list = new ArrayList<PhongHoc>();
    private Scanner sc = new Scanner(System.in);
    
    public QLPhongHoc() {
        //
    }
    
    public void nhapDS() {
        System.out.println("Nhập số lượng phòng: ");
        int n = Integer.parseInt( sc.nextLine() );
        
        for (int i = 0; i < n; i++) {
            PhongHoc ph = new PhongHoc();
            ph.nhap();
            
            this.list.add(ph);
        }
    }
    
    public void xuatDS() {
        for (int i = 0; i < this.list.size(); i++) {
            PhongHoc ph = this.list.get(i);
            ph.xuat();
        }
    }
    
    public void suaTheoTen() {
        System.out.println("Nhap ten phong can sua: ");
        String name = this.sc.nextLine();
        
        int viTri = -1;
        for (int i = 0; i < this.list.size(); i++) {
            PhongHoc ph = this.list.get(i);
            if (ph.getTenPhong()
                    .equalsIgnoreCase(name) == true) {
                viTri = i;
            }
        }
        
        if (viTri == -1) {
            System.out.println("Khong tim thay!");
        } else {
            System.out.println("Nhap chieu dai: ");
            double d = Double.parseDouble( this.sc.nextLine() );
            System.out.println("Nhap chieu dai: ");
            double r = Double.parseDouble( this.sc.nextLine() );
            
            this.list.get(viTri).setChieuDai(d);
            this.list.get(viTri).setChieuRong(r);
        }
    }
    
    public void sapXepDienTich() {
        //
    }
    
    public void phongLab() {
        PhongLab pl = new PhongLab();
        pl.nhap();
        pl.xuat();
    }
}
