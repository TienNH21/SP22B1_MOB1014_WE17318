package buoi10_arraylist;

import java.util.Scanner;

public class SvPoly {
    private String hoTen;
    private double diemTB;

    public SvPoly() {
    }

    public SvPoly(String hoTen, double diemTB) {
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }

    public String getHoTen() {
        return hoTen;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ tên: ");
        this.hoTen = sc.nextLine();
        System.out.println("Nhập điểm TB: ");
        this.diemTB = Double.parseDouble( sc.nextLine() );
    }
    
    public void xuat() {
        System.out.println(this.hoTen + " - " + this.diemTB);
    }
}
