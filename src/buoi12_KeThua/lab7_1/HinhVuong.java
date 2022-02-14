package buoi12_KeThua.lab7_1;

public class HinhVuong extends HinhChuNhat {

    public HinhVuong() {
    }

    public HinhVuong(double canh) {
        super(canh, canh);
    }
    
    public double getCanh() {
        return this.getChieuDai();
    }
    
    public void setCanh(double canh) {
        this.setChieuDai(canh);
        this.setChieuRong(canh);
    }
    
    public void xuat() {
        System.out.println(
            this.getCanh() + " - " +
            this.getChuVi() + " - " +
            this.getDienTich()
        );
    }
}
