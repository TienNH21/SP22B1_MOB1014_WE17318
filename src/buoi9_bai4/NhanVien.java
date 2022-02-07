package buoi9_bai4;

import java.util.Scanner;

public class NhanVien {
    private String hoTen;
    private String maNV;
    private int luong;
    private String phongBan;
    
    public NhanVien() {
    }
    
    public NhanVien(String hoTen, String maNV, int luong, String phongBan) {
        this.hoTen = hoTen;
        this.maNV = maNV;
        this.luong = luong;
        this.phongBan = phongBan;
    }
    
    // Getter & Setter: Hàm cho phép đọc & ghi giá trị của thuộc tính
    public String getHoTen() {
        return this.hoTen;
    }
    
    public String getMaNV() {
        return this.maNV;
    }
    
    public int getLuong() {
        return this.luong;
    }
    
    public String getPhongBan() {
        return this.phongBan;
    }
    
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    
    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }
    
    public void setLuong(int luong) {
        this.luong = luong;
    }
    
    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }
    
    public void xuat() {
        System.out.println(this.getHoTen() + " - " + this.getMaNV() + " - " + this.getLuong()
            + " - " + this.getPhongBan());
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        this.hoTen = sc.nextLine();

        System.out.print("Nhap ma nhan vien: ");
        this.maNV = sc.nextLine();

        System.out.print("Nhap luong: ");
        this.luong = Integer.parseInt( sc.nextLine() );

        System.out.print("Nhap phong ban: ");
        this.phongBan = sc.nextLine();
    }
}
