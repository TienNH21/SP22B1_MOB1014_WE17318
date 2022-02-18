package luyen_tap_2;

import java.util.Scanner;

public class PhongLab extends PhongHoc {
    private int soLaptop;

    public int getSoLaptop() {
        return soLaptop;
    }

    public void setSoLaptop(int soLaptop) {
        this.soLaptop = soLaptop;
    }

    public PhongLab() {
    }

    public PhongLab(int soLaptop, double chieuDai, double chieuRong, String tenPhong) {
        super(chieuDai, chieuRong, tenPhong);
        this.soLaptop = soLaptop;
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap so laptop: ");
        this.soLaptop = Integer.parseInt( sc.nextLine() );
    }
    
    public void xuat() {
        super.xuat();
        System.out.println(this.soLaptop);
    }
}
