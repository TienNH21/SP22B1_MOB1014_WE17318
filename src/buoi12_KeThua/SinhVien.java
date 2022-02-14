package buoi12_KeThua;

public class SinhVien {
    private String hoTen;
    private String maSV;
    private String chuyenNganh;
    private int gioiTinh;

    public SinhVien() {
    }

    public SinhVien(String hoTen, String maSV, String chuyenNganh, int gioiTinh) {
        this.hoTen = hoTen;
        this.maSV = maSV;
        this.chuyenNganh = chuyenNganh;
        this.gioiTinh = gioiTinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
    public void xuat() {
        System.out.println(
            this.hoTen + " - " +
            this.maSV + " - " +
            this.chuyenNganh + " - " + 
            this.gioiTinh
        );
    }
}
