package luyen_tap_1;

import java.util.Scanner;

public class SinhVien {
    private String hoTen;
    private String maSV;
    private double diem;

    public SinhVien() {
    }

    public SinhVien(String hoTen, String maSV, double diem) {
        this.hoTen = hoTen;
        this.maSV = maSV;
        this.diem = diem;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getMaSV() {
        return maSV;
    }

    public double getDiem() {
        return diem;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
    
    public void xuat() {
        System.out.println(
            this.hoTen +  " - " +
            this.maSV +  " - " +
            this.diem
        );
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        this.hoTen = sc.nextLine();
        System.out.println("Nhap ma: ");
        this.maSV = sc.nextLine();
        System.out.println("Nhap diem: ");
        this.diem = Double.parseDouble( sc.nextLine() );
    }
    
}
