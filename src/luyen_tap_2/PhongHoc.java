package luyen_tap_2;

import java.util.Scanner;

public class PhongHoc {
    private double chieuDai, chieuRong;
    private String tenPhong;

    public PhongHoc() {
    }

    public PhongHoc(double chieuDai, double chieuRong, String tenPhong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
        this.tenPhong = tenPhong;
    }
    
    public double getDienTich() {
        return this.chieuDai * this.chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }
    
    public void xuat() {
        System.out.println(
            this.tenPhong + " - " +
            this.chieuDai + " - " +
            this.chieuRong + " - " +
            this.getDienTich()
        );
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        this.tenPhong = sc.nextLine();
        System.out.println("Nhap chieu dai: ");
        this.chieuDai = Double.parseDouble( sc.nextLine() );
        System.out.println("Nhap chieu rong: ");
        this.chieuRong = Double.parseDouble( sc.nextLine() );
    }
}
